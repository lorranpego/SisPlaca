/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.ProprietarioDAO;
import java.util.ArrayList;
import model.Proprietario;
import tools.Util;

/**
 *
 * @author Lorran
 */
public class ProprietarioControl {
    
    Util util = new Util();
    ProprietarioDAO dao = new ProprietarioDAO();
    
    /**
     * Salva novo proprietario em banco de dados
     * @param _proprietario
     * @return Integer
     */
    public int salvarProprietario(Proprietario _proprietario){
        if(util.checkEmail(_proprietario.getEmail())){
            if(dao.salvarProprietario(_proprietario)){
                return 1; //salvo com sucesso
            }else{
            return -1;
            }
        }
        return 0;
    }
    
    /**
     * Pesquisa proprietarios baseado em nome
     * @param _nome
     * @return 
     */
    public ArrayList<Proprietario> pesquisarUsuarios(String _nome){
        return dao.buscarProprietarios(_nome);
    }
}
