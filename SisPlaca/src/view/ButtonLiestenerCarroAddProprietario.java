/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Control;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Proprietario;

/**
 *
 * @author Lorran
 */
public class ButtonLiestenerCarroAddProprietario implements ActionListener {
    private Proprietario proprietario;
    private Control control;

    public ButtonLiestenerCarroAddProprietario(Proprietario _p, Control _control) {
        this.proprietario = _p;
        this.control = _control;
    }
    
    /**
     * Adiciona novo proprietario a lista de proprietarios do carro.
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        Control.carroControl.carro.getProprietarios().add(proprietario);
    }
    
}
