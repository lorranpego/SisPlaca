/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Control;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import model.Usuario;
import tools.GeradorImagemTreino;
import tools.Util;

/**
 *
 * @author alunolab04
 */
public class sisPlacaMain extends javax.swing.JFrame {
    
    Control control;
    Usuario user;
    /**
     * Creates new form SisPlacaUsuarioEditar
     * @param _control
     */
    public sisPlacaMain(Control _control) {
          
        control = _control;
        user = control.getUser();
        initComponents();
        message.setText("");
        
        if(user.getPerfil() != 1){
            menuCadastrar.setEnabled(false);
            menuPesquisar.setEnabled(false);
            menuCarros.setEnabled(false);
            menuProprietarios.setEnabled(false);
        }
        
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        buscarButton = new javax.swing.JButton();
        message = new javax.swing.JLabel();
        buscarButton1 = new javax.swing.JButton();
        TxtPlaca = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuUsuarios = new javax.swing.JMenu();
        menuCadastrar = new javax.swing.JMenuItem();
        menuEditar = new javax.swing.JMenuItem();
        menuPesquisar = new javax.swing.JMenuItem();
        menuCarros = new javax.swing.JMenu();
        menuCadastrarCarro = new javax.swing.JMenuItem();
        MenuPesquisarCarros = new javax.swing.JMenuItem();
        menuProprietarios = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SisPlaca");

        jTextPane1.setEditable(false);
        jTextPane1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jTextPane1.setText("SisPlaca");
        jScrollPane1.setViewportView(jTextPane1);

        buscarButton.setText("Imagem");
        buscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarButtonActionPerformed(evt);
            }
        });

        message.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        message.setText("LABEL");

        buscarButton1.setText("Texto");
        buscarButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarButton1ActionPerformed(evt);
            }
        });

        TxtPlaca.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        menuUsuarios.setText("Usuários");

        menuCadastrar.setText("Cadastrar");
        menuCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarActionPerformed(evt);
            }
        });
        menuUsuarios.add(menuCadastrar);

        menuEditar.setText("Editar");
        menuEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEditarActionPerformed(evt);
            }
        });
        menuUsuarios.add(menuEditar);

        menuPesquisar.setText("Pesquisar");
        menuPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPesquisarActionPerformed(evt);
            }
        });
        menuUsuarios.add(menuPesquisar);

        jMenuBar1.add(menuUsuarios);

        menuCarros.setText("Carros");

        menuCadastrarCarro.setText("Cadastrar");
        menuCadastrarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarCarroActionPerformed(evt);
            }
        });
        menuCarros.add(menuCadastrarCarro);

        MenuPesquisarCarros.setText("Pesquisar");
        MenuPesquisarCarros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPesquisarCarrosActionPerformed(evt);
            }
        });
        menuCarros.add(MenuPesquisarCarros);

        jMenuBar1.add(menuCarros);

        menuProprietarios.setText("Proprietários");

        jMenuItem7.setText("Cadastrar");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        menuProprietarios.add(jMenuItem7);

        jMenuItem9.setText("Pesquisar");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        menuProprietarios.add(jMenuItem9);

        jMenuBar1.add(menuProprietarios);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(296, 296, 296))
            .addComponent(message, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(buscarButton)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(buscarButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(TxtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(191, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(TxtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarButton)
                    .addComponent(buscarButton1))
                .addGap(84, 84, 84)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarActionPerformed
        message.setText("");
        new SisPlacaUsuarioCadastrar(control).setVisible(true);
    }//GEN-LAST:event_menuCadastrarActionPerformed

    private void menuPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPesquisarActionPerformed
        message.setText("");
        new SisPlacaUsuarioPesquisar(control).setVisible(true);
    }//GEN-LAST:event_menuPesquisarActionPerformed

    private void menuEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditarActionPerformed
        message.setText("");
        new SisPlacaUsuarioEditar(control, this.user).setVisible(true);
    }//GEN-LAST:event_menuEditarActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        message.setText("");
        new SisPlacaProprietarioCadastrar(control).setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        message.setText("");
        new SisPlacaProprietarioPesquisar(control).setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void menuCadastrarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarCarroActionPerformed
        message.setText(""); 
        new SisPlacaCarroCadastrar(control).setVisible(true);
    }//GEN-LAST:event_menuCadastrarCarroActionPerformed

    private void MenuPesquisarCarrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPesquisarCarrosActionPerformed
        message.setText("");
        new SisPlacaCarroPesquisar(control).setVisible(true);
    }//GEN-LAST:event_MenuPesquisarCarrosActionPerformed

    private void buscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButtonActionPerformed
        String placa = null;
        message.setText("");
        //Abre selecao de arquivo.
        JFileChooser fileChooser = new JFileChooser();   //Cria o objeto do tipo Janela JFileChooser    
        fileChooser.setDialogTitle("Escolha a Foto do Carro");  //Define o título do JFileChooser    
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);  //Define que só serão abertos arquivos    
        {
            if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                try {
                    placa = model.Placa.reconhecePlaca(fileChooser.getSelectedFile().toString());
                    
                    System.out.println(placa);
                    
                } catch (IOException ex) {
                    Logger.getLogger(sisPlacaMain.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        if(Util.checkPlaca(placa)){
            //Apenas usado para construir retorno apos processamento de imagem
            new SisPlacaAnalisarPlaca(control, placa).setVisible(true);
        }else{
            message.setForeground(Color.red);
            message.setText("Placa inválida - " + placa);
        }
    }//GEN-LAST:event_buscarButtonActionPerformed

    private void buscarButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButton1ActionPerformed
        String placa = TxtPlaca.getText();
        TxtPlaca.setText("");
        
        if(Util.checkPlaca(placa)){
            //Apenas usado para construir retorno apos processamento de imagem
            new SisPlacaAnalisarPlaca(control, placa).setVisible(true);
        }else{
            message.setForeground(Color.red);
            message.setText("Placa inválida - " + placa);
        }
    }//GEN-LAST:event_buscarButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(sisPlacaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sisPlacaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sisPlacaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sisPlacaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        


    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuPesquisarCarros;
    private javax.swing.JTextField TxtPlaca;
    private javax.swing.JButton buscarButton;
    private javax.swing.JButton buscarButton1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JMenuItem menuCadastrar;
    private javax.swing.JMenuItem menuCadastrarCarro;
    private javax.swing.JMenu menuCarros;
    private javax.swing.JMenuItem menuEditar;
    private javax.swing.JMenuItem menuPesquisar;
    private javax.swing.JMenu menuProprietarios;
    private javax.swing.JMenu menuUsuarios;
    private javax.swing.JLabel message;
    // End of variables declaration//GEN-END:variables
}
