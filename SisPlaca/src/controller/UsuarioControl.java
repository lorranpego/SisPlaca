/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.UsuarioDAO;
import java.util.ArrayList;
import model.Usuario;
import tools.Util;

/**
 *
 * @author Lorran
 */
public class UsuarioControl {
    
    UsuarioDAO dao = new UsuarioDAO();
    Util util = new Util();
    public Usuario user;
    
    /**
     * Realiza login de usuario.
     * @param _login
     * @param _senha
     * @return usuario, caso login seja feito
     */
    public Usuario realizarLogin(String _login, String _senha){
        return  dao.realizarLogin(_login, _senha);
    }
    
    /**
     * Salva novo usuario em banco de dados
     * @param _user
     * @return Integer
     */
    public int SalvarUsuario(Usuario _user){
        //verificar email e telefone
        if(util.checkEmail(_user.getEmail())){
            //verificar se usuario ja existe
            if(dao.buscarUsuario(_user.getLogin()) == 0){
                if(dao.buscarUsuarioEmail(_user.getEmail()) == 0){
                    if(dao.salvarUsuario(_user))
                        return 1; //salvo com sucesso
                }else{
                    //email ja existe
                    return 2;//
                }
            }else{
                //login ja existe
                return 3;
            }
        }
        return -1;
    }
    
    /**
     * Pesquisa usuarios baseado em nome ou login
     * @param _nome
     * @param _usuario
     * @return 
     */
    public ArrayList<Usuario> pesquisarUsuarios(String _nome, String _usuario){
        return dao.buscaUsuario(_nome, _usuario);
    }
    
    /**
     * Inverte situacao de usuario.
     * @param _user
     * @return 
     */
    public String deletarUsuario(Usuario _user){
        
        if(_user.getAtivo() == 1){
            if(dao.ExcluirUsuario(_user, 0)){
                _user.setAtivo(0);
                return "Usuário deletado com sucesso.";
            }
        }else{
            if(dao.ExcluirUsuario(_user, 1))
                _user.setAtivo(1);
                return "Usuário ativado com sucesso.";
        }
        
        return "Não foi possível modificar usuário.";
    }
    
    /**
     * Atualiza usuario em banco de dados.
     * @param _user
     * @return 
     */
    public int AtualizarUsuario(Usuario _user){
        //verificar email e telefone
        if(util.checkEmail(_user.getEmail())){
            //verificar se usuario ja existe
            if(dao.AtualizarUsuario(_user))
                return 1; //salvo com sucesso
            else
                return 0;
        }
        return -1;
    } 
}
