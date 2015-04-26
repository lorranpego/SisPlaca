/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listener;

/**
 *
 * @author Lorran
*/

import controller.Control;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Proprietario;
import view.SisPlacaProprietarioEditar;

public class ButtonListenerProprietario implements ActionListener {
    private Proprietario proprietario;
    private Control control;

    public ButtonListenerProprietario(Proprietario _p, Control _control) {
        this.proprietario = _p;
        this.control = _control;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            new SisPlacaProprietarioEditar(control, this.proprietario).setVisible(true);
    }
}
