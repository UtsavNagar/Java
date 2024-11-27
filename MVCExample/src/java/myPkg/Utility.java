package myPkg;

import java.sql.Connection;
import java.sql.DriverManager;

public class Utility {
    private Connection con;
    private Connection connectDB(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/coviddata", "root", "root");
            System.out.println("Connection successful!");
            return con;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    private void closeConnection(){
        try {
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
