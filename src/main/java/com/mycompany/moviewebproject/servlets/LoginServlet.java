/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.moviewebproject.servlets;
import com.mycompany.moviewebproject.model.DAO.LoginDAO;
import com.mycompany.moviewebproject.model.DAO.UserDAO;
import com.mycompany.moviewebproject.model.entities.User;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "LoginServlet", urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
      HttpSession session = request.getSession();
      User userSessionActive = (User) session.getAttribute("userLog");
      
        System.out.println(userSessionActive.getUserEmail());
        
      
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String emailParam = request.getParameter("email");
        String passwordParam = request.getParameter("password");
        
        User userLogged = new User();
        
        userLogged.setUserEmail(emailParam);
        userLogged.setUserPassword(passwordParam);
        
        LoginDAO loginDAO = new LoginDAO();
        
         userLogged = loginDAO.userLogin(emailParam, passwordParam);
        
        if(emailParam.equals(userLogged.getUserEmail()) && passwordParam.equals(userLogged.getUserPassword())) {
            
            HttpSession session = request.getSession();
            session.setAttribute("userLog", userLogged);
            System.out.println("logged: " + userLogged.getUserName());
            
            request.getRequestDispatcher("userprofile.jsp").forward(request, response);
        } else {
            
            String message = "Invalid email/password";
            request.setAttribute("message", message);
            
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }    
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
