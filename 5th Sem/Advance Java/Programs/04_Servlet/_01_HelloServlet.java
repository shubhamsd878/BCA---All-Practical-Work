import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class _01_HelloServlet extends HttpServlet {

public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{

res.setContentType("text/html");
PrintWriter out = res.getWriter();

out.println("<html>");
out.println("<body>");
out.println("<h1> Hello Shubham from Servlet");
out.println("</h1>");
out.println("</body>");
out.println("</html>");
}


}