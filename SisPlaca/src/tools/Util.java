/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author lorran
 */
public class Util {
    
    public boolean checkEmail(String _email){
        //verificar email e telefone
        Pattern p = Pattern.compile(".+@.+\\.[a-z]+"); 
        Matcher m = p.matcher(_email);
        
        return m.matches();
    }
}
