package joone;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Serializable;

public class RedeNeural implements Serializable {

	private static final long serialVersionUID = 5732962760602163835L;
	private String trainingFile = "redeneural" + File.separator + "txt" + File.separator + "training.txt";
	private String errorFile = "redeneural" + File.separator + "txt" + File.separator + "error.txt";
	private String interrogateFile = "redeneural" + File.separator + "txt" + File.separator + "interrogate.txt";
	private String resultFile = "redeneural" + File.separator + "txt" + File.separator + "result.txt";
	private String ocrSerializable = "redeneural" + File.separator + "txt" + File.separator + "ocr.ser";
	private JooneOCR ocr;
	private String inputSelector = "1-320";
	private String desiredSelector = "321-357";
	private int ciclesTraining = 1000;
	private int inNeurons = 320;
	private int hiddenNeurons = 130;
	private int outNeurons = 37;
	private Alfabeto alfabeto = new Alfabeto();

	public void gerarArquivoTreino() {
		try {
			File f = new File(trainingFile);
			f.delete();
			BufferedWriter br = new BufferedWriter(new FileWriter(trainingFile, true));
			br.append(alfabeto.getTreino());
			// br.newLine();
			br.close();
		} catch (IOException e) {
			System.out.println("Exceção no método gravarNumero(): " + e.getMessage());
		}
	}

	public void treinar() {
		ocr = new JooneOCR(trainingFile, errorFile, interrogateFile, resultFile);
		ocr.initNeuralNet(inNeurons, hiddenNeurons, outNeurons);
		ocr.train(inputSelector, desiredSelector, trainingPatterns(), ciclesTraining);
		ocr.saveNeuralNet(ocrSerializable, ocr);
	}

	private int trainingPatterns() {
		int trainingPatterns = 0;
		try {
			BufferedReader reader = new BufferedReader(new FileReader(trainingFile));
			while (reader.ready()) {
				reader.readLine();
				trainingPatterns++;
			}
		} catch (IOException e) {
			System.out.println("Exceção no método trainingPatterns(): " + e.getMessage());
		}
		return trainingPatterns;
	}

	public String testar(String charMatriz, TipoCaractere tipo) {
		try {
			PrintStream printer = new PrintStream(new FileOutputStream(interrogateFile));
			printer.println(charMatriz);
			printer.close();
		} catch (IOException e) {
			System.out.println("Exceção no metodo testar: " + e.getMessage());
		}
		JooneOCR joo = JooneOCR.restoreNeuralNet(ocrSerializable);
		joo.interrogate(inputSelector);

		//System.out.println("O caractere lido é: " + this.alfabeto.getLetraIndex(joo.caractereIndex(tipo)).toUpperCase());;
		return this.alfabeto.getLetraIndex(joo.caractereIndex(tipo)).toUpperCase();
	}

	public static void main(String[] args) {
		RedeNeural rn = new RedeNeural();
		rn.gerarArquivoTreino();
		rn.treinar();
	}
}
