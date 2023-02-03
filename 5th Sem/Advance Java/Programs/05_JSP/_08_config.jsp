<%
out.println("Hii " + request.getParameter("name"));
%>

<br>

<%
String roll_no = config.getInitParameter("roll_no");
out.println("roll_no is: "+ roll_no);
%>