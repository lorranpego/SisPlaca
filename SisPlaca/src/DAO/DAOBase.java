/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import tools.Config;

/**
 *
 * @author Lorran
 */
public class DAOBase {
       private static Connection conn;

    private static Connection newConnection(){ 
        try {
            //Carrega o driver do MySQL e conecta-o
            Class.forName(Config.NOME_DRIVER);
            return DriverManager.getConnection(Config.BD_URL, Config.BD_LOGIN, Config.BD_SENHA);
            } catch (ClassNotFoundException e) {
                System.out.println("FATAL: driver não encontrado");
            } catch (SQLException e) {
                System.out.println("ERRO SQL: " + e.getMessage());
            }
        return null;
    }


    public synchronized static Connection getConn() {
        if (conn == null) {
            conn = newConnection();
        }
        return conn;
    }
}
