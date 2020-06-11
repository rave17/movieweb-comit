/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.moviewebproject.servlets;

import com.mycompany.moviewebproject.model.DAO.CommentsDAO;
import com.mycompany.moviewebproject.model.DAO.UserDAO;
import com.mycompany.moviewebproject.model.entities.Comment;
import com.mycompany.moviewebproject.model.entities.User;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author rober
 */
@WebServlet(name = "HomeServlet", urlPatterns = {"/home"})
public class HomeServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        
  
        
        CommentsDAO commentsDAO = new CommentsDAO();    
        ArrayList<Comment> commentsList = commentsDAO.getComments();
             
        request.setAttribute("comments", commentsList); 
        
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        

        

    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
