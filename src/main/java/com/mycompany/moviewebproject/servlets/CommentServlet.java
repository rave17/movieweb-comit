/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.moviewebproject.servlets;

import com.mycompany.moviewebproject.model.DAO.CommentsDAO;
import com.mycompany.moviewebproject.model.entities.Comment;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "CommentServlet", urlPatterns = {"/comment"})
public class CommentServlet extends HttpServlet {

 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
   
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
       
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        HttpSession session = request.getSession();
        System.out.println(session);
        String content = request.getParameter("content");
        
        
        CommentsDAO commentDAO = new CommentsDAO();
        
        Comment addComment = new Comment();
       
        addComment.setCommentContent(content);

        commentDAO.saveComment(addComment);
       
        request.getRequestDispatcher("movie.jsp").forward(request, response);
    }

    @Override
    
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
