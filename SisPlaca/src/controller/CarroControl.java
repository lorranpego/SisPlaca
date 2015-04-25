/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.CarroDAO;
import model.Carro;

/**
 *
 * @author Lorran
 */
public class CarroControl {
    
    //CarroDAO
     CarroDAO dao = new CarroDAO();
     
     //Carro utilizado para realizar cadastro
     public static Carro carro = new Carro();
    
    /**
     * Salva novo carro em banco de dados
     * @param _carro
     * @return Integer
     */
    public int salvarCarro(Carro _carro){
        if(_carro.getProprietarios() != null){    
            if(dao.salvarCarro(_carro)){
                return 1; //salvo com sucesso
            }
        }else{
            return -1;//necessario incluir pelo menos um proprietario
        }
        return 0;
    }
    
}
