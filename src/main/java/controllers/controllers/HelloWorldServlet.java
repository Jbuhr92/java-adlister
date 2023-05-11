<<<<<<<< HEAD:src/main/java/controllers/HelloWorldServlet.java
package controllers;
========
package controllers.controllers;
>>>>>>>> javabeans:src/main/java/controllers/controllers/HelloWorldServlet.java

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

<<<<<<<< HEAD:src/main/java/controllers/HelloWorldServlet.java

========
@WebServlet(name = "controllers.HelloWorldServlet", urlPatterns = "/hello")
>>>>>>>> javabeans:src/main/java/controllers/controllers/HelloWorldServlet.java
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().println("<h1>Hello, World!</h1>");
    }
}
