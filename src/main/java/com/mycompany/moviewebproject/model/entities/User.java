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
public class User {
    private int userId;
    private String userName;
    private String userLastname;
    private String userEmail;
    private String userPassword;
    private String userNickname;
    private String userAvatar;
    private String userDescription;
    private Date userCreated;


    public User(int userId, String userName, String userLastname, String userEmail, String userPassword, String userNickname, String userAvatar, String userDescription, Date userCreated) {
        this.userId = userId;
        this.userName = userName;
        this.userLastname = userLastname;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userNickname = userNickname;
        this.userAvatar = userAvatar;
        this.userDescription = userDescription;
        this.userCreated = userCreated;
    }

     public User( String userAvatar, String userName, String userNickname){
        this.userAvatar = userAvatar;
        this.userName = userName;
        this.userNickname = userNickname;
    }
    
    public User(){
        
    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLastname() {
        return userLastname;
    }

    public void setUserLastname(String userLastname) {
        this.userLastname = userLastname;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    public String getUserDescription() {
        return userDescription;
    }

    public void setUserDescription(String userDescription) {
        this.userDescription = userDescription;
    }

    public Date getUserCreated() {
        return userCreated;
    }

    public void setUserCreated(Date userCreated) {
        this.userCreated = userCreated;
    }    
    
}
