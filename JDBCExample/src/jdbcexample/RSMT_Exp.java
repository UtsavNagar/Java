package jdbcexample;

import java.sql.ResultSetMetaData;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class RSMT_Exp {
    public static void main(String[] args) throws Exception {
        Connection con = Utility.connnectDB();
        
        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        
        String sql = "SELECT * FROM students";
        
        ResultSet rs = stmt.executeQuery(sql);
        
        ResultSetMetaData rsmt = rs.getMetaData();              // meta data of rs is stored in rsmt variable
        
        // ResultSetMetaData methods
        int numOfCols = rsmt.getColumnCount();
        
        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i<numOfCols; i++){
            System.out.print("\t" + rsmt.getColumnName(i+1));
        }
        System.out.println();       // for break the line
        
        
        System.out.println("-----------------------------------------------------");
        
        while(rs.next()){
            for(int i=0; i<numOfCols; i++){
                System.out.print("\t" + rs.getString(i+1));
            }
            System.out.println();       // for break the line
        }
        
        System.out.println("-----------------------------------------------------");        
        con.close();
    }
}
