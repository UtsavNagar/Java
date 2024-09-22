package jdbcexample;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class UpdateDataInDB {
    public static void main(String[] args) throws Exception {
        Connection con = Utility.connnectDB();
        
        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        
        String sql = "SELECT * FROM students";
        
        ResultSet rs = stmt.executeQuery(sql);
        
        while(rs.next()){
            System.out.println(rs.getString("id") + " | " + rs.getString(2) + " | " + rs.getString("branch") + " | " + rs.getInt(4));
        }
        
        rs.absolute(3);
        rs.updateString("branch", "CS");
        rs.updateInt("sem", 1);
        
        rs.updateRow();
        
        con.close();
    }
}
