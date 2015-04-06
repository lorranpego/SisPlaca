/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Lorran
*/

import controller.Control;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Usuario;

public class ButtonListener implements ActionListener {
    private Usuario usuario;
    private Control control = new Control();

    public ButtonListener(Usuario _u) {
        this.usuario = _u;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            new SisPlacaUsuarioEditar(control, this.usuario).setVisible(true);
    }
}
