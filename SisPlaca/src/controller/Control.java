/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Usuario;

/**         
 *
 * @author Lorran
 */
public class Control {
    
    //Usuario logado no sistema
    private Usuario user;
    
    //Control das funcoes 
    public UsuarioControl userControl = new UsuarioControl();
    public CarroControl carroControl = new CarroControl();
    public PlacaControl placaControl = new PlacaControl();
    public ProprietarioControl proprietarioControl = new ProprietarioControl();
    
    /**
     * Realiza login do usuario, e o seta no usuario pertencente a classe
     * @param _login
     * @param _senha
     * @return 
     */
    public int realizarLogin(String _login, String _senha){
        //Seta usuario que sera utilizado durante todo o tempo no sistema
        this.user = userControl.realizarLogin(_login, _senha);
        if(this.user != null)
            return 1;
        
        return 0;
    }
    
    public Usuario getUser() {
        return user;
    }
    
    /**
     * Get lista de usuarios pesquisados.
     * @param _nome
     * @param _usuario
     * @param _desativados
     * @return 
     */
    public ArrayList<Usuario> getUsuarios(String _nome, String _usuario, Boolean _desativados){
        ArrayList<Usuario> users =  userControl.pesquisarUsuarios(_nome, _usuario, _desativados);
        return users;
    }
}
