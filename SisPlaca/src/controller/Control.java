/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Usuario;

/**
 *
 * @author Lorran
 */
public class Control {
    
    private Usuario user;
    
    public UsuarioControl userControl = new UsuarioControl();
    public CarroControl carroControl = new CarroControl();
    public PlacaControl placaControl = new PlacaControl();
    public ProprietarioControl proprietarioControl = new ProprietarioControl();
    
    
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
}
