/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listener;

import controller.Control;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Carro;
import view.SisPlacaCarroEditar;

/**
 *
 * @author lorran
 */
public class ButtonListenerCarro implements ActionListener {
    private Carro carro;
    private Control control;

    public ButtonListenerCarro(Carro _c, Control _control) {
        this.carro = _c;
        this.control = _control;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            new SisPlacaCarroEditar(control, this.carro).setVisible(true);
    }
}
