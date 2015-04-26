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
    
    /**
     * Checa se email de usuário é válido.
     * @param _email
     * @return boolean
     */
    public static boolean checkEmail(String _email){
        //verificar email e telefone
        Pattern p = Pattern.compile(".+@.+\\.[a-z]+"); 
        Matcher m = p.matcher(_email);
        
        return m.matches();
    }
    
     /**
     * Checa se placa de carro é válida.
     * @param _placa
     * @return boolean
     */
    public static boolean checkPlaca(String _placa){
        //verificar email e telefone
        Pattern p = Pattern.compile("([A-Z]|[a-z][A-Z]|[a-z][A-Z]|[a-z])+-+[0-9][0-9][0-9][0-9]"); 
        Matcher m = p.matcher(_placa);

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
    
     /**Prepara as datas recuperadas do banco de dados para serem apresentadas.
     * @param data
     * @return */
    public static String dataApresentacao (String data){
        String dataNova[] =  data.split("-");
        if(dataNova.length > 1 ){
            return dataNova[2] + "/" + dataNova[1] + "/" + dataNova[0];
        }
        return null;
    }
    
    /**
     * Get day of passe date.
     * @param data
     * @return int
     */
    public static int getDayDate(String data){
         String dataNova[] =  data.split("-");
         if(dataNova.length > 1 ){
            return Integer.parseInt(dataNova[2]);
        }
        return 0;
    }
    
    /**
     * Get month of date.
     * @param data
     * @return int
     */
    public static int getMonthDate(String data){
         String dataNova[] =  data.split("-");
        
         if(dataNova.length > 1 ){
            return Integer.parseInt(dataNova[1]);
        }
        return 0;
    }
    
    /**
     * Get year of date.
     * @param data
     * @return int
     */
    public static int getYearDate(String data){
         String dataNova[] =  data.split("-");
        
         if(dataNova.length > 1 ){
            return Integer.parseInt(dataNova[0]);
        }
        return 0;
    }
}
