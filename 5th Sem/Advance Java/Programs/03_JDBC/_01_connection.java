import java.util.*;
import java.sql.*;

class _01_connection{
public static void main(String[] args) {
try {
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection conn = DriverManager.getConnection("jdbc:odbc:shubham");
System.out.println("conn successful");

} catch (Exception e) {
System.out.println( "db not connected \nError is: " + e.getMessage());
}
}
}