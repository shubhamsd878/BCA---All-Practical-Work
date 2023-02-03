import java.util.*;
import java.sql.*;

class _04_select_table{
public static void main(String[] args) {
try {
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
System.out.println("conn successful");

Connection conn = DriverManager.getConnection("jdbc:odbc:shubham");

Statement stmt = conn.createStatement();
ResultSet rs  = stmt.executeQuery("select * from HIM");

System.out.println("records in HIM table are: ");
while(rs.next()){

System.out.print( rs.getString(1) +"\t");
System.out.print( rs.getString(2) +"\t");
System.out.println( rs.getString(3) );
}


System.out.println("--- end ---");

} catch (Exception e) {
System.out.println( "db not connected \nError is: " + e.getMessage());
}
}
}