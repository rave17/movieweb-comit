/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.moviewebproject.servlets;

import com.mycompany.moviewebproject.model.DAO.MessageDAO;
import com.mycompany.moviewebproject.model.entities.Message;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rober
 */
@WebServlet(name = "MessageServlet", urlPatterns = {"/contact"})
public class MessageServlet extends HttpServlet {

 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        
        request.getRequestDispatcher("admin.jsp").forward(request, response);
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        MessageDAO messageDAO = new MessageDAO();
        
        Message message = new Message();
       
        message.setMessageTitle(request.getParameter("title"));
        message.setMessageEmail(request.getParameter("email"));
        message.setMessageContent(request.getParameter("message"));
        
        messageDAO.sendMessage(message);

        System.out.println("title " + message.getMessageTitle());
        System.out.println("email " + message.getMessageEmail());
        System.out.println("content " + message.getMessageContent());
        
            request.setAttribute("newMessage", message);
            request.getRequestDispatcher("contact.jsp").forward(request, response);
        
    }

 
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
