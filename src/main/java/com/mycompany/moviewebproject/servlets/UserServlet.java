
package com.mycompany.moviewebproject.servlets;

import com.mycompany.moviewebproject.model.DAO.CommentsDAO;
import com.mycompany.moviewebproject.model.DAO.UserDAO;
import com.mycompany.moviewebproject.model.entities.Comment;
import com.mycompany.moviewebproject.model.entities.User;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "UserServlet", urlPatterns = {"/user"})
public class UserServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {   
        
        HttpSession session = request.getSession();
        
        User userSession = (User) session.getAttribute("userLog");
        
        System.out.println("your session: " + userSession.getUserEmail());

        request.getRequestDispatcher("userprofile.jsp").forward(request, response);
        }

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
            HttpSession session = request.getSession();
            
            User userSession = (User) session.getAttribute("userLog");
            UserDAO userDAO = new UserDAO();   
            
            String nickname = request.getParameter("nickname");
            String avatar = request.getParameter("avatar");
            String description = request.getParameter("description");
            
            System.out.println("intialize edit");
            
            User userEdit = userDAO.getUser(userSession.getUserId());

            userEdit.setUserNickname(nickname);
            userEdit.setUserAvatar(avatar);
            userEdit.setUserDescription(description);
          
            userDAO.editUser(userEdit);
            
            System.out.println(userSession.getUserDescription());
            System.out.println(userEdit.getUserDescription());
            System.out.println("//////////////");
            System.out.println(userSession.getUserNickname());
            System.out.println(userEdit.getUserNickname());
 
            request.getRequestDispatcher("login").forward(request, response);
            
//revisar porque se guarda un nuevo usuario, cuando en realidad solo deberia actualizarse

//crear metodo para realizar comentarios
//integrar paginas restantes, movie(capturar id de pelicula y guardarlo en base de datos), explore(acoplar la session iniciada), contact(pagina de contacto para usuarios ), resetPass(simple page para resetear password), adminPaga(si llego)


    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
