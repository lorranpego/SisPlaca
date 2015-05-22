/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.awt.image.WritableRaster;
import java.awt.image.renderable.ParameterBlock;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.media.jai.JAI;
import javax.media.jai.KernelJAI;
import javax.media.jai.PlanarImage;
import javax.media.jai.iterator.RandomIter;
import javax.media.jai.iterator.RandomIterFactory;
import joone.RedeNeural;
import joone.TipoCaractere;
import ocr.CharacterExtractor;

/**
 *
 * @author lorran
 */
public class Placa {
    
    private static final String OUTPUT_FOLDER = "./output";
    
    public static String reconhecePlaca(String _placa) throws IOException{
		System.setProperty("com.sun.media.jai.disableMediaLib", "true");
		System.setProperty("com.sun.media.imageio.disableCodecLib", "true");

		String placa = _placa;

                PlanarImage imagemOriginal = JAI.create("fileload", placa);
		float[] kernelMatrix = { 1 / 25, 1 / 25, 1 / 25, 1 / 25, 1 / 25, 1 / 25, 1 / 25, 1 / 25, 1 / 25, 1 / 25, 1 / 25, 1 / 25, 1 / 25, 1 / 25, 1 / 25, 1 / 25, 1 / 25, 1 / 25,
				1 / 25, 1 / 25, 1 / 25, 1 / 25, 1 / 25, 1 / 25, 1 / 25 };

		KernelJAI kernel = new KernelJAI(5, 5, kernelMatrix);

		List<RenderedImage> images = new ArrayList<>();

		// TOP-HAT fechamento
		PlanarImage dilatadaFechamento = JAI.create("dilate", imagemOriginal, kernel);

                File f = new File(placa);
		BufferedImage imagem = ImageIO.read(f);
		RandomIter iterator = RandomIterFactory.create(dilatadaFechamento, null);

		int width = imagem.getWidth();
		int height = imagem.getHeight();

		BufferedImage saida = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_GRAY);
		WritableRaster raster = saida.getRaster();

		int[] pixel = new int[3];
		int[] corSaida = new int[3];
		for (int h = 0; h < height; h++) {
			for (int w = 0; w < width; w++) {
				iterator.getPixel(w, h, pixel);

				int valorPixel = 0 + pixel[0];
				corSaida[0] = valorPixel;
				corSaida[1] = valorPixel;
				corSaida[2] = valorPixel;

				raster.setPixel(w, h, corSaida);
			}
		}

		ParameterBlock pb = new ParameterBlock();
		pb.addSource(saida);
		pb.add(127.0);
		PlanarImage binarizada = JAI.create("binarize", pb);

		

		// o algoritmo ocr se perde se a imagem tem bordas.
		// realizando um CROP(recorte) na imagem binarizada para retirar as
		// borda.
		ParameterBlock cropPB = new ParameterBlock();
		cropPB.addSource(binarizada);
		cropPB.add(5.0f); // x inicial
		cropPB.add(5.0f); // y inicial
		cropPB.add(binarizada.getWidth() - 10f); // expansão em x
		cropPB.add(binarizada.getHeight() - 30f); // expansão em y
		PlanarImage binarizadaSemBordas = JAI.create("crop", cropPB);
		// TODO: encontrar umas forma melhor

		// adicionando todas as imagens na lista pra ver as diferenças
		images.add(imagemOriginal);
//		images.add(erodidaAbertura);
//		images.add(dilatadaAbertura);
//		images.add(aberturaTopHat);
		images.add(dilatadaFechamento);
//		images.add(erodidaFechamento);
//		images.add(fechamentoTopHat);
		images.add(binarizada);
		images.add(binarizadaSemBordas);

		// efetuando a identificação dos caracteres na imagem binarizada
		CharacterExtractor charExtractor = new CharacterExtractor();
		List<BufferedImage> slices = charExtractor.slice(binarizadaSemBordas.getAsBufferedImage(), 16, 20);
                
		// gravando a saída
		// deletando os arquivos do output
		File file = new File(OUTPUT_FOLDER);
		File files[] = file.listFiles();
		for(File fil: files)
			fil.delete();
		// gravando novamente a saida		
		for (int i = 0; i < slices.size(); i++) {
			File outputfile = new File(OUTPUT_FOLDER + File.separator + "char_" + i + ".png");
			outputfile.mkdir();
			ImageIO.write(slices.get(i), "png", outputfile);
		}

		return escrevePlaca();
	}

	private static String escrevePlaca() {
		String placa = "";
		RedeNeural rn = new RedeNeural();
		// conta caracteres gerados
		File file = new File(OUTPUT_FOLDER);
		File files[] = file.listFiles();
		int qtdLetras = 0;
		for (File fi : files)
			if (fi.getName().startsWith("char_"))
				qtdLetras++;

		TipoCaractere tipoChar = null;
		for (int i = 0; i < qtdLetras; i++) {
			// se nao gerou o traco
			if (qtdLetras == 7) {
				if (i < 3) {
					tipoChar = TipoCaractere.LETRA;
				} else {
					tipoChar = TipoCaractere.NUMERO;
				}
				placa += rn.testar(getLetraMatrizParaRedeNeural(geraMatriz("char_" + i + ".png")), tipoChar);
			} else {
				// se gerou o traco, disconsiderar
				if (i < 3) {
					tipoChar = TipoCaractere.LETRA;
				} else if (i == 3) {
					tipoChar = TipoCaractere.ESPECIAL;
				} else {
					tipoChar = TipoCaractere.NUMERO;
				}

				placa += rn.testar(getLetraMatrizParaRedeNeural(geraMatriz("char_" + i + ".png")), tipoChar);

			}
//			System.out.println("\n\n\n");
		}
//		System.out.println("A placa lida foi: " + placa);
                return placa;
	}

	private static int[][] geraMatriz(String img) {
		PlanarImage letra = JAI.create("fileload", "output" + File.separator + img);
		int bloqueioBranco = 250;
		int width = letra.getWidth();
		int height = letra.getHeight();
		RandomIter iterator = RandomIterFactory.create(letra, null);
		int[][] letraMatriz = new int[width][height];
		int[] pixel = new int[3];
		for (int h = 1; h < height - 1; h++) {
			for (int w = 1; w < width - 1; w++) {
				iterator.getPixel(w, h, pixel);
				// System.out.println("R: " + pixel[0] + " G: " + pixel[1] +
				// " B: " + pixel[2]);
				if (pixel[0] >= bloqueioBranco && pixel[1] >= bloqueioBranco && pixel[2] >= bloqueioBranco) {
					letraMatriz[w][h] = 0;
				} else {
					letraMatriz[w][h] = 1;
				}
			}
		}
//		imprimeLetraMatriz(letraMatriz);
		return letraMatriz;
	}

	private static void imprimeLetraMatriz(int[][] letraMatriz) {
		int width = letraMatriz.length;
		int height = letraMatriz[0].length;
		for (int h = 0; h < height; h++) {
			for (int w = 0; w < width; w++) {
                            System.out.print(letraMatriz[w][h]);
			}
			System.out.println();
		}
	}

	private static String getLetraMatrizParaRedeNeural(int[][] letraMatriz) {
		int width = letraMatriz.length;
		int height = letraMatriz[0].length;
		StringBuilder sb = new StringBuilder();
		for (int h = 0; h < height; h++) {
			for (int w = 0; w < width; w++) {
				sb.append(letraMatriz[w][h] + ";");
			}
		}
		return sb.toString();
	}
    
}
