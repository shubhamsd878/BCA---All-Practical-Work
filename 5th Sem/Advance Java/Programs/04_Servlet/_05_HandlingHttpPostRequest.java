import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class _05_HandlingHttpPostRequest extends HttpServlet{
public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
PrintWriter pw = res.getWriter();

res.setContentType("text/html");

String state = req.getParameter("state");
pw.println("<h1> The selected state is: </h1>");
pw.println( "<b><u>" + state + "</u></b>");

pw.close();
}

}
