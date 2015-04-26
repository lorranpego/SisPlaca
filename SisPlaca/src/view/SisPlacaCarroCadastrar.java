/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Control;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.Timer;
import model.Carro;
import model.Proprietario;

/**
 *
 * @author alunolab04
 */
public class SisPlacaCarroCadastrar extends javax.swing.JFrame {
    
    Control control;
    byte[] fotoCarro = null;
    /**
     * Creates new form SisPlacaUsuarioCadastrar
     * @param _control
     */
    public SisPlacaCarroCadastrar(Control _control) {
        control = _control;
        //Reseta carro antes de comecar cadastro de novo carro.
        Control.carroControl.resetaCarro();
        
        initComponents();
        
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
    }
    
    /**
     * Fecha janela.
     */
    private void fecha(){
        this.dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        LbPlaca = new javax.swing.JLabel();
        BtSalvar = new javax.swing.JButton();
        TxPlaca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        LbMarca = new javax.swing.JLabel();
        LbModelo = new javax.swing.JLabel();
        TxMarca = new javax.swing.JTextField();
        TxModelo = new javax.swing.JTextField();
        LbCor = new javax.swing.JLabel();
        TxCor = new javax.swing.JTextField();
        LbMensagem = new java.awt.Label();
        BtCancelar = new javax.swing.JButton();
        BtImagem = new java.awt.Button();
        LbFoto = new javax.swing.JLabel();
        foto = new javax.swing.JLabel();
        BtAddProprietarios = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        PanelProprietarios = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SisPlaca - Cadastrar Usuário");

        LbPlaca.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LbPlaca.setText("PLACA *");

        BtSalvar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtSalvar.setText("SALVAR");
        BtSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSalvarActionPerformed(evt);
            }
        });

        TxPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxPlacaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("CADASTRAR CARRO");

        LbMarca.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LbMarca.setText("MARCA *");

        LbModelo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LbModelo.setText("MODELO *");

        TxMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxMarcaActionPerformed(evt);
            }
        });

        TxModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxModeloActionPerformed(evt);
            }
        });

        LbCor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LbCor.setText("COR *");

        TxCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxCorActionPerformed(evt);
            }
        });

        LbMensagem.setAlignment(java.awt.Label.CENTER);
        LbMensagem.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        LbMensagem.setForeground(new java.awt.Color(255, 0, 0));
        LbMensagem.setText(" ");

        BtCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtCancelar.setText("CANCELAR");
        BtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCancelarActionPerformed(evt);
            }
        });

        BtImagem.setActionCommand("imageSelect");
        BtImagem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtImagem.setLabel("SELECIONAR IMAGEM");
        BtImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtImagemActionPerformed(evt);
            }
        });

        LbFoto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LbFoto.setText("FOTO *");

        BtAddProprietarios.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtAddProprietarios.setText("ADICIONAR PROPRIETÁRIO");
        BtAddProprietarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAddProprietariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelProprietariosLayout = new javax.swing.GroupLayout(PanelProprietarios);
        PanelProprietarios.setLayout(PanelProprietariosLayout);
        PanelProprietariosLayout.setHorizontalGroup(
            PanelProprietariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanelProprietariosLayout.setVerticalGroup(
            PanelProprietariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 185, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(PanelProprietarios);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtCancelar))
                            .addComponent(LbMensagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(54, 54, 54))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(foto, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LbFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BtImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 91, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(LbPlaca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxPlaca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                    .addComponent(LbCor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxCor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LbModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BtAddProprietarios))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1)))
                        .addGap(46, 46, 46))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LbPlaca)
                            .addComponent(LbMarca)
                            .addComponent(LbModelo)
                            .addComponent(LbFoto))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(LbCor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtAddProprietarios))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(LbMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtSalvar)
                    .addComponent(BtCancelar))
                .addGap(13, 13, 13))
        );

        LbModelo.getAccessibleContext().setAccessibleName("Sobrenome");

        getAccessibleContext().setAccessibleName("SisPlaca - Cadastrar Carro");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxPlacaActionPerformed

    private void TxMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxMarcaActionPerformed

    private void TxModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxModeloActionPerformed

    private void TxCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxCorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxCorActionPerformed
    
    /**
     * 
     * @param evt 
     */
    @SuppressWarnings("empty-statement")
    private void BtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSalvarActionPerformed
        //Receber valores de view
        //Informacoes de Carro
        String placa = TxPlaca.getText();
        String marca = TxMarca.getText();
        String modelo = TxModelo.getText();
        String cor = TxCor.getText();
        
        //Checagem de valores
        if(placa.isEmpty() || marca.isEmpty() || modelo.isEmpty() 
                || cor.isEmpty() || fotoCarro == null )
            LbMensagem.setText("Os campos marcados com asterisco não podem estar vazios.");
        else{
            Carro novoCarro = new Carro(placa, marca, modelo, cor, 1, fotoCarro, Control.carroControl.carro.getProprietarios());

            int result = Control.carroControl.salvarCarro(novoCarro);

            switch(result){
                case -1:{
                        LbMensagem.setForeground(Color.red);
                        LbMensagem.setText("Ao menos um proprietário requerido.");
                        break;
                }
                case 0:{
                        LbMensagem.setForeground(Color.red);
                        LbMensagem.setText("Algum erro aconteceu.");
                        break;
                }
                case 2:{
                        LbMensagem.setForeground(Color.red);
                        LbMensagem.setText("Placa de carro inválida. - Formado deve ser AAA-0000");
                        break;
                }
                case 1:{
                        LbMensagem.setText("Carro salvo com sucesso");
                        LbMensagem.setForeground(Color.blue);

                        Timer timer = new Timer(1500, new ActionListener(){
                         @Override
                            public void actionPerformed(ActionEvent e) {
                                fecha();
                            }
                        });
                        timer.start();
                        break;
                }
            };
        }
    }//GEN-LAST:event_BtSalvarActionPerformed

    /**
     * Fecha janela de cadastrar carro.
     * @param evt 
     */
    private void BtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCancelarActionPerformed
        this.fecha();
    }//GEN-LAST:event_BtCancelarActionPerformed
    
    /**
     * Escreve nome de proprietarios selecionados e botao para excluir qualquer um deles.
     * @param _proprietarios 
     */
    private void adicionarProprietarios(ArrayList<Proprietario> _proprietarios){
        int i = 1;
        
        //Lima panel antes de recolocar proprietarios selecionados
        PanelProprietarios.removeAll();
        
        for(final Proprietario p : _proprietarios){
            //Cria novo label para nome do proprietario
            JLabel label = new JLabel();
            label.setText(p.getNome() + " " + p.getSobrenome()); //seta texto
            label.setName("LbProprietario"+i);   //seta nome de label
            label.setSize(label.getPreferredSize()); //seta tamanho
            label.setLocation((int)label.getLocation().getX() + 50,
                (int)label.getLocation().getY() + (30*i));//seta localizacaao

            //Cria novo botao
            JButton button = new JButton();
            button.setName("BtProprietario"+i);
            button.setText("Excluir");
            button.setSize(button.getPreferredSize());
            
            //Adiciona listener para retirar prorpietario de panel do panel
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    retiraProprietario(p);
                }
            });
            //end listener

            button.setLocation((int)label.getLocation().getX() + 200, (int)label.getLocation().getY());

            //Adiciona novo botao ao panel
            PanelProprietarios.add(label);
            PanelProprietarios.add(button);
            PanelProprietarios.revalidate();
            PanelProprietarios.repaint();
            //end adiciona novo botao ao panel
            i++;
        }
    }
    
    /**
     * Retira proprietario de lista de proprietarios de carro.
     * @param _p 
     */
    private void retiraProprietario(Proprietario _p){
        Control.carroControl.carro.getProprietarios().remove(_p);
        adicionarProprietarios(Control.carroControl.carro.getProprietarios());
    }

    /**
     * Seleciona imagem a mostra em jlabel.
     * @param evt 
     */
    private void BtImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtImagemActionPerformed
        JFileChooser fileChooser = new JFileChooser();   //Cria o objeto do tipo Janela JFileChooser    
        fileChooser.setDialogTitle("Escolha a Foto do Carro");  //Define o título do JFileChooser    
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);  //Define que só serão abertos arquivos    
        {
            if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                try {
                    File arquivo = fileChooser.getSelectedFile();//arquivo    
                    BufferedImage bi = ImageIO.read(arquivo); //carrega a imagem real num buffer 
                    
                    //Add image in byte[] format
                    ByteArrayOutputStream baos = new ByteArrayOutputStream();
                    ImageIO.write( bi, "jpg", baos );
                    baos.flush();
                    fotoCarro  = baos.toByteArray();    
                    //end
                    
                    BufferedImage aux = new BufferedImage(210, 170, bi.getType());//cria um buffer auxiliar com o tamanho desejado    
                    Graphics2D g = aux.createGraphics();//pega a classe graphics do aux para edicao    
                    AffineTransform at = AffineTransform.getScaleInstance((double) 210 / bi.getWidth(), (double) 170 / bi.getHeight());//cria a transformacao    
                    g.drawRenderedImage(bi, at);//pinta e transforma a imagem real no auxiliar    
                    foto.setIcon(new ImageIcon(aux));//seta no jlabel   
                    foto.setText(null); //Seta texto de jlabel nulo
                } catch (IOException ex) {
                    //ex.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_BtImagemActionPerformed

    /**
     * Abre pop-up para selecao de proprietario do carro e seta catch de evento.
     * @param evt 
     */
    private void BtAddProprietariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAddProprietariosActionPerformed
        SisPlacaCarroCadastrarProprietario carroProprietario = new SisPlacaCarroCadastrarProprietario(control);
        carroProprietario.setVisible(true);
        
        //Recupera o evento de quando o pop-up é fechado para 
        //atualizar lista de proprietarios selecionados
        carroProprietario.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent evento)  {  
                adicionarProprietarios(Control.carroControl.carro.getProprietarios());
            }
        });  
    }//GEN-LAST:event_BtAddProprietariosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SisPlacaCarroCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
     
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtAddProprietarios;
    private javax.swing.JButton BtCancelar;
    private java.awt.Button BtImagem;
    private javax.swing.JButton BtSalvar;
    private javax.swing.JLabel LbCor;
    private javax.swing.JLabel LbFoto;
    private javax.swing.JLabel LbMarca;
    private java.awt.Label LbMensagem;
    private javax.swing.JLabel LbModelo;
    private javax.swing.JLabel LbPlaca;
    private javax.swing.JPanel PanelProprietarios;
    private javax.swing.JTextField TxCor;
    private javax.swing.JTextField TxMarca;
    private javax.swing.JTextField TxModelo;
    private javax.swing.JTextField TxPlaca;
    private javax.swing.JLabel foto;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
