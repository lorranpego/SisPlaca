/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Control;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

import model.Usuario;

/**
 *
 * @author alunolab04
 */
public class SisPlacaUsuarioEditar extends javax.swing.JFrame {
    
    Control control;
    Usuario usuario;
    
    /**
     * Creates new form SisPlacaUsuarioCadastrar
     * @param _control
     * @param _usuario
     */
    public SisPlacaUsuarioEditar(Control _control, Usuario _usuario) {
        control = _control;
        usuario = _usuario;
        
        initComponents();
        
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        setarValores(usuario);
        //Caso usuario esteja editando a si proprio e nao possua perfil de administrador
        //nao podera mudar proprio perfil
        if(control.getUser().getPerfil() != 1){
            OpPerfil.setEnabled(false);
            BtDeletar.setEnabled(false);
        }

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

        LbNome = new javax.swing.JLabel();
        BtSalvar = new javax.swing.JButton();
        TxNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TxSenha = new javax.swing.JPasswordField();
        OpPerfil = new javax.swing.JComboBox();
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
        BtDeletar = new javax.swing.JButton();
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

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("SENHA ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CADASTRAR USUÁRIO");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("USUÁRIO *");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("PERFIL *");

        OpPerfil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Usuário" }));
        OpPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpPerfilActionPerformed(evt);
            }
        });

        LbNomeMeio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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
        BtCancelar.setText("FECHAR");
        BtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCancelarActionPerformed(evt);
            }
        });

        BtDeletar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtDeletar.setForeground(new java.awt.Color(255, 0, 51));
        BtDeletar.setText("EXCLUIR");
        BtDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtDeletarActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(BtSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtCancelar)
                .addGap(161, 161, 161))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addComponent(LbNomeMeio, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(OpPerfil, 0, 138, Short.MAX_VALUE)
                                    .addComponent(LbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(OpSexo, 0, 138, Short.MAX_VALUE)
                                    .addComponent(TxSobrenome)
                                    .addComponent(LbSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TxUsuario)
                                        .addGap(79, 79, 79)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxNomeMeio, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                    .addComponent(TxSenha)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxTelefone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LbTelefone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(298, 298, 298))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LbMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 64, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addComponent(BtDeletar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbNome)
                    .addComponent(LbNomeMeio)
                    .addComponent(LbSobrenome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxNomeMeio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OpPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(LbTelefone)
                    .addComponent(LbSexo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OpSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(LbMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtDeletar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtSalvar)
                    .addComponent(BtCancelar))
                .addContainerGap())
        );

        LbSobrenome.getAccessibleContext().setAccessibleName("Sobrenome");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OpPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OpPerfilActionPerformed

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
        
        //Informacoes de nome
        String nome = TxNome.getText();
        String nomeDoMeio = TxNomeMeio.getText();
        String sobrenome = TxSobrenome.getText();
        
        //Informacoes de Usuario
        String user = TxUsuario.getText();
        String senha = new String(TxSenha.getPassword());
        Integer perfil;
        String p = String.valueOf(OpPerfil.getSelectedItem());;
        if(p.equals("Administrador")){
            perfil = 1;
        }
        else{
            perfil = 2;
        }
        
        //Informacoes de contato e sexo
        String email = TxEmail.getText();
        String telefone = TxTelefone.getText();
        char sexo;
        String s = String.valueOf(OpSexo.getSelectedItem());;
        if(s.equals("Masculino")){
            sexo = 'M';
        }
        else{
            sexo = 'F';
        }
        
        //Checagem de valores
        if(nome.isEmpty() || sobrenome.isEmpty() || user.isEmpty() || email.isEmpty() || telefone.isEmpty())
            LbMensagem.setText("Os campos marcados com asterisco não podem estar vazio.");
        else{
            Usuario novoUser = new Usuario(this.usuario.getId(), user, senha, nome, nomeDoMeio, sobrenome, perfil, email, sexo, telefone, 1);
            int result = control.userControl.AtualizarUsuario(novoUser);
            
            switch(result){
                case 1:{
                            LbMensagem.setText("Usuário editado com sucesso");
                            LbMensagem.setForeground(Color.blue);
                            //Atualiza usuario
                            this.usuario.setEmail(novoUser.getEmail());
                            this.usuario.setNome(novoUser.getNome());
                            this.usuario.setNomeDoMeio(novoUser.getNomeDoMeio());
                            this.usuario.setSobrenome(novoUser.getSobrenome());
                            this.usuario.setPerfil(novoUser.getPerfil());
                            this.usuario.setSexo(novoUser.getSexo());
                            this.usuario.setTelefone(novoUser.getTelefone());
                            if(!novoUser.getSenha().isEmpty())
                                this.usuario.setSenha(novoUser.getSenha());
                            
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
                case 0:{
                        LbMensagem.setForeground(Color.red);
                        LbMensagem.setText("Email já existe no banco de dados.");
                        break;
                }
                case -1:{
                        LbMensagem.setForeground(Color.red);
                        LbMensagem.setText("Email inválido.");
                        break;
                }
            };
        }
    }//GEN-LAST:event_BtSalvarActionPerformed

    private void BtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_BtCancelarActionPerformed

    private void BtDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtDeletarActionPerformed
        // TODO add your handling code here:
        String msg = control.userControl.deletarUsuario(usuario);
            LbMensagem.setText(msg);
            LbMensagem.setForeground(Color.blue);
            try {  
                Thread.sleep(3000); 
                this.dispose();
            } catch (Exception e) {  
                e.printStackTrace();  
            }  
            
    }//GEN-LAST:event_BtDeletarActionPerformed

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
            java.util.logging.Logger.getLogger(SisPlacaUsuarioEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SisPlacaUsuarioEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SisPlacaUsuarioEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SisPlacaUsuarioEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
     
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtCancelar;
    private javax.swing.JButton BtDeletar;
    private javax.swing.JButton BtSalvar;
    private java.awt.Label LbMensagem;
    private javax.swing.JLabel LbNome;
    private javax.swing.JLabel LbNomeMeio;
    private javax.swing.JLabel LbSexo;
    private javax.swing.JLabel LbSobrenome;
    private javax.swing.JLabel LbTelefone;
    private javax.swing.JComboBox OpPerfil;
    private javax.swing.JComboBox OpSexo;
    private javax.swing.JTextField TxEmail;
    private javax.swing.JTextField TxNome;
    private javax.swing.JTextField TxNomeMeio;
    private javax.swing.JPasswordField TxSenha;
    private javax.swing.JTextField TxSobrenome;
    private javax.swing.JTextField TxTelefone;
    private javax.swing.JTextField TxUsuario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables

    /**
     * Seta valores presentes em usuario
     */
   private void setarValores(Usuario _usuario){
        
       if(usuario.getAtivo() == 1){
            BtDeletar.setText("EXCLUIR");
            BtDeletar.setForeground(Color.red);
       }else{
            BtDeletar.setText("ATIVAR");
            BtDeletar.setForeground(Color.blue);
       }
       
       TxNome.setText(_usuario.getNome());
       TxNomeMeio.setText(_usuario.getNomeDoMeio());
       TxSobrenome.setText(_usuario.getSobrenome());
       
       TxEmail.setText(_usuario.getEmail());
       
       TxUsuario.setText(_usuario.getLogin());
       TxUsuario.setEnabled(false);
       
       TxTelefone.setText(_usuario.getTelefone());
       
       if(_usuario.getPerfil() == 1)
         OpPerfil.setSelectedItem("Administrador");
       else
           OpPerfil.setSelectedItem("Usuário");
       
       if(_usuario.getSexo() == 'M')
           OpSexo.setSelectedItem("Masculino");
       else
           OpSexo.setSelectedItem("Feminino");
   }
   
}

