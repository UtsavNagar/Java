package jdbcexample;

import java.sql.Connection;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) throws Exception {
        Connection con = Utility.connnectDB();
        
        Statement stmt = con.createStatement();
        
        int n = stmt.executeUpdate("CREATE TABLE emp (eno INTEGER PRIMARY KEY,ename VARCHAR(10),sal INTEGER,desg VARCHAR(10),pcode VARCHAR(5))") ;
        n = stmt.executeUpdate("CREATE TABLE projects (pcode VARCHAR(5) PRIMARY KEY,ptitle VARCHAR(10),cname VARCHAR(10))") ;
        
        System.out.println();
        con.close();
    }
}
