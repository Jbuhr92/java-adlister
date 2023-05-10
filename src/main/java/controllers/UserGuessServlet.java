package controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet("/guess")
public class UserGuessServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/guessingGame/guess.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Random rand = new Random();
        int randomNumber = rand.nextInt(3) + 1;

        String userGuess = req.getParameter("userGuess");
        int userGuessInt = Integer.parseInt(userGuess);

        if (userGuessInt > 3 || userGuessInt < 1) {
            resp.sendRedirect("/guess");
        } else if (userGuessInt != randomNumber) {
            resp.sendRedirect("/incorrect");
        } else {
            resp.sendRedirect("/correct");
        }
    }
}
