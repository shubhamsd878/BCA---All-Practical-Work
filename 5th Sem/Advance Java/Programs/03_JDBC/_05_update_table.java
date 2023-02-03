
import java.sql.*;
public class _05_update_table {
public static void main(String[] args) {

try{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection conn = DriverManager.getConnection("jdbc:odbc:shubham");

Statement stmt = conn.createStatement();
stmt.executeUpdate("update HIM set SName='Yashi',SCourse='MCA' where SAge=22 ");
conn.close();

System.out.println("Update successful");
}
catch(Exception e){
System.out.println("exception is: " + e.getMessage());
}

}
}
