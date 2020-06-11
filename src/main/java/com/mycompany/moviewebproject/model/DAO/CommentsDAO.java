
package com.mycompany.moviewebproject.model.DAO;

import com.mycompany.moviewebproject.model.entities.Comment;
import com.mycompany.moviewebproject.model.entities.User;
import com.mycompany.moviewebproject.utils.ConnectionManager;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class CommentsDAO {
    public ArrayList<Comment> getComments(){
        ArrayList<Comment> commentsList = new ArrayList<>();
        
        try{
        ConnectionManager connectionManager = new ConnectionManager();
        Connection con = connectionManager.getConnection();
        
        String sql;
        Statement stm;
        ResultSet rs;
        
        sql="SELECT \n" +
"	comments.commentsContent,\n" +
"	comments.commentsDate,\n" +
"	users.usersName,\n" +
"    users.usersNickname,\n" +
"    users.usersAvatar\n" +
"    from comments\n" +
"    inner join users\n" +
"    on users_usersId = users.usersId";
        
        stm = con.createStatement();
        rs = stm.executeQuery(sql);
        
        while(rs.next()){
            Comment comment = new Comment();
            
            comment.setCommentContent(rs.getString("commentsContent"));
            comment.setCommentDate(rs.getDate("commentsDate"));
            
             User commentUser = new User(
                    rs.getString("usersAvatar"),
                    rs.getString("usersName"),
                    rs.getString("usersNickname")
            );
          
            comment.setUser_userId(commentUser);
           
            commentsList.add(comment);
   
        }    
            stm.close();
            rs.close();
            con.close();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        } 
        return commentsList;
    } 
   
    public Comment getComment(int commentsId){
        Comment comment = new Comment();
        
          try{
            ConnectionManager connectionManager = new ConnectionManager();
            Connection con = connectionManager.getConnection();

            String sql;
            Statement stm;
            ResultSet rs;

            sql="SELECT contentComment FROM comments WHERE commentsId="+ commentsId;

            stm = con.createStatement();
            rs = stm.executeQuery(sql); 

            if(rs.next()){

            comment.setCommentId(rs.getInt("commentsId"));
            comment.setCommentContent(rs.getString("commentsContent"));
            comment.setCommentDate(rs.getDate("commentsDate"));
            }
            stm.close();
            rs.close();
            con.close();
        } catch(SQLException ex){
              System.out.println("error gettin comment");
        }
     return comment; 
        
    }    
    
    public void saveComment(Comment comment){
        
        try{
            ConnectionManager connectionManager = new ConnectionManager();
            
            Connection con = connectionManager.getConnection();
            
            PreparedStatement pstm;
            
            String sql;

                sql = "INSERT INTO comments(commentsContent, (current_timestamp()), user_userId)"
                         + " VALUES(?, ?)";                
           
            pstm = con.prepareStatement(sql);
            
            pstm.setString( 1, comment.getCommentContent());
            pstm.setInt(2, comment.getUser_userId().getUserId() );
           
           
            pstm.executeQuery();
            System.out.println(sql);
            pstm.close();
            con.close();
            
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public Comment deleteComment(int commentsId){
        
        try {
            ConnectionManager connectionManager = new ConnectionManager();
            
            Connection con = connectionManager.getConnection();
                        
            PreparedStatement pstm;
            String sql;
            
            sql = "DELETE FROM comments " +
                    "WHERE commentsId = ?";
            
            pstm = con.prepareStatement(sql);
            
            pstm.setInt(1, commentsId);
            
            pstm.executeUpdate();
            
            pstm.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error al eliminar el cliente");
        }
        return null;
       
    }
    
    
}
