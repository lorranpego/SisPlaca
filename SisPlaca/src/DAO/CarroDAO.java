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
import model.Carro;
import model.Proprietario;

/**
 *
 * @author lorran
 */
public class CarroDAO {
    
    private ProprietarioDAO propDAO = new ProprietarioDAO();
    
    /**
     * Function to save new Carro into the databases.
     * @param _carro
     * @return true - Sucess, false - error
     */
    public boolean salvarCarro(Carro _carro){
        Connection conn = DAOBase.getConn();

        PreparedStatement stm, stmCarro, stmProprietarios = null;
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
            stmProprietarios.executeUpdate();
            conn.commit();
            //end insercao de proprietarios
            
            
            conn.setAutoCommit(true);
            
            return true;
            
        }catch(SQLException e){
            System.out.println("Não Foi possivel salvar Carro.");
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
     * Altera dados de carro no banco de dados.
     * Para atualizar os proprietarios, primeiro sao excluidos todos os proprietarios atuais
     * e entao inseridos os novos proprietarios passado por parametro.
     * @param _carro
     * @return 
     */
    public boolean alterarCarro(Carro _carro){
        Connection conn = DAOBase.getConn();        
        PreparedStatement stm, stmCarro, stmProprietarios = null;

        try{
            conn.setAutoCommit(false);
           //Inserção de novo novo carro
            stm = conn.prepareStatement("UPDATE tb_carros set "+
                                           " cl_placa = ? , cl_marca = ?, "
                                            + " cl_modelo = ?, cl_cor = ?,"
                                            + " cl_foto = ?, cl_ativo = ? "
                                           + " WHERE cl_id = ?");
            
            stm.setString(1, _carro.getPlaca());
            stm.setString(2, _carro.getMarca());
            stm.setString(3, _carro.getModelo());
            stm.setString(4, _carro.getCor());
            stm.setBytes(5, _carro.getFoto());
            stm.setInt(6, _carro.getAtivo());
            stm.setLong(7, _carro.getId());
            
            stm.executeUpdate();

            //Delecao de de proprietarios da tabela de proprietarios e carros
            stmProprietarios = conn.prepareStatement("DELETE FROM tb_proprietarios_carros WHERE cl_carros = ?");
            stmProprietarios.setLong(1, _carro.getId());
            stmProprietarios.executeUpdate();
                       
            //Insercao de proprietarios
            for (Proprietario prop : _carro.getProprietarios()) {
                stmProprietarios = conn.prepareStatement("INSERT INTO tb_proprietarios_carros VALUES (? , ?)");
                stmProprietarios.setInt(1, (int) prop.getId());
                stmProprietarios.setLong(2, _carro.getId());
                stmProprietarios.executeUpdate();
            }       
            //end insercao de proprietarios
            
            conn.commit();
            conn.setAutoCommit(true);
            return true;
            
        } catch (SQLException e) {
            System.out.println("Database error");
            e.printStackTrace();
        }
        return false;
    }
    
     /**
     * Busca proprietários no banco de dados baseado em seu nome ou login.
     * @param _nome
     * @param _proprietarios
     * @return 
     */
    public ArrayList<Proprietario> buscarProprietarios(String _nome, ArrayList<Proprietario> _proprietarios){
        Connection conn = DAOBase.getConn();
        PreparedStatement stmtUser = null;
        
        ArrayList<Proprietario> proprietarios = new ArrayList<>();
        Proprietario proprietarioBD;
        
        //Seta Ids de proprietarios que ja estao selecionados
        String query = "";
        for(Proprietario p : _proprietarios){
         query = query +  " AND cl_id != " + p.getId();
        }
        
        try{
            //Busca por nome
            stmtUser = conn.prepareStatement("SELECT * FROM tb_proprietarios "
                + "WHERE (cl_nome like ? or cl_nomeDoMeio like ? or cl_sobrenome like ?) AND cl_ativo = 1 " + query + " "
                    + "ORDER BY cl_nome");
            
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
    
     /**
     * Busca carros e seus proprietários no banco de dados baseado em sua placa ou modelo.
     * @param _placa
     * @param _modelo
     * @param _ativado
     * @return 
     */
    public ArrayList<Carro> buscarCarros(String _placa, String _modelo, Boolean _ativado){
        Connection conn = DAOBase.getConn();
        PreparedStatement stmt = null, stmProp = null;
        
        ArrayList<Proprietario> proprietarios;
        ArrayList<Carro> carros = new ArrayList<>();
        Proprietario proprietarioBD;
        Carro carroDB;
        
        String query = "", queryPlaca = "", queryModelo = "", queryOR = "";
        if(!_ativado)
            query = " AND cl_ativo = 1 ";
        
        if(!_placa.isEmpty())
            queryPlaca = " cl_placa like '%"+_placa+"%' ";
        
        if(!_modelo.isEmpty())
            queryModelo = " cl_modelo like '%"+_modelo+"%' ";
        
        if(!_placa.isEmpty() && !_modelo.isEmpty())
            queryOR = " OR ";
            
        try{

            //Busca por nome
            stmt = conn.prepareStatement("SELECT * FROM tb_carros "
                + "WHERE ( "+ queryPlaca+ queryOR + queryModelo +" ) " + query);
            
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                //Zera lista de proprietarios
                proprietarios = new ArrayList<>();
                
                carroDB = new Carro();
                carroDB.setId(new Long(rs.getLong("cl_id")));
                carroDB.setPlaca(rs.getString("cl_placa"));
                carroDB.setMarca(rs.getString("cl_marca"));
                carroDB.setModelo(rs.getString("cl_modelo"));
                carroDB.setCor(rs.getString("cl_cor"));
                carroDB.setAtivo(rs.getInt("cl_ativo"));
                carroDB.setFoto(rs.getBytes("cl_foto"));

                //Busca proprietarios de carro
                stmProp = conn.prepareStatement("SELECT cl_proprietarios "
                        + "FROM tb_proprietarios_carros "
                + "WHERE cl_carros =  ?");
                
                stmProp.setLong(1, carroDB.getId());
                ResultSet rsProp = stmProp.executeQuery();
                //Adiciona proprietarios de carro em lista
                while(rsProp.next()){
                    proprietarioBD = propDAO.buscarProprietario(new Long(rsProp.getLong("cl_proprietarios")));
                    proprietarios.add(proprietarioBD);
                }
                
                carroDB.setProprietarios(proprietarios);
                
                carros.add(carroDB);
            }
            
        } catch (SQLException e) {
            System.out.println("Database error");
           // e.printStackTrace();
        }
        
        return carros;
    }
    
     /**
     * Busca carro, sem proprietários, no banco de dados baseado em sua placa.
     * @param _placa
     * @return 
     */
    public int buscarCarro(String _placa){
        Connection conn = DAOBase.getConn();
        PreparedStatement stmt = null, stmProp = null;
        
        
        String queryPlaca = "";
        
        if(!_placa.isEmpty())
            queryPlaca = " cl_placa like '"+_placa+"' ";
        
        try{
            //Busca por placa
            stmt = conn.prepareStatement("SELECT cl_id FROM tb_carros "
                + "WHERE ( "+ queryPlaca+" ) " );
            
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
              return 0;
            }
            
        } catch (SQLException e) {
            System.out.println("Database error");
           // e.printStackTrace();
        }
        
        return 1;
    }
    
    /**
     * Altera situação de carro.
     * @param _carro
     * @param _situacao
     * @return boolean
     */
    public boolean ExcluirCarro(Carro _carro, int _situacao) {
        Connection conn = DAOBase.getConn();
        PreparedStatement stm = null;
        
        try {
            conn.setAutoCommit(false);
            stm = conn.prepareStatement("UPDATE tb_carros set cl_ativo = " + 
                                            _situacao + " WHERE cl_id = " + _carro.getId());
            stm.executeUpdate();
            conn.commit();
            conn.setAutoCommit(true);
            
            return true;
            
        } catch (SQLException e) {
            System.out.println("Database error");
            //e.printStackTrace();
        }
        
        return false;
    }
}
