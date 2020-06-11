/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.moviewebproject.model.DAO;

import com.mycompany.moviewebproject.model.entities.Message;
import com.mycompany.moviewebproject.utils.ConnectionManager;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author rober
 */
public class MessageDAO {
    public ArrayList getMessages(){
        ArrayList<Message> messagesList = new ArrayList<>();
        
        try{
        ConnectionManager connectionManager = new ConnectionManager();
        Connection con = connectionManager.getConnection();
        
        String sql;
        Statement stm;
        ResultSet rs;
        
        sql="SELECT * from messages";
        
        stm = con.createStatement();
        rs = stm.executeQuery(sql);
        
        while(rs.next()){
            Message message = new Message();
            
            message.setMessageId(rs.getInt("messagesId"));
            message.setMessageTitle(rs.getString("messagesTitle"));
            message.setMessageEmail(rs.getString("messagesEmail"));
            message.setMessageContent(rs.getString("messagesContent"));
            message.setMessageDate(rs.getDate("messagesDate"));
            
            messagesList.add(message);
            
        }
        stm.close();
        rs.close();
        con.close();
               
                }catch(SQLException ex){
                        System.out.println(ex.getMessage());
                        }
        return messagesList;
    }
    
    public Message sendMessage(Message message){
        Message newMessage = new Message();
        
        try{
            ConnectionManager connectionManager = new ConnectionManager();
            Connection con = connectionManager.getConnection();
            
            PreparedStatement pstm;
            String sql;
            
            sql="INSERT INTO `messages` (`messagesTitle`, `messagesContent`, `messagesEmail`, `messageDate`) VALUES (?, ?, ?, (current_timestamp()));";
            
             pstm = con.prepareStatement(sql);
            
            pstm.setString( 1, message.getMessageTitle());
            pstm.setString( 2, message.getMessageContent());
            pstm.setString( 3, message.getMessageEmail());
          
            
            pstm.executeUpdate();
            
            pstm.close();
            con.close();
            
            
        } catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return newMessage;
    }
}
