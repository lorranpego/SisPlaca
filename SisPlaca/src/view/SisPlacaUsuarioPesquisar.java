/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import listener.ButtonListenerUsuario;
import controller.Control;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import model.Usuario;

/**
 *
 * @author alunolab04
 */
public class SisPlacaUsuarioPesquisar extends javax.swing.JFrame {
    
    Control control;
    /**
     * Creates new form SisPlacaUsuarioPesquisar
     * @param _control
     */
    public SisPlacaUsuarioPesquisar(Control _control) {
        control = _control;
        
        initComponents();
        
        PanelUsers.setPreferredSize(new Dimension(PanelUsers.getPreferredSize().width - 50,
                        PanelUsers.getPreferredSize().height));
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
        LbUsuario = new javax.swing.JLabel();
        TxUsuario = new javax.swing.JTextField();
        BtPesquisar = new javax.swing.JButton();
        LbOu = new javax.swing.JLabel();
        LbMensagem = new javax.swing.JLabel();
        BtFechar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        CheckBoxDesativados = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        PanelUsers = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SisPlaca - Pesquisar Usuário");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("PESQUISAR USUÁRIO");

        LbNome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LbNome.setText("Nome");

        LbUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LbUsuario.setText("Usuário");

        BtPesquisar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtPesquisar.setText("PESQUISAR");
        BtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtPesquisarActionPerformed(evt);
            }
        });

        LbOu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbOu.setText("ou");

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

        CheckBoxDesativados.setText("Mostrar Usuários Desativados");
        CheckBoxDesativados.setToolTipText("");
        CheckBoxDesativados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxDesativadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelUsersLayout = new javax.swing.GroupLayout(PanelUsers);
        PanelUsers.setLayout(PanelUsersLayout);
        PanelUsersLayout.setHorizontalGroup(
            PanelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 648, Short.MAX_VALUE)
        );
        PanelUsersLayout.setVerticalGroup(
            PanelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 205, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(PanelUsers);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LbMensagem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LbNome, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                    .addComponent(TxNome))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LbOu, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(124, 124, 124))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(CheckBoxDesativados)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbNome)
                    .addComponent(LbUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbOu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(CheckBoxDesativados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LbMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtPesquisar)
                    .addComponent(BtFechar))
                .addGap(26, 26, 26)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtPesquisarActionPerformed
        // TODO add your handling code here:
        String nome = TxNome.getText();
        String usuario = TxUsuario.getText();
        Boolean desativados = CheckBoxDesativados.isSelected();
        
        //Remove todos usuarios de panel antes de pesquisar
        PanelUsers.removeAll();
        PanelUsers.revalidate();
        PanelUsers.repaint();
        //end remove todos usuarios
        
        if(nome.isEmpty() && usuario.isEmpty()){//Checa se nome foi digitado
            LbMensagem.setText("Digite o nome ou o usuário para pesquisar.");
        }else{
            LbMensagem.setText("");
            ArrayList<Usuario> users = control.getUsuarios(nome, usuario, desativados);
            
            int i = 1;
            for(Usuario u : users){
                //Cria novo label 
                JLabel label = new JLabel();  
                label.setText(u.getNome() + " " + u.getSobrenome());
                label.setName("LbUser"+i);  
                label.setSize(label.getPreferredSize());
                label.setLocation((int)label.getLocation().getX() + 200, (int)label.getLocation().getY() + (30*i));
                
                //Cria novo botao
                JButton button = new JButton();
                button.setName("BtUser"+i);
                button.setText("Editar");
                button.setSize(button.getPreferredSize());
                
                //cria novo listener para botao
                button.addActionListener(new ButtonListenerUsuario(u, control));
                
                //Adicionado listener para limpar panel de usuario sempre que for escolhido um para editar.
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        cleanPanel();
                    }
                });
                
                button.setLocation((int)label.getLocation().getX() + 200, (int)label.getLocation().getY());
                
                if(i > 5){
               PanelUsers.setPreferredSize( new Dimension(PanelUsers.getPreferredSize().width, 
                                                    PanelUsers.getPreferredSize().height+30));
               
                }
                
                //Adiciona novo usuario em panel
                PanelUsers.add(label);
                PanelUsers.add(button);
                PanelUsers.revalidate();
                PanelUsers.repaint();
                //end adiciona novo usuario
                i++;
            }
        }
    }//GEN-LAST:event_BtPesquisarActionPerformed

    private void BtFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtFecharActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_BtFecharActionPerformed

    private void CheckBoxDesativadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxDesativadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckBoxDesativadosActionPerformed
    
    /**
     * Limpa panel de usuarios
     */
    private void cleanPanel(){
        PanelUsers.removeAll();
        PanelUsers.revalidate();
        PanelUsers.repaint();
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
            java.util.logging.Logger.getLogger(SisPlacaUsuarioPesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SisPlacaUsuarioPesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SisPlacaUsuarioPesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SisPlacaUsuarioPesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtFechar;
    private javax.swing.JButton BtPesquisar;
    private javax.swing.JCheckBox CheckBoxDesativados;
    private javax.swing.JLabel LbMensagem;
    private javax.swing.JLabel LbNome;
    private javax.swing.JLabel LbOu;
    private javax.swing.JLabel LbUsuario;
    private javax.swing.JPanel PanelUsers;
    private javax.swing.JTextField TxNome;
    private javax.swing.JTextField TxUsuario;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

}
