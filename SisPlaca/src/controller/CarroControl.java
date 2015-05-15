/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.CarroDAO;
import java.util.ArrayList;
import model.Carro;
import model.Proprietario;
import tools.Util;

/**
 *
 * @author Lorran
 */
public class CarroControl {
    
    //CarroDAO
     CarroDAO dao = new CarroDAO();
     
     //Carro utilizado para realizar cadastro
     public Carro carro = new Carro();
    
    /**
     * Salva novo carro em banco de dados
     * @param _carro
     * @return Integer
     */
    public int salvarCarro(Carro _carro){
        if(!_carro.getProprietarios().isEmpty()){    
            if(Util.checkPlaca(_carro.getPlaca())){
                if(dao.buscarCarro(_carro.getPlaca()) == 1){
                    if(dao.salvarCarro(_carro)){
                        return 1; //salvo com sucesso
                    }
                }else{
                    return 3;//placa ja existe no banco de dados
                }
            }else{
                return 2; //Placa de carro nao valida
            }
        }else{
            return -1;//necessario incluir pelo menos um proprietario
        }
        return 0;
    }
    
    /**
     * Altera carro em banco de dados.
     * @param _carro
     * @return 
     */
    public int alterarCarro(Carro _carro){
        if(!_carro.getProprietarios().isEmpty()){ 
                    if(dao.alterarCarro(_carro)){
                        return 1; //salvo com sucesso
            }
        }else{
            return -1;//necessario incluir pelo menos um proprietario
        }
        return 0;
    }
     
    /**
     * Pesquisa proprietarios baseado em nome
     * @param _nome
     * @param _proprietarios
     * @return 
     */
    public ArrayList<Proprietario> pesquisarProprietarios(String _nome, ArrayList<Proprietario> _proprietarios){
        return dao.buscarProprietarios(_nome, _proprietarios);
    }
    
    /**
     * Seta new carro.
     */
    public void resetaCarro(){
        this.carro = new Carro();
    }
    
     /**
     * Pesquisa carros
     * @param _placa
     * @param _modelo
     * @param _ativado
     * @return 
     */
    public ArrayList<Carro> pesquisarCarros(String _placa, String _modelo, Boolean _ativado){
        return dao.buscarCarros(_placa, _modelo, _ativado);
    }
    
     /**
     * Pesquisa carro
     * @param _placa
     * @param _modelo
     * @param _ativado
     * @return 
     */
    public Carro pesquisarCarro(String _placa, Boolean _ativado){
        return dao.buscarCarro(_placa, _ativado);
    }
    
    /**
     * Marca carro como deletado em banco de dados.
     * @param _carro
     * @return 
     */
     public String deletarCarro(Carro _carro) {
         if(_carro.getAtivo() == 1){
            if(dao.ExcluirCarro(_carro, 0)){
                _carro.setAtivo(0);
                return "Carro deletado com sucesso.";
            }
        }else{
            if(dao.ExcluirCarro(_carro, 1))
                _carro.setAtivo(1);
                return "Carro ativado com sucesso.";
        }
        
        return "Não foi possível modificar Carro.";
    }
}
