package jdbcexample;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ShowEmpAndProjects {
    public static void main(String[] args) throws Exception {
        Connection con = Utility.connnectDB();
        
        Statement stmt = con.createStatement();
        
        String sql = "SELECT ename,ptitle FROM emp,projects WHERE emp.pcode=projects.pcode";
        
        ResultSet rs = stmt.executeQuery(sql);
        
        while(rs.next()){
            System.out.println(rs.getString("ename") + " | " + rs.getString(2));
        }
        
        con.close();
    }
}
