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
    
    /**Prepare dates to be inserted in the databases.
     * @param data
     * @return String 
     **/
    public static String dataSQL (String data){
        String dataNova[] =  data.split("/");
        if(dataNova.length > 1){
            return dataNova[2] + "-" + dataNova[1] + "-" + dataNova[0];
        }
        return null;
    }
    
     /**Prepara as dadas recuperadas do bando de dados para serem apresentada
     * @param data
     * @return */
    public static String dataApresentacao (String data){
        String dataNova[] =  data.split("-");
        if(dataNova.length > 1 ){
            return dataNova[2] + "/" + dataNova[1] + "/" + dataNova[0];
        }
        return null;
    }
    
}
