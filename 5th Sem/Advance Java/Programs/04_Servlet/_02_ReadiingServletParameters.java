import java.io.*;
import javax.servlet.*;
import java.util.*;

public class _02_ReadiingServletParameters extends GenericServlet {
public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
PrintWriter pw = res.getWriter();
Enumeration e = req.getParameterNames();
while(e.hasMoreElements()){
String name = (String) e.nextElement();
String value = (String) req.getParameter(name);

pw.println( name + " = " + value );
pw.println( "-------------------------------------" );
}

pw.close();
}
}
