package jdbcexample;

import java.sql.Connection;
import java.sql.Statement;

public class PromoteStudents {
    public static void main(String[] args) throws Exception {
        Connection con = Utility.connnectDB();
        
        Statement stmt = con.createStatement();
        
        int n = stmt.executeUpdate("UPDATE students SET sem = sem+1");
        
        System.out.println(n + " rows effected");
        
        con.close();
    }
}
