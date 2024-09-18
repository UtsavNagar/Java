package jdbcexample;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSetExmp2 {
    public static void main(String[] args) throws Exception {
        Connection con = Utility.connnectDB();
        
        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        
        String sql = "SELECT * FROM students";
        
        ResultSet rs = stmt.executeQuery(sql);
        
        while(rs.next()){
            System.out.println(rs.getString("id"));
        }
        
//        rs.first();
        rs.beforeFirst();
        
        while(rs.next()){
            System.out.println(rs.getString(2));
        }
        
        rs.absolute(2);
        System.out.println("index 2 : " + rs.getString(2));
        
        con.close();
    }
}