import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/counter")
public class CounterServlet extends HttpServlet {
    private static final String countAttributeName = "page_view_count";
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = getServletContext();

        Integer count = (Integer)context.getAttribute(countAttributeName);
        if (count == null) {
            count = 0;
        }

        String resetParameter = req.getParameter("reset");
        if (resetParameter != null &&resetParameter.equals("True")) {
            count = 0;
        } else if (resetParameter != null && resetParameter.equals("reset")) {
            count = 1;
        } else {
            count++;
        }

        context.setAttribute(countAttributeName, count);

        resp.setContentType("text/html");
        resp.getWriter().println("<html><head><title>Page View Count</title></head><body><h1>Page View Count: " + count + "</h1>");
        resp.getWriter().println("<form action=\"counter\" method=\"get\"><input type=\"hidden\" name=\"reset\" value=\"true\"><input type=\"submit\" value=\"reload\"></form>");
        resp.getWriter().println("<form action=\"counter\" method=\"get\"><input type=\"hidden\" name=\"reset\" value=\"reset\"><input type=\"submit\" value=\"reset\"></form>");
        resp.getWriter().println("</body></html>");

    }
}
