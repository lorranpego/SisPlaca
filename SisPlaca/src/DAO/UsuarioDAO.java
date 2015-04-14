/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Usuario;

/**
 *
 * @author lorran
 */
public class UsuarioDAO {
    
    /**
     * Busca um usuario no banco de dados baseado em seu login e senha
     * @param _login
     * @param _senha
     * @return Usuario caso entrado
     */
    public Usuario realizarLogin(String _login, String _senha) {
        Connection conn = DAOBase.getConn();
        PreparedStatement stmtUser;
        Usuario userBD = null;

        try {
            stmtUser = conn.prepareStatement("SELECT * FROM tb_usuarios "
                    + "WHERE cl_login = ? and cl_senha = password(?) AND cl_ativo = 1;");
            
            stmtUser.setString(1, _login);
            stmtUser.setString(2, _senha);
            
            ResultSet rs = stmtUser.executeQuery();

            if (rs.next()) {
                userBD = new Usuario();
                userBD.setId(new Long(rs.getLong("cl_id")));
                userBD.setLogin(rs.getString("cl_login"));
                userBD.setSenha(rs.getString("cl_senha"));
                userBD.setNome(rs.getString("cl_nome"));
                userBD.setNomeDoMeio(rs.getString("cl_nomeDomeio"));
                userBD.setSobrenome(rs.getString("cl_sobrenome"));
                userBD.setPerfil(rs.getInt("cl_perfil"));
                userBD.setEmail(rs.getString("cl_email"));
                userBD.setSexo(rs.getString("cl_sexo").charAt(0));
                userBD.setTelefone(rs.getString("cl_telefone"));
                userBD.setAtivo(1);
                return userBD;
            }else{
                return null;
            }
            
        } catch (SQLException e) {
            System.out.println("Database error");
           // e.printStackTrace();
        }
        return userBD;
    }
    
    /**
     * Funcao para salvar novo usuario no banco de dados.
     * Recebe como parametro um usuario com todos os dados preenchidos, menos o ID.
     * @param _user
     * @return true - salvo com sucesso, false - error
     */
    public boolean salvarUsuario(Usuario _user){
        Connection conn = DAOBase.getConn();

        PreparedStatement stm;
        
        try{
            conn.setAutoCommit(false);
           //Inserção de novo usuario
            stm = conn.prepareStatement("INSERT INTO tb_usuarios (cl_login, cl_senha, cl_nome, cl_nomeDomeio, cl_sobrenome, cl_perfil,"
                    + "cl_email, cl_sexo, cl_telefone, cl_ativo) values (?, password(?), ?, ?, ?, ?, ?, ?, ?, 1)");
            stm.setString(1, _user.getLogin());
            stm.setString(2, _user.getSenha());
            stm.setString(3, _user.getNome());
            stm.setString(4, _user.getNomeDoMeio());
            stm.setString(5, _user.getSobrenome());
            stm.setInt(6, _user.getPerfil());
            stm.setString(7, _user.getEmail());
            stm.setString(8, String.valueOf(_user.getSexo()));
            stm.setString(9, _user.getTelefone());
            stm.executeUpdate();
            conn.commit();
            
            conn.setAutoCommit(true);
            
            return true;
            
        }catch(SQLException e){
            System.out.println("Não Foi possivel salvar Usuario.");
            try{
                conn.rollback(); 
                conn.setAutoCommit(true);
            }
            catch (SQLException ex){
                System.out.println("Não foi possivel fazer RollBack");
            }
        }
        return false;
    }
    
    /**
     * Busca um usuario no banco de dados baseado em seu login
     * @param _login
     * @return 1 caso ja exista, 0 caso nao exista
     */
    public int buscarUsuario(String _login) {
        Connection conn = DAOBase.getConn();
        PreparedStatement stmtUser;
        Usuario userBD = null;

        try {
            stmtUser = conn.prepareStatement("SELECT cl_id FROM tb_usuarios "
                    + "WHERE cl_login = ?");
            
            stmtUser.setString(1, _login);
            
            ResultSet rs = stmtUser.executeQuery();

            if (rs.next()) {
                return 1; //usuario existe
            }else{
                return 0;
            }
            
        } catch (SQLException e) {
            System.out.println("Database error");
           // e.printStackTrace();
        }
        return 0;
    }
    
     /**
     * Busca um usuario no banco de dados baseado em seu email
     * @param _email
     * @return 1 caso ja exista, 0 caso nao exista
     */
    public int buscarUsuarioEmail(String _email) {
        Connection conn = DAOBase.getConn();
        PreparedStatement stmtUser;
        Usuario userBD = null;

        try {
            stmtUser = conn.prepareStatement("SELECT cl_id FROM tb_usuarios "
                    + "WHERE cl_email = ?");
            
            stmtUser.setString(1, _email);
            
            ResultSet rs = stmtUser.executeQuery();

            if (rs.next()) {
                return 1; //usuario existe
            }else{
                return 0;
            }
            
        } catch (SQLException e) {
            System.out.println("Database error");
           // e.printStackTrace();
        }
        return 0;
    }
    
    /**
     * Busca usuarios no banco de dados baseado em seu nome ou login.
     * @param _nome
     * @param _usuario
     * @return ArrayList<Usuarios>
     */
    public ArrayList<Usuario> buscaUsuario(String _nome, String _usuario){
        Connection conn = DAOBase.getConn();
        PreparedStatement stmtUser = null;
        
        ArrayList<Usuario> usuarios = new ArrayList<>();
        Usuario userBD;
        
        try{
            //Busca pelos 2, nenhum dos 2 campos est avazia
            if(!_nome.isEmpty() && !_usuario.isEmpty()){
                stmtUser = conn.prepareStatement("SELECT * FROM tb_usuarios "
                        + "WHERE  cl_login like ? OR cl_nome like ?");
                stmtUser.setString(1, "%"+_usuario+"%");
                stmtUser.setString(2, "%"+_nome+"%");
            }else{
                //Busca por nome, campo de login esta vazio
                if(!_nome.isEmpty() && _usuario.isEmpty()){
                    stmtUser = conn.prepareStatement("SELECT * FROM tb_usuarios "
                        + "WHERE cl_nome like ?");
                    stmtUser.setString(1, "%"+_nome+"%");
                }else{
                    //Busca por login, campo de nome esta vazio
                    stmtUser = conn.prepareStatement("SELECT * FROM tb_usuarios "
                        + "WHERE  cl_login like ? ");  
                    stmtUser.setString(1, "%"+_usuario+"%");
                }
            }
            
            ResultSet rs = stmtUser.executeQuery();
            while (rs.next()) {
                userBD = new Usuario();
                userBD.setId(new Long(rs.getLong("cl_id")));
                userBD.setLogin(rs.getString("cl_login"));
                userBD.setSenha(rs.getString("cl_senha"));
                userBD.setNome(rs.getString("cl_nome"));
                userBD.setNomeDoMeio(rs.getString("cl_nomeDomeio"));
                userBD.setSobrenome(rs.getString("cl_sobrenome"));
                userBD.setPerfil(rs.getInt("cl_perfil"));
                userBD.setEmail(rs.getString("cl_email"));
                userBD.setSexo(rs.getString("cl_sexo").charAt(0));
                userBD.setTelefone(rs.getString("cl_telefone"));
                userBD.setAtivo(rs.getInt("cl_ativo"));
                usuarios.add(userBD);
            }
            
        } catch (SQLException e) {
            System.out.println("Database error");
           // e.printStackTrace();
        }
        return usuarios;
    }
    
    /**
     * Exclui ou ativa usuario
     * @param _usuario
     * @param situacao
     * @return boolean
     */
    public boolean ExcluirUsuario(Usuario _usuario, int situacao){
        Connection conn = DAOBase.getConn();
        PreparedStatement stm = null;
        
        try {
            conn.setAutoCommit(false);
            stm = conn.prepareStatement("UPDATE tb_usuarios set cl_ativo = " + situacao + " WHERE cl_id = " + _usuario.getId());
            stm.executeUpdate();
            conn.commit();
            conn.setAutoCommit(true);
            
            return true;
            
        } catch (SQLException e) {
            System.out.println("Database error");
        }
        
        return false;
    }
    
    /**
     * Atualiza usuario baseado em usuario passado por parametro.
     * Checa primeiro se email pertence a outro usuario.
     * @param _usuario
     * @return 
     */
    public boolean AtualizarUsuario(Usuario _usuario){
        Connection conn = DAOBase.getConn();
        PreparedStatement stm = null;
        PreparedStatement stmtUser;
        
        Long id = null;
        String query = "";
        
        //Pega ID de usuario baseado em email escolhido para o usuario
        try {
            stmtUser = conn.prepareStatement("SELECT cl_id FROM tb_usuarios "
                    + "WHERE cl_email = ?");
            
            stmtUser.setString(1, _usuario.getEmail());
            
            ResultSet rs = stmtUser.executeQuery();

            if (rs.next()) {
                id = new Long(rs.getLong("cl_id"));
            }else{
                id = new Long(0);
            }
        }catch(Exception e){
            
        }
        
        //Checa se email pertence a mesmo usuario
        if(id.equals(_usuario.getId()) || id == 0){
            try {
                //Se senha nao for vazia sera atualizada tambem
                if(!_usuario.getSenha().isEmpty())
                    query = "cl_senha = password('"+_usuario.getSenha()+"') ,";
                
                
                conn.setAutoCommit(false);
                
                stm = conn.prepareStatement("UPDATE tb_usuarios set "
                                               + query +
                                               " cl_nome = ? , cl_nomeDomeio = ?, "
                                                + " cl_sobrenome = ?, cl_perfil = ?,"
                                                + " cl_email = ?, cl_sexo = ?, "
                                                +   " cl_telefone = ? "
                                               + " WHERE cl_id = ?");
                
                stm.setString(1, _usuario.getNome());
                stm.setString(2, _usuario.getNomeDoMeio());
                stm.setString(3, _usuario.getSobrenome());
                stm.setInt(4, _usuario.getPerfil());
                stm.setString(5, _usuario.getEmail());
                stm.setString(6, String.valueOf(_usuario.getSexo()));
                stm.setString(7, _usuario.getTelefone());
                stm.setLong(8, _usuario.getId());
                
                stm.executeUpdate();
                conn.commit();
                conn.setAutoCommit(true);

                return true;

            } catch (SQLException e) {
                System.out.println("Database error");
                //e.printStackTrace();
            }
        }
        
        return false;
    }
    
}
