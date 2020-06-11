/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.moviewebproject.model.DAO;

import com.mycompany.moviewebproject.model.entities.User;
import com.mycompany.moviewebproject.utils.ConnectionManager;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author rober
 */
public class UserDAO {
   public ArrayList<User> getUsers(){
        ArrayList<User> usersList = new ArrayList<>();
        
        try{
        ConnectionManager connectionManager = new ConnectionManager();
        Connection con = connectionManager.getConnection();
        
        String sql;
        Statement stm;
        ResultSet rs;
        
        sql="SELECT * FROM users";
        
        stm = con.createStatement();
        rs = stm.executeQuery(sql);
        
        while(rs.next()){
            User user = new User();
            
            user.setUserName(rs.getString("usersName"));
            user.setUserLastname(rs.getString("usersLastname"));
            user.setUserEmail(rs.getString("usersEmail"));
            user.setUserPassword(rs.getString("usersPassword"));
            user.setUserNickname(rs.getString("usersNickname"));
            user.setUserAvatar(rs.getString("usersAvatar"));
            user.setUserDescription(rs.getString("usersDescription"));
            user.setUserCreated(rs.getDate("usersCreated"));
            
            usersList.add(user);
            
        }
            stm.close();
            rs.close();
            con.close();
       
                
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }

         return usersList;
 
    }
   
   public User getUser(int usersId){
       User user = new User();
       
       try {
            ConnectionManager connectionManager = new ConnectionManager();
            
            Connection con = connectionManager.getConnection();
                        
            Statement stm;
            ResultSet rs;
            String sql;
            
            sql = "SELECT users.* FROM `users` WHERE usersId =" + usersId;
            
            stm = con.createStatement();
            
            rs = stm.executeQuery( sql );
            
            rs.next();
            
            user.setUserName(rs.getString("usersName"));
            user.setUserLastname(rs.getString("usersLastname"));
            user.setUserEmail(rs.getString("usersEmail"));
            user.setUserPassword(rs.getString("usersPassword"));
            user.setUserNickname(rs.getString("usersNickname"));
            user.setUserAvatar(rs.getString("usersAvatar"));
            user.setUserDescription(rs.getString("usersDescription"));
            user.setUserCreated(rs.getDate("usersCreated"));
                        
            stm.close();
            rs.close();
            con.close();
         
   } catch(SQLException ex){
           System.out.println("error getting user");
           System.out.println(ex.getMessage());
   }
       return user;
    }

   
   public void SaveUser(User user){
           try{
            ConnectionManager connectionManager = new ConnectionManager();
            
            Connection con = connectionManager.getConnection();
            
            PreparedStatement pstm;
            
            String sql;
        
                sql = "INSERT INTO users (usersName, usersLastname, usersEmail, usersNickname, usersPassword, usersAvatar, usersDescription, usersCreated)"
                         + " VALUES(?, ?, ?, ?, ?, 'https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSnkgOeNs-4Sdxsdrcv_hE80XbQdrDv--RuGIb80KU7Lj7eX3O2&usqp=CAU', ?, (current_timestamp()))";                
     

            pstm = con.prepareStatement(sql);
            
            pstm.setString( 1, user.getUserName() );
            pstm.setString( 2, user.getUserLastname() );
            pstm.setString( 3, user.getUserEmail() );
            pstm.setString( 4, user.getUserNickname() );
            pstm.setString( 5, user.getUserPassword() );
            pstm.setString( 6, user.getUserDescription() );
    
            pstm.executeUpdate();
            
            pstm.close();
            con.close();
            
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
   }
   
   
   public void deleteUser(int userId){
       try {
            ConnectionManager connectionManager = new ConnectionManager();
            
            Connection con = connectionManager.getConnection();
                        
            PreparedStatement pstm;
            String sql;
            
            sql = "DELETE FROM users " +
                    "WHERE usersId = ?";
            
            pstm = con.prepareStatement(sql);
            
            pstm.setInt(1, userId);
            
            pstm.executeUpdate();
            
            pstm.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Error al eliminar el cliente");
            System.out.println(ex.getMessage());
        }
   }
   
   
   public void editUser(User user){

       try {
            ConnectionManager connectionManager = new ConnectionManager();
            
            Connection con = connectionManager.getConnection();
                        
            PreparedStatement pstm;
            String sql;
            
            sql = "UPDATE users SET usersNickname=?, usersAvatar= ?, usersDescription= ?"
                         + " WHERE usersId= ?";
            
            pstm = con.prepareStatement(sql);

            pstm.setString( 1, user.getUserNickname() );
            pstm.setString( 2, user.getUserAvatar() );
            pstm.setString( 3, user.getUserDescription() );
            pstm.setInt( 4, user.getUserId() );
    
            pstm.executeUpdate();
            System.out.println(sql);
            
            pstm.close();
            con.close();
     
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error to edit user");
        }
   } 
}