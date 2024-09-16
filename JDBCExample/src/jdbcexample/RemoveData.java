package jdbcexample;

import java.sql.Statement;
import java.sql.Connection;

public class RemoveData {
    public static void main(String[] args) throws Exception {   
        Connection con = Utility.connnectDB();
        // step - 3
        Statement stmt = con.createStatement();
        
        // step - 4;
        int n = stmt.executeUpdate("DELETE FROM students WHERE id < 3");
        System.out.println(n + " rows deleted");
        
        // step - 5
        con.close();
    }
}
