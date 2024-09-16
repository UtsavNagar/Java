
package jdbcexample;
import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded ");
            
            Connection con = DriverManager.getConnection("","","");
            System.out.println("Database Connected");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
            System.out.println("Driver Not Loaded ");        
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
}
