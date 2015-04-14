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
import model.Proprietario;
import tools.Util;

/**
 *
 * @author lorran
 */
public class ProprietarioDAO {
    
    /**
     * Function to save new Proprietario into the databases.
     * @param _proprietario
     * @return true - Sucess, false - error
     */
    public boolean salvarProprietario(Proprietario _proprietario){
        Connection conn = DAOBase.getConn();

        PreparedStatement stm;

        try{
            conn.setAutoCommit(false);
           //Inserção de novo proprietario
            stm = conn.prepareStatement("INSERT INTO tb_proprietarios (cl_nome, cl_nomeDoMeio, cl_sobrenome, cl_sexo, cl_nascimento, cl_foto,"
                    + "cl_email, cl_telefone, cl_endereco, cl_ativo) values (?, ?, ?, ?, ?, ?, ?, ?, ?, 1)");
            stm.setString(1, _proprietario.getNome());
            stm.setString(2, _proprietario.getNomeDoMeio());
            stm.setString(3, _proprietario.getSobrenome());
            stm.setString(4, String.valueOf(_proprietario.getSexo()));
            stm.setString(5, Util.dataSQL(_proprietario.getNascimento()));
            stm.setBytes(6, _proprietario.getFoto());
            stm.setString(7, _proprietario.getEmail());
            stm.setString(8, _proprietario.getTelefone());
            stm.setString(9, _proprietario.getEndereco());
            stm.executeUpdate();
            conn.commit();
            
            conn.setAutoCommit(true);
            
            return true;
            
        }catch(SQLException e){
            System.out.println("Não Foi possivel salvar Proprietario.");
            //e.printStackTrace();
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
     * Busca usuarios no banco de dados baseado em seu nome ou login.
     * @param _nome
     * @return 
     */
    public ArrayList<Proprietario> buscarProprietarios(String _nome){
        Connection conn = DAOBase.getConn();
        PreparedStatement stmtUser = null;
        
        ArrayList<Proprietario> proprietarios = new ArrayList<>();
        Proprietario proprietarioBD;
        
        try{

            //Busca por nome
            stmtUser = conn.prepareStatement("SELECT * FROM tb_proprietarios "
                + "WHERE cl_nome like ? or cl_nomeDoMeio like ? or cl_sobrenome like ?");
            stmtUser.setString(1, "%"+_nome+"%");
            stmtUser.setString(2, "%"+_nome+"%");
            stmtUser.setString(3, "%"+_nome+"%");
               
            
            ResultSet rs = stmtUser.executeQuery();
            while (rs.next()) {
                proprietarioBD = new Proprietario();
                proprietarioBD.setId(new Long(rs.getLong("cl_id")));
                proprietarioBD.setNome(rs.getString("cl_nome"));
                proprietarioBD.setNomeDoMeio(rs.getString("cl_nomeDomeio"));
                proprietarioBD.setSobrenome(rs.getString("cl_sobrenome"));
                proprietarioBD.setNascimento(rs.getString("cl_nascimento"));
                proprietarioBD.setEmail(rs.getString("cl_email"));
                proprietarioBD.setSexo(rs.getString("cl_sexo").charAt(0));
                proprietarioBD.setTelefone(rs.getString("cl_telefone"));
                proprietarioBD.setAtivo(rs.getInt("cl_ativo"));
                proprietarioBD.setEndereco(rs.getString("cl_endereco"));
                proprietarioBD.setFoto(rs.getBytes("cl_foto"));
                proprietarios.add(proprietarioBD);
            }
            
        } catch (SQLException e) {
            System.out.println("Database error");
           // e.printStackTrace();
        }
        return proprietarios;
    }

    public boolean alterarProprietario(Proprietario _proprietario) {
        Connection conn = DAOBase.getConn();
        PreparedStatement stm = null;
        PreparedStatement stmtUser;
        
        try {
            conn.setAutoCommit(false);

            stm = conn.prepareStatement("UPDATE tb_proprietarios set "+
                                           " cl_nome = ? , cl_nomeDomeio = ?, "
                                            + " cl_sobrenome = ?, cl_nascimento = ?,"
                                            + " cl_email = ?, cl_sexo = ?, "
                                            +   " cl_telefone = ? , cl_ativo = ?, "
                                            + "cl_endereco = ? , cl_foto = ? "
                                           + " WHERE cl_id = ?");

            stm.setString(1, _proprietario.getNome());
            stm.setString(2, _proprietario.getNomeDoMeio());
            stm.setString(3, _proprietario.getSobrenome());
            stm.setString(4, Util.dataSQL(_proprietario.getNascimento()));
            stm.setString(5, _proprietario.getEmail());
            stm.setString(6, String.valueOf(_proprietario.getSexo()));
            stm.setString(7, _proprietario.getTelefone());
            stm.setInt(8, _proprietario.getAtivo());
            stm.setString(9, _proprietario.getEndereco());
            stm.setBytes(10, _proprietario.getFoto());
            stm.setLong(11, _proprietario.getId());
            

            stm.executeUpdate();
            conn.commit();
            conn.setAutoCommit(true);

            return true;

        } catch (SQLException e) {
            System.out.println("Database error");
            e.printStackTrace();
        }
        
        return false;
    }

    public boolean ExcluirProprietario(Proprietario _proprietario, int _situacao) {
        Connection conn = DAOBase.getConn();
        PreparedStatement stm = null;
        
        try {
            conn.setAutoCommit(false);
            stm = conn.prepareStatement("UPDATE tb_proprietarios set cl_ativo = " + _situacao + " WHERE cl_id = " + _proprietario.getId());
            stm.executeUpdate();
            conn.commit();
            conn.setAutoCommit(true);
            
            return true;
            
        } catch (SQLException e) {
            System.out.println("Database error");
        }
        
        return false;
    }
}
