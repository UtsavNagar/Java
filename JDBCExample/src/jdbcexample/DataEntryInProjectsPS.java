package jdbcexample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DataEntryInProjectsPS {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter pcode : ");
        String pcode = sc.next();
        
        System.out.print("Enter ptitle : ");
        String ptitle = sc.next();
        
        System.out.print("Enter cname : ");
        String cname = sc.next();
        
        Connection con = Utility.connnectDB();
        
        String sql = "INSERT INTO projects VALUES (?,?,?)";
        
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(2, ptitle);
        ps.setString(3, cname);
        ps.setString(1, pcode);
        
        int rowsEffected = ps.executeUpdate();
        
        System.out.print(rowsEffected + " rows effected");
        
        con.close();
    }
}
