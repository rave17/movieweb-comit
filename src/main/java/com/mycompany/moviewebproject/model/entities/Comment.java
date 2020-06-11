/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.moviewebproject.model.entities;

import java.util.Date;

/**
 *
 * @author rober
 */
public class Comment{
    private int commentId;
    private String commentContent;
    private Date commentDate;
    private User user_userId;

    public Comment(int commentId, String commentContent, Date commentDate, User user_userId) {
        this.commentId = commentId;
        this.commentContent = commentContent;
        this.commentDate = commentDate;
        this.user_userId = user_userId;
    }

    public Comment(String commentContent, Date commentDate, User user_userId) {
        this.commentContent = commentContent;
        this.commentDate = commentDate;
        this.user_userId = user_userId;
    }
    
    public Comment() {
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public User getUser_userId() {
        return user_userId;
    }

    public void setUser_userId(User user_userId) {
        this.user_userId = user_userId;
    }

    public void getCommentContent(String parameter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCommentId(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
