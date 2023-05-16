package controllers;

import dao.Ads;
import dao.DaoFactory;
import dao.MySQLAdsDao;
import models.Ad;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "controllers.CreateAdServlet", urlPatterns = "/ads/create")
public class CreateAdServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Ads adsDao = new MySQLAdsDao();
        List<Ad> ads = adsDao.all();

        req.setAttribute("ads", ads);
        req.getRequestDispatcher("/ads/index.jsp").forward(req, resp);
    }
}
