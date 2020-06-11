/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.moviewebproject.model.DAO;

import com.mycompany.moviewebproject.model.entities.User;
import com.mycompany.moviewebproject.utils.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class LoginDAO {
    public User userLogin(String userEmail, String userPassword){
        
      User userLoged = new User();
        
        try{
            ConnectionManager connectionManager = new ConnectionManager();
            Connection con = connectionManager.getConnection();
            
            String sql;
            Statement stm;
            ResultSet rs;
            
            sql="SELECT * FROM `users` " +
                "WHERE users.usersEmail = '" + userEmail +"'"
                + " AND users.usersPassword = '" + userPassword +"'";
                   
            System.out.println(sql);
            
            stm = con.prepareStatement(sql);
            rs = stm.executeQuery(sql);    

            if(rs.next()){
                userLoged.setUserName(rs.getString("usersName"));
                userLoged.setUserLastname(rs.getString("usersLastname"));
                userLoged.setUserEmail(rs.getString("usersEmail"));
                userLoged.setUserPassword(rs.getString("usersPassword"));
                userLoged.setUserNickname(rs.getString("usersNickname"));
                userLoged.setUserAvatar(rs.getString("usersAvatar"));
                userLoged.setUserDescription(rs.getString("usersDescription"));    
            }
          
    
            stm.close();
            rs.close();
            con.close();
           
            
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        
        return userLoged;
        
    }
}
