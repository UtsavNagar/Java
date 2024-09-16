package jdbcexample;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class PSExample {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Roll Number For Promotion : ");
        int n = sc.nextInt();
        
        String sql = "UPDATE students SET sem=sem+1 WHERE id=?"; // ? is for parameter
        
        Connection con = Utility.connnectDB();
        
        PreparedStatement ps = con.prepareStatement(sql);
        
        ps.setInt(1, n);                                         // parameter assigned with setter method
        
        int rowsEffected = ps.executeUpdate();
        
        System.out.println(rowsEffected + " rows effected");
        
        con.close(); 
    } 
}
