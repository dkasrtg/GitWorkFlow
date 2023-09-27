import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/link")
public class LinkServlet extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Handle GET request
        String link = request.getParameter("link");
        // Do something with the link parameter
        // ...
        // Send response
        response.setContentType("text/html");
        response.getWriter().println("<h1>LinkServlet</h1><p>Link received: " + link + "</p>");
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Handle POST request
        String link = request.getParameter("link");
        // Do something with the link parameter
        // ...
        // Send response
        response.setContentType("text/html");
        response.getWriter().println("<h1>LinkServlet</h1><p>Link received: " + link + "</p>");
    }
}
