package jdbcexample;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class ResultSetExmp {
    public static void main(String[] args) throws Exception {
        Connection con = Utility.connnectDB();
        
        Statement stmt = con.createStatement();
        
        String sql = "SELECT * FROM students WHERE branch='CS'";
        
        ResultSet rs = stmt.executeQuery(sql);
        
        while(rs.next()){
            System.out.println(rs.getString(1) + " | " + rs.getString(2) + " | " + rs.getString(3) + " | " + rs.getString(4));
        }
        
        con.close();
    }
}
