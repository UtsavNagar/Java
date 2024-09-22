package jdbcexample;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class GroupByExample {
    public static void main(String[] args) throws Exception {
        Connection con = Utility.connnectDB();
        
        Statement stmt = con.createStatement();
        
        String sql = "SELECT desg,SUM(sal),AVG(sal) FROM emp GROUP BY desg";
        
        ResultSet rs = stmt.executeQuery(sql);
        
        while(rs.next()){
            System.out.println(rs.getString("desg") + " | " + rs.getString(2) + " | " + rs.getString(3));
        }
        
        con.close();
    }
}
