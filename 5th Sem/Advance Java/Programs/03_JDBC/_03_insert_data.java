import java.util.*;
import java.sql.*;

class _03_insert_data{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
try {
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
System.out.println("conn successful");

Connection conn = DriverManager.getConnection("jdbc:odbc:shubham");
// PreparedStatement ps = conn.prepareStatement("insert into HIM (SName, SAge, SCourse) values('Shubham', ?, 'BCA')");
// PreparedStatement ps = conn.prepareStatement("insert into HIM values('Shubham', 20, 'BCA')");
PreparedStatement ps = conn.prepareStatement("insert into HIM values( ?, ? , ?) ");

System.out.println("Enter name:");
String name = sc.next();
System.out.println("Enter age:");
int age = sc.nextInt();
System.out.println("Enter course:");
String course = sc.next();

ps.setString(1, name);
ps.setInt(2, age);
ps.setString(3, course);

// ps.setInt(1, 20);
ps.executeUpdate();

System.out.println("Data inserted in table");
conn.close();       // ----->  ********** most Important **********

} catch (Exception e) {
System.out.println( "db not connected \nError is: " + e.getMessage());
}
}
}