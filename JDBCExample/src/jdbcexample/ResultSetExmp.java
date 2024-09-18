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
            System.out.println(rs.getString("id") + " | " + rs.getString(2) + " | " + rs.getString("branch") + " | " + rs.getInt(4));
        }
        
        con.close();
    }
}
