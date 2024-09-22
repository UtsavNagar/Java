package jdbcexample;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DataEntryExmp {
    public static void main(String[] args) throws Exception {
        Connection con = Utility.connnectDB();
        
        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        
        String sql = "SELECT * FROM students";
        
        ResultSet rs = stmt.executeQuery(sql);
        Scanner sc = new Scanner(System.in);
        
        rs.moveToInsertRow();
        
        System.out.print("Enter Name : ");
        rs.updateString("name",sc.next());
        
        System.out.print("Enter Branch : ");
        rs.updateString("branch",sc.next());
        
        System.out.print("Enter sem : ");
        rs.updateInt("sem", sc.nextInt());
        
        rs.insertRow();
        
        con.close();
    }
}
