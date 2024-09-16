package jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;



public class Utility {
    public static Connection connnectDB() throws Exception{
        // step - 1
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        // step - 2
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
        
        return con;
    }
}
