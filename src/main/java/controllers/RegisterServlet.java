package controllers;

import dao.DaoFactory;
import models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO: show the registration form
        if (request.getSession().getAttribute("user") != null) {
            response.sendRedirect("/profile");
            return;
        }
        request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // TODO: ensure the submitted information is valid
        // TODO: create a new user based off of the submitted information
        // TODO: if a user was successfully created, send them to their profile
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String confirmPassword = request.getParameter("confirmPassword");
        User user = DaoFactory.getUsersDao().findByUsername(username);
        if (!inputHasErrors(username, email, password, confirmPassword, user)) {
        user = new User(user, email, password);
        DaoFactory.getUsersDao().insert(user);
            response.sendRedirect("/login");
        } else {
            response.sendRedirect("/register");
        }
    }

    public static boolean inputHasErrors(String username, String email, String password, String confirmPassword, User user) {
      if (user != null){
          return true;
      }
      if (!password.equals(confirmPassword)){
          return true;
      }
        return false;
    }
}
