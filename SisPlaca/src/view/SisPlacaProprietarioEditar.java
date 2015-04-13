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
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import model.Proprietario;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;
import tools.DateLabelFormatter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayOutputStream;
import javax.swing.Timer;

/**
 *
 * @author alunolab04
 */
public class SisPlacaProprietarioEditar extends javax.swing.JFrame {
    
    Control control;
    JDatePickerImpl datePicker;
    byte[] fotoProprietario = null;
    Proprietario propietario;
    /**
     * Creates new form SisPlacaUsuarioCadastrar
     * @param _control
     */
    public SisPlacaProprietarioEditar(Control _control, Proprietario _p) {
        this.control = _control;
        initComponents();
        this.propietario = _p;
        
        //Add datepicker 
        UtilDateModel model = new UtilDateModel();
        Properties p = new Properties();
        p.put("text.today", "Hoje");
        p.put("text.month", "Mês");
        p.put("text.year", "Ano");
        JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
        datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
        datePicker.setBounds(LbNascimento.getX()+10,LbNascimento.getY()+20,120,30);
        this.add(datePicker);
        this.revalidate();
        this.repaint();
        //end add datepicker
        
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }
    
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
        LbNome = new javax.swing.JLabel();
        BtSalvar = new javax.swing.JButton();
        TxNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        LbNomeMeio = new javax.swing.JLabel();
        LbSobrenome = new javax.swing.JLabel();
        TxNomeMeio = new javax.swing.JTextField();
        TxSobrenome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TxEmail = new javax.swing.JTextField();
        LbTelefone = new javax.swing.JLabel();
        TxTelefone = new javax.swing.JTextField();
        LbSexo = new javax.swing.JLabel();
        OpSexo = new javax.swing.JComboBox();
        LbMensagem = new java.awt.Label();
        BtCancelar = new javax.swing.JButton();
        LbEndereco = new javax.swing.JLabel();
        BtImagem = new java.awt.Button();
        LbFoto = new javax.swing.JLabel();
        foto = new javax.swing.JLabel();
        LbNascimento = new javax.swing.JLabel();
        TxEndereco = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SisPlaca - Cadastrar Usuário");

        LbNome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LbNome.setText("NOME *");

        BtSalvar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtSalvar.setText("SALVAR");
        BtSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSalvarActionPerformed(evt);
            }
        });

        TxNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxNomeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("CADASTRAR PROPRIETÁRIO");

        LbNomeMeio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LbNomeMeio.setText("NOME DO MEIO");

        LbSobrenome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LbSobrenome.setText("SOBRENOME *");

        TxNomeMeio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxNomeMeioActionPerformed(evt);
            }
        });

        TxSobrenome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxSobrenomeActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("E-MAIL *");

        TxEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxEmailActionPerformed(evt);
            }
        });

        LbTelefone.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LbTelefone.setText("TELEFONE *");

        TxTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxTelefoneActionPerformed(evt);
            }
        });

        LbSexo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LbSexo.setText("SEXO *");

        OpSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Feminino" }));
        OpSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpSexoActionPerformed(evt);
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

        LbEndereco.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LbEndereco.setText("ENDEREÇO *");

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

        LbNascimento.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LbNascimento.setText("NASCIMENTO *");
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(foto, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LbFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BtImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(LbNascimento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LbNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LbTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxNomeMeio, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LbNomeMeio, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LbSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(OpSexo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(TxSobrenome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))))
                            .addComponent(LbEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxEndereco))
                        .addGap(54, 54, 54))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LbMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtSalvar)
                        .addGap(390, 390, 390))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addGap(246, 246, 246)
                        .addComponent(BtCancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LbNome)
                            .addComponent(LbNomeMeio)
                            .addComponent(LbSobrenome)
                            .addComponent(LbFoto))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxNomeMeio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LbSexo)
                            .addComponent(LbTelefone)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(OpSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(LbNascimento))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(LbEndereco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(LbMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtSalvar)
                    .addComponent(BtCancelar))
                .addGap(13, 13, 13))
        );

        LbSobrenome.getAccessibleContext().setAccessibleName("Sobrenome");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxNomeActionPerformed

    private void TxNomeMeioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxNomeMeioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxNomeMeioActionPerformed

    private void TxSobrenomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxSobrenomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxSobrenomeActionPerformed

    private void TxEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxEmailActionPerformed

    private void TxTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxTelefoneActionPerformed

    private void OpSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OpSexoActionPerformed

    @SuppressWarnings("empty-statement")
    private void BtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSalvarActionPerformed
        //Receber valores de view
        //Informacoes de proprietario
        String nome = TxNome.getText();
        String nomeDoMeio = TxNomeMeio.getText();
        String sobrenome = TxSobrenome.getText();
        
        //Selecao de data
        String nascimento= "";
        Date selectedDate = (Date) datePicker.getModel().getValue();
        if(selectedDate != null) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(selectedDate);
            int day = cal.get(Calendar.DAY_OF_MONTH);
            int month = cal.get(Calendar.MONTH)+1;
            int year = cal.get(Calendar.YEAR);
            nascimento = day +"/"+ month + "/"+ year;
        }
        //end selecao de data
        
        char sexo;
        String s = String.valueOf(OpSexo.getSelectedItem());;
        if(s.equals("Masculino")){
            sexo = 'M';
        }
        else{
            sexo = 'F';
        }
        //Informacoes de contato
        String email = TxEmail.getText();
        String telefone = TxTelefone.getText();
        String endereco = TxEndereco.getText();      
        
        //Checagem de valores
        if(nome.isEmpty() || sobrenome.isEmpty() || nascimento.isEmpty() || email.isEmpty() 
                || telefone.isEmpty() || endereco.isEmpty() || fotoProprietario == null)
            LbMensagem.setText("Os campos marcados com asterisco não podem estar vazio.");
        else{
            Proprietario novoProp = new Proprietario(nome, nomeDoMeio, sobrenome, sexo, nascimento, 
                    fotoProprietario, email, telefone, endereco, 1);
            int result = control.proprietarioControl.salvarProprietario(novoProp);
            switch(result){
                case -1:{
                        LbMensagem.setForeground(Color.red);
                        LbMensagem.setText("Email inválido.");
                        break;
                }
                case 0:{
                        LbMensagem.setForeground(Color.red);
                        LbMensagem.setText("Algum erro aconteceu.");
                        break;
                }
                case 1:{
                            LbMensagem.setText("Usuário salvo com sucesso");
                            LbMensagem.setForeground(Color.blue);
                            
                            Timer timer = new Timer(3000, new ActionListener(){
                             @Override
                                public void actionPerformed(ActionEvent e) {
                                    fecha();
                                }
                                }
                            );
                            timer.start();
                            break;
                }
            };
        }
    }//GEN-LAST:event_BtSalvarActionPerformed

    private void BtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCancelarActionPerformed
        this.fecha();
    }//GEN-LAST:event_BtCancelarActionPerformed
    
    /**
     * Seleciona imagem a mostra em jlabel.
     * @param evt 
     */
    private void BtImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtImagemActionPerformed
        JFileChooser fileChooser = new JFileChooser();   //Cria o objeto do tipo Janela JFileChooser    
        fileChooser.setDialogTitle("Escolha a Foto do Proprietário");  //Define o título do JFileChooser    
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
                    fotoProprietario  = baos.toByteArray();    
                    //end
                    
                    BufferedImage aux = new BufferedImage(210, 170, bi.getType());//cria um buffer auxiliar com o tamanho desejado    
                    Graphics2D g = aux.createGraphics();//pega a classe graphics do aux para edicao    
                    AffineTransform at = AffineTransform.getScaleInstance((double) 210 / bi.getWidth(), (double) 170 / bi.getHeight());//cria a transformacao    
                    g.drawRenderedImage(bi, at);//pinta e transforma a imagem real no auxiliar    
                    foto.setIcon(new ImageIcon(aux));//seta no jlabel   
                    foto.setText(null); //Seta texto de jlabel nulo
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }

        }
    }//GEN-LAST:event_BtImagemActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SisPlacaProprietarioEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SisPlacaProprietarioEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SisPlacaProprietarioEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SisPlacaProprietarioEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
    private javax.swing.JButton BtCancelar;
    private java.awt.Button BtImagem;
    private javax.swing.JButton BtSalvar;
    private javax.swing.JLabel LbEndereco;
    private javax.swing.JLabel LbFoto;
    private java.awt.Label LbMensagem;
    private javax.swing.JLabel LbNascimento;
    private javax.swing.JLabel LbNome;
    private javax.swing.JLabel LbNomeMeio;
    private javax.swing.JLabel LbSexo;
    private javax.swing.JLabel LbSobrenome;
    private javax.swing.JLabel LbTelefone;
    private javax.swing.JComboBox OpSexo;
    private javax.swing.JTextField TxEmail;
    private javax.swing.JTextField TxEndereco;
    private javax.swing.JTextField TxNome;
    private javax.swing.JTextField TxNomeMeio;
    private javax.swing.JTextField TxSobrenome;
    private javax.swing.JTextField TxTelefone;
    private javax.swing.JLabel foto;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
