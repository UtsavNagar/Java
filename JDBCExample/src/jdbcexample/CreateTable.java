package jdbcexample;

import java.sql.Connection;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) throws Exception {
        Connection con = Utility.connnectDB();
        
        Statement stmt = con.createStatement();
        
        int n = stmt.executeUpdate("CREATE TABLE dummy (FIRSTCOL CHAR, SECONDCOL CHAR)") ;
        
        System.out.println();
        con.close();
    }
}
