/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import listener.ButtonListenerProprietario;
import controller.Control;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import model.Proprietario;

/**
 *
 * @author alunolab04
 */
public class SisPlacaProprietarioPesquisar extends javax.swing.JFrame {
    
    Control control;
    /**
     * Creates new form SisPlacaUsuarioPesquisar
     * @param _control
     */
    public SisPlacaProprietarioPesquisar(Control _control) {
        control = _control;
        initComponents();
        
        PanelProprietarios.setPreferredSize(new Dimension(PanelProprietarios.getPreferredSize().width - 50,
                        PanelProprietarios.getPreferredSize().height));
        
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE); 
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
        TxNome = new javax.swing.JTextField();
        BtPesquisar = new javax.swing.JButton();
        LbMensagem = new javax.swing.JLabel();
        BtFechar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        CheckBoxDesativados = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        PanelProprietarios = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SisPlaca - Pesquisar Proprietário");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("PESQUISAR PROPRIETÁRIO");

        LbNome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LbNome.setText("Nome");

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
            .addGap(0, 665, Short.MAX_VALUE)
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
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LbMensagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(134, 134, 134))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CheckBoxDesativados)
                        .addGap(73, 73, 73))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(80, 80, 80)
                        .addComponent(LbNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CheckBoxDesativados)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addComponent(LbMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtPesquisar)
                    .addComponent(BtFechar))
                .addGap(26, 26, 26)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Realiza a busca de proprietarios no sistema e os mostra em panel especifico.
     * @param evt 
     */
    private void BtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtPesquisarActionPerformed
        // TODO add your handling code here:
        String nome = TxNome.getText();
        Boolean desativados = CheckBoxDesativados.isSelected();
        
        //Limpa panel antes de realizar pesquisa
        PanelProprietarios.removeAll();
        PanelProprietarios.revalidate();
        PanelProprietarios.repaint();
        
        if(nome.isEmpty() ){//Checa se nome esta vazio
            LbMensagem.setText("Digite o nome para pesquisar.");
        }else{
            LbMensagem.setText("");
            ArrayList<Proprietario> proprietarios = control.proprietarioControl.pesquisarProprietarios(nome, desativados);
            
            int i = 1;
            for(Proprietario p : proprietarios){
                //Cria novo label para nome do proprietario
                JLabel label = new JLabel();  
                label.setText(p.getNome() + " " + p.getSobrenome()); //seta texto
                label.setName("LbProprietario"+i);   //seta nome de label
                label.setSize(label.getPreferredSize()); //seta tamanho
                label.setLocation((int)label.getLocation().getX() + 200, 
                                  (int)label.getLocation().getY() + (30*i));//seta localizacaao
                
                //Cria novo botao
                JButton button = new JButton();
                button.setName("BtProprietario"+i);
                button.setText("Editar");
                button.setSize(button.getPreferredSize());
                
                //cria novo listener para botao
                button.addActionListener(new ButtonListenerProprietario(p, control));
                
                //Adiciona listener para limpar panel quando botao editar eh presionado
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        cleanPanel();
                    }
                });
                //end listener
                
                button.setLocation((int)label.getLocation().getX() + 200, (int)label.getLocation().getY());
                
                if(i > 5){
                PanelProprietarios.setPreferredSize( new Dimension(PanelProprietarios.getPreferredSize().width, 
                                                     PanelProprietarios.getPreferredSize().height+30));
                }
                
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
            java.util.logging.Logger.getLogger(SisPlacaProprietarioPesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SisPlacaProprietarioPesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SisPlacaProprietarioPesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SisPlacaProprietarioPesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
    private javax.swing.JLabel LbNome;
    private javax.swing.JPanel PanelProprietarios;
    private javax.swing.JTextField TxNome;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

}
