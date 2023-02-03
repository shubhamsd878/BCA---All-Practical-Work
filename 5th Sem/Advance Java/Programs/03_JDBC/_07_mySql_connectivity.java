import java.sql.*;
public  class _07_mySql_connectivity {
    public static void main(String[] args) {
        try{
            // Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            // Class.forName("com.mysql.jdbc.Driver");
            System.out.println("h");
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("h");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shubham", "root","" );
            
            System.out.println("h");
            Statement stmt = conn.createStatement();
            
            // PreparedStatement ps = conn.prepareStatement("insert into temp values('shubham')")
            
            
            System.out.println("h");
            ResultSet rs = stmt.executeQuery("select * from temp;");

            while(rs.next()){
                System.out.println( rs.getString(1) + "\t" + rs.getInt(2) );
            }

	conn.close();

        }
        catch(Exception e){
            System.out.println("Exception occur");
            System.out.println( e.getLocalizedMessage());
            System.out.println(e.getMessage());
        }

    }
}
