import java.io.*;
import java.util.*;
import javax.servlet.*;

public class _03_ReadingInitalizationParameters extends GenericServlet{
public void service (ServletRequest req, ServletResponse res) throws ServletException, IOException {
res.setContentType("text/html");
PrintWriter pw = res.getWriter();

ServletConfig config = getServletConfig();

String name = (String) config.getInitParameter("name");
String roll = (String) config.getInitParameter("roll_no");

// ----------- or ------------

// String name = (String) getInitParameter("name");
// String roll = (String) getInitParameter("roll_no");

pw.println("<b> Name: </b>" + name);
pw.println("<b> Roll No. </b>: " + roll);

pw.close();
}
}