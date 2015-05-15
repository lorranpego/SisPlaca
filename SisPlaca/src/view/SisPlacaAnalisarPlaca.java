/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Control;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import model.Carro;
import model.Proprietario;
import tools.SpringUtilities;
import view.ProprietariosCarros;
/**
 *
 * @author alunolab04
 */
public class SisPlacaAnalisarPlaca extends javax.swing.JFrame {

    Control control;
    private String _placaCarro;
    private Carro carro;
    //private byte[] fotoCarro = null;
    /**
     * Creates new form SisPlacaAnalisarPlaca
     * @param _control
     * @param _placaCarro
     */
    public SisPlacaAnalisarPlaca(Control _control, String _placaCarro) {
        this.control = _control;
        this._placaCarro = _placaCarro;
        
        this.carro = Control.carroControl.pesquisarCarro(this._placaCarro, true);
        if(this.carro != null){
            initComponents();
            this.setResizable(false);
            this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE); 
            this.setValuesCarro(this.carro);
        }else{
           // fechar();
            System.out.println("Carro nao existe me banco de dados.");
        }
        
    }

    private SisPlacaAnalisarPlaca() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Fecha janela.
     */
    private void fechar(){
        this.dispose();
    }
    
    /**
     * Seta valores para campos de carro.
     * @param _carro 
     */
    private void setValuesCarro(Carro _carro){
        
        //Seta valores de carro 
        txPlaca.setText(_carro.getPlaca());
        TxMarca.setText(_carro.getMarca());
        TxCor.setText(_carro.getCor());
        TxModelo.setText(_carro.getModelo());
        
        //Seta foto de carro
        try {
            InputStream in = new ByteArrayInputStream(_carro.getFoto());//carrega imagem de banco de dados em buffer
            //fotoCarro = _carro.getFoto();
            BufferedImage bi = ImageIO.read(in);//carrega imagem bufferizada
            BufferedImage aux = new BufferedImage(210, 170, 5);//cria um buffer auxiliar com o tamanho desejado    
            Graphics2D g = aux.createGraphics();//pega a classe graphics do aux para edicao    
            AffineTransform at = AffineTransform.getScaleInstance((double) 210 / bi.getWidth(), (double) 170 / bi.getHeight());//cria a transformacao    
            g.drawRenderedImage(bi, at);//pinta e transforma a imagem real no auxiliar    
            foto.setIcon(new ImageIcon(aux));//seta no jlabel   
            foto.setText(null); //Seta texto de jlabel nulo
        } catch (Exception ex) {
            // ex.printStackTrace();
        }
        
        //chama funcao par adicionar informacao de proprietarios em panel
        setaProprietarios(_carro.getProprietarios());
    }

    /**
     * Seta informacao de proprietarios de carro em panel.
     * @param _props 
     */
    private void setaProprietarios(ArrayList<Proprietario> _props){
         
        int i = 1;
        PanelProprietarios.removeAll();
        PanelProprietarios.setLayout(new SpringLayout());
          for (final Proprietario p : _props) {

              
            ProprietariosCarros proprietarioJpanel = new ProprietariosCarros(p); 
            
            proprietarioJpanel.setPreferredSize(new Dimension(proprietarioJpanel.getPreferredSize()));
           
//            proprietarioJpanel.setLocation((int)proprietarioJpanel.getLocation().getX(),
//                                 (int)proprietarioJpanel.getLocation().getY() + (220 * i));

            System.out.println(proprietarioJpanel);
            if (i > 1) {
                PanelProprietarios.setPreferredSize(new Dimension(PanelProprietarios.getPreferredSize().width,
                        PanelProprietarios.getPreferredSize().height + 311));
            }
            
            PanelProprietarios.add(proprietarioJpanel);
            
            i++;
        }
          
        SpringUtilities.makeCompactGrid(PanelProprietarios,
                                i-1, 1, //rows, cols
                                6, 6,        //initX, initY
                                6, 6);       //xPad, yPad
        //revalida e repinta apenas apos adicionar todos proprietarios
        PanelProprietarios.revalidate();
        PanelProprietarios.repaint();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbPlaca = new javax.swing.JLabel();
        txPlaca = new javax.swing.JTextField();
        lbAnalisarPlaca = new javax.swing.JLabel();
        btFechar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        foto = new javax.swing.JLabel();
        LbMarca = new javax.swing.JLabel();
        TxMarca = new javax.swing.JTextField();
        TxModelo = new javax.swing.JTextField();
        LbModelo = new javax.swing.JLabel();
        TxCor = new javax.swing.JTextField();
        LbCor = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        PanelProprietarios = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbPlaca.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbPlaca.setText("PLACA");

        txPlaca.setEditable(false);

        lbAnalisarPlaca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbAnalisarPlaca.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbAnalisarPlaca.setText("ANALISAR PLACA");

        btFechar.setText("Fechar");
        btFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharActionPerformed(evt);
            }
        });

        foto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        LbMarca.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LbMarca.setText("MARCA");

        TxMarca.setEditable(false);
        TxMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxMarcaActionPerformed(evt);
            }
        });

        TxModelo.setEditable(false);
        TxModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxModeloActionPerformed(evt);
            }
        });

        LbModelo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LbModelo.setText("MODELO");

        TxCor.setEditable(false);
        TxCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxCorActionPerformed(evt);
            }
        });

        LbCor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LbCor.setText("COR");

        javax.swing.GroupLayout PanelProprietariosLayout = new javax.swing.GroupLayout(PanelProprietarios);
        PanelProprietarios.setLayout(PanelProprietariosLayout);
        PanelProprietariosLayout.setHorizontalGroup(
            PanelProprietariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 716, Short.MAX_VALUE)
        );
        PanelProprietariosLayout.setVerticalGroup(
            PanelProprietariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 311, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(PanelProprietarios);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LbModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LbCor, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxCor, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 680, Short.MAX_VALUE)
                        .addComponent(btFechar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lbAnalisarPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lbAnalisarPlaca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbPlaca)
                            .addComponent(LbMarca))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LbModelo)
                            .addComponent(LbCor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btFechar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        fechar();
    }//GEN-LAST:event_btFecharActionPerformed

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
            java.util.logging.Logger.getLogger(SisPlacaAnalisarPlaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SisPlacaAnalisarPlaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SisPlacaAnalisarPlaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SisPlacaAnalisarPlaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbCor;
    private javax.swing.JLabel LbMarca;
    private javax.swing.JLabel LbModelo;
    private javax.swing.JPanel PanelProprietarios;
    private javax.swing.JTextField TxCor;
    private javax.swing.JTextField TxMarca;
    private javax.swing.JTextField TxModelo;
    private javax.swing.JButton btFechar;
    private javax.swing.JLabel foto;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lbAnalisarPlaca;
    private javax.swing.JLabel lbPlaca;
    private javax.swing.JTextField txPlaca;
    // End of variables declaration//GEN-END:variables
}
