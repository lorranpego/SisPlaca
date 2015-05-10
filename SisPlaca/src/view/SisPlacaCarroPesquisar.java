/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import listener.ButtonListenerCarro;
import controller.Control;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import model.Carro;

/**
 *
 * @author alunolab04
 */
public class SisPlacaCarroPesquisar extends javax.swing.JFrame {
    
    Control control;
    /**
     * Creates new form SisPlacaUsuarioPesquisar
     * @param _control
     */
    public SisPlacaCarroPesquisar(Control _control) {
        control = _control;
        initComponents();
        
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        LbNome = new javax.swing.JLabel();
        TxPlaca = new javax.swing.JTextField();
        BtPesquisar = new javax.swing.JButton();
        LbMensagem = new javax.swing.JLabel();
        BtFechar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        CheckBoxDesativados = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        PanelProprietarios = new javax.swing.JPanel();
        LbModelo = new javax.swing.JLabel();
        TxModelo = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SisPlaca - Pesquisar Usuário");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("PESQUISAR CARRO");

        LbNome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LbNome.setText("Placa");

        BtPesquisar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtPesquisar.setText("PESQUISAR");
        BtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtPesquisarActionPerformed(evt);
            }
        });

        LbMensagem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LbMensagem.setForeground(new java.awt.Color(255, 0, 0));
        LbMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        BtFechar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtFechar.setText("FECHAR");
        BtFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtFecharActionPerformed(evt);
            }
        });

        CheckBoxDesativados.setText("Mostrar Proprietários Desativados");

        javax.swing.GroupLayout PanelProprietariosLayout = new javax.swing.GroupLayout(PanelProprietarios);
        PanelProprietarios.setLayout(PanelProprietariosLayout);
        PanelProprietariosLayout.setHorizontalGroup(
            PanelProprietariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        PanelProprietariosLayout.setVerticalGroup(
            PanelProprietariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 185, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(PanelProprietarios);

        LbModelo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LbModelo.setText("Modelo");
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(316, 316, 316)
                .addComponent(LbMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(134, 134, 134))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LbModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CheckBoxDesativados)
                                .addGap(19, 19, 19))))
                    .addComponent(jSeparator2))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbNome)
                    .addComponent(LbModelo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CheckBoxDesativados))
                .addGap(25, 25, 25)
                .addComponent(LbMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtPesquisar)
                    .addComponent(BtFechar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Realiza a busca de proprietarios no sistema e os mostra em panel especifico.
     * @param evt 
     */
    private void BtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtPesquisarActionPerformed
        // TODO add your handling code here:
        String placa = TxPlaca.getText();
        String modelo = TxModelo.getText();
        Boolean desativados = CheckBoxDesativados.isSelected();
        
        //Limpa panel antes de realizar pesquisa
        PanelProprietarios.removeAll();
        PanelProprietarios.revalidate();
        PanelProprietarios.repaint();
        
        if(placa.isEmpty() && modelo.isEmpty() ){//Checa se placa esta vazio
            LbMensagem.setText("Digite a placa ou o modelo para pesquisar.");
        }else{
            LbMensagem.setText("");
            ArrayList<Carro> carros = Control.carroControl.pesquisarCarros(placa, modelo, desativados);
            
            int i = 1;
            for(Carro c : carros){
                //Cria novo label para placa do proprietario
                JLabel label = new JLabel();  
                label.setText(c.toString()); //seta texto
                label.setName("LbCarro"+i);   //seta placa de label
                label.setSize(label.getPreferredSize()); //seta tamanho
                label.setLocation((int)label.getLocation().getX() + 100, 
                                  (int)label.getLocation().getY() + (40*i));//seta localizacaao
                
                //Cria novo botao
                JButton button = new JButton();
                button.setName("BtCarro"+i);
                button.setText("Editar");
                button.setSize(button.getPreferredSize());
                
                //cria novo listener para botao
                button.addActionListener(new ButtonListenerCarro(c, control));
                
                //Adiciona listener para limpar panel quando botao editar eh presionado
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        cleanPanel();
                    }
                });
                //end listener
                
                button.setLocation((int)label.getLocation().getX() + 400, (int)label.getLocation().getY());
                
                //Adiciona novo botao ao panel
                PanelProprietarios.add(label);
                PanelProprietarios.add(button);
                PanelProprietarios.revalidate();
                PanelProprietarios.repaint();
                //end adiciona novo botao ao panel
                i++;
            }
        }
    }//GEN-LAST:event_BtPesquisarActionPerformed

    private void BtFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtFecharActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_BtFecharActionPerformed
    
    /**
     * Limpa panel de propriterarios completamente.
     */
    private void cleanPanel(){
        PanelProprietarios.removeAll();
        PanelProprietarios.revalidate();
        PanelProprietarios.repaint();
    }
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
            java.util.logging.Logger.getLogger(SisPlacaCarroPesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SisPlacaCarroPesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SisPlacaCarroPesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SisPlacaCarroPesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton BtFechar;
    private javax.swing.JButton BtPesquisar;
    private javax.swing.JCheckBox CheckBoxDesativados;
    private javax.swing.JLabel LbMensagem;
    private javax.swing.JLabel LbModelo;
    private javax.swing.JLabel LbNome;
    private javax.swing.JPanel PanelProprietarios;
    private javax.swing.JTextField TxModelo;
    private javax.swing.JTextField TxPlaca;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

}
