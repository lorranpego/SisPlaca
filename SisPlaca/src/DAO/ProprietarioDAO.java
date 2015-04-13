/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
}
