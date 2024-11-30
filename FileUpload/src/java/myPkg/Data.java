package myPkg;

import java.sql.Connection;
import java.sql.DriverManager;

public class Data {
    public static Connection connectDb(){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecomdata?useSSL=false&allowPublicKeyRetrieval=true", "root", "root");
        }catch(Exception e){
            System.out.println("_______________________");
            e.printStackTrace();
            System.out.println("_______________________");
        }
        
        return con;
    }
    
    
}
