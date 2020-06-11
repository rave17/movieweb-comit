/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.moviewebproject.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author rober
 */
public class ConnectionManager {
    public Connection getConnection(){
    
        String driver = "com.mysql.cj.jdbc.Driver";
        String host = "localhost";
        String port = "3306";
        String db = "movieswebdb";
        String user = "root";
        String password = "";
        String timeZone = "UTC";
        
        Connection con = null;
        
        String url = "jdbc:mysql://" + host + ":" + port + "/" + db + "?user=" + user + "&password=" + password + "&serverTimezone=" + timeZone;

        try{
            Class.forName(driver);
            System.out.println("Connecting to driver");
            System.out.println(driver);
            con = (Connection) DriverManager.getConnection(url);
            
            System.out.println("Connection successfull");
             
        }catch(ClassNotFoundException ex){
         /**/   System.out.println(ex.getLocalizedMessage());
            System.out.println("Error connecting driver");
      
        }catch(SQLException ex){
      
            System.out.println(ex.getMessage());
        }
        return con; 
    } 

}