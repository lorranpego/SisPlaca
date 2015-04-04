/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisplaca;

import controller.Control;
import view.SisPlacaLogin;

/**
 *
 * @author Lorran
 */
public class SisPlaca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        final Control control = new Control();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SisPlacaLogin(control).setVisible(true);
            }
        });
        
    }
    
}