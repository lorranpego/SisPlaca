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
import model.Carro;
import model.Proprietario;
import tools.Util;

/**
 *
 * @author lorran
 */
public class CarroDAO {
    
    /**
     * Function to save new Carro into the databases.
     * @param _carro
     * @return true - Sucess, false - error
     */
    public boolean salvarCarro(Carro _carro){
        Connection conn = DAOBase.getConn();

        PreparedStatement stm, stmCarro, stmProprietarios;
        Integer id_carro = null;

        try{
            conn.setAutoCommit(false);
           //Inserção de novo novo carro
            stm = conn.prepareStatement("INSERT INTO tb_carros (cl_placa, cl_marca, cl_modelo, cl_cor, cl_foto,"
                    + " cl_ativo) VALUES (?, ?, ?, ?, ?, 1)");
            stm.setString(1, _carro.getPlaca());
            stm.setString(2, _carro.getMarca());
            stm.setString(3, _carro.getModelo());
            stm.setString(4, _carro.getCor());
            stm.setBytes(5, _carro.getFoto());
            stm.executeUpdate();
            conn.commit();
            
            
            //Busca Id inserido para Carro e atualiza objeto.
            stmCarro = conn.prepareStatement("SELECT max(cl_id) AS cl_id FROM tb_carros");
            ResultSet rs = stmCarro.executeQuery();
            if (rs.next()) {
                _carro.setId(new Long(rs.getLong("cl_id")));
                id_carro = rs.getInt("cl_id");
            }
            
            
            //Insercao de proprietarios
            for (Proprietario prop : _carro.getProprietarios()) {
                stmProprietarios = conn.prepareStatement("INSERT INTO tb_proprietarios_carros VALUES (? , ?)");
                stmProprietarios.setInt(1, (int) prop.getId());
                stmProprietarios.setInt(2, id_carro);
            }       
            //end insercao de proprietarios
            
            
            conn.setAutoCommit(true);
            
            return true;
            
        }catch(SQLException e){
            System.out.println("Não Foi possivel salvar Carro.");
            e.printStackTrace();
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
