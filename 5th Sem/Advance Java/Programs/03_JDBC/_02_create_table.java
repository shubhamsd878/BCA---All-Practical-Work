import java.util.*;
import java.sql.*;

class _02_create_table{
public static void main(String[] args) {
try {
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
System.out.println("conn successful");

Connection conn = DriverManager.getConnection("jdbc:odbc:shubham");
Statement stmt = conn.createStatement();

// stmt.executeUpdate("create table HIM(SName String, SAge number, SCourse string )");
stmt.executeUpdate("create table HIM(SName text, SAge number, SCourse text )");
System.out.println("HIM table created");


} catch (Exception e) {
System.out.println( "Error is: " + e.getMessage());
}
}
}