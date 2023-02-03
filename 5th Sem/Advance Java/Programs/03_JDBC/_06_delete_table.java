import java.sql.*;

public class _06_delete_table {
public static void main(String[] args) {
try {
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection conn = DriverManager.getConnection("jdbc:odbc:shubham");

Statement stmt = conn.createStatement();
stmt.executeUpdate("delete from Him where Sname='Shubham'");

conn.close();
System.out.println("Delete Successful");

} catch (Exception e) {
System.out.println(e.getMessage());
}
}
}
