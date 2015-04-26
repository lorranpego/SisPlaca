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
import model.Usuario;
import view.SisPlacaUsuarioEditar;

public class ButtonListenerUsuario implements ActionListener {
    private Usuario usuario;
    private Control control;

    public ButtonListenerUsuario(Usuario _u, Control _control) {
        this.usuario = _u;
        this.control = _control;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            new SisPlacaUsuarioEditar(control, this.usuario).setVisible(true);
    }
}
