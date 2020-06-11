/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.moviewebproject.servlets;

import com.mycompany.moviewebproject.model.DAO.UserDAO;
import com.mycompany.moviewebproject.model.entities.User;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "RegisterServlet", urlPatterns = {"/registeruser"})
public class RegisterServlet extends HttpServlet {


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
        
        UserDAO userDAO = new UserDAO();
        
        User user = new User();
        
        user.setUserName(request.getParameter("name"));
        user.setUserLastname(request.getParameter("lastname"));
        user.setUserEmail(request.getParameter("email"));
        user.setUserNickname(request.getParameter("nickname"));
        user.setUserAvatar(request.getParameter("avatar"));
        user.setUserPassword(request.getParameter("password"));
        user.setUserDescription(request.getParameter("description"));
        
        userDAO.SaveUser(user);
        
        System.out.println(user.getUserName());
        System.out.println(user.getUserLastname());
        System.out.println(user.getUserEmail());
        System.out.println(user.getUserNickname());
        System.out.println(user.getUserId());
        
        if(request.getParameter("email").equals(user.getUserEmail())){
            String messageExist = "Forget your password?";
            
            request.setAttribute("messageExist", messageExist);
          
            request.getRequestDispatcher("login").forward(request, response);
        }else{
            session.setAttribute("userLog", user);
    
            
            request.getRequestDispatcher("userprofile.jsp").forward(request, response);
            
        }
        
        request.setAttribute("user", user);
        
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
