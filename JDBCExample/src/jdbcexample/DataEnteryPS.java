package jdbcexample;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class DataEnteryPS {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Name : ");
        String name = sc.next();
        
        System.out.print("Enter branch : ");
        String branch = sc.next();
        
        System.out.print("Enter semester : ");
        String sem = sc.next();
        
        Connection con = Utility.connnectDB();
        
        String sql = "INSERT INTO students (name,branch,sem) VALUES (?,?,?)";
        
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, name);
        ps.setString(2, branch);
        ps.setString(3, sem);
        
        int rowsEffected = ps.executeUpdate();
        
        System.out.print(rowsEffected + " rows effected");
        
        con.close();
    }
}
