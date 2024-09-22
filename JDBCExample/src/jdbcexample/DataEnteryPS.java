package jdbcexample;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class DataEnteryPS {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter id : ");
        int id = sc.nextInt();
        
        System.out.print("Enter ename : ");
        String name = sc.next();
        
        System.out.print("Enter sal : ");
        int sal = sc.nextInt();
        
        System.out.print("Enter desg : ");
        String desg = sc.next();
        
        System.out.print("Enter pcode : ");
        String pcode = sc.next();
        
        Connection con = Utility.connnectDB();
        
        String sql = "INSERT INTO emp VALUES (?,?,?,?,?)";
        
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setInt(3, sal);
        ps.setString(4, desg);
        ps.setString(5, pcode);
        
        int rowsEffected = ps.executeUpdate();
        
        System.out.print(rowsEffected + " rows effected");
        
        con.close();
    }
}
