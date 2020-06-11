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
public class Message {
    private int messageId;
    private String messageTitle;
    private String messageEmail;
    private String messageContent;
    private Date messageDate;

    public Message() {
    }
        
    
    public Message(int messageId, String messageTitle, String messageEmail, String messageContent, Date messageDate) {
        this.messageId = messageId;
        this.messageTitle = messageTitle;
        this.messageEmail = messageEmail;
        this.messageContent = messageContent;
        this.messageDate = messageDate;
    }

    public Message(String messageTitle, String messageEmail, String messageContent, Date messageDate) {
        this.messageTitle = messageTitle;
        this.messageEmail = messageEmail;
        this.messageContent = messageContent;
        this.messageDate = messageDate;
    }

    public String getMessageEmail() {
        return messageEmail;
    }

    public void setMessageEmail(String messageEmail) {
        this.messageEmail = messageEmail;
    }
   

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public String getMessageTitle() {
        return messageTitle;
    }

    public void setMessageTitle(String messageTitle) {
        this.messageTitle = messageTitle;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public Date getMessageDate() {
        return messageDate;
    }

    public void setMessageDate(Date messageDate) {
        this.messageDate = messageDate;
    }
     
}
