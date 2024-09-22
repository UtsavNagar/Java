package jdbcexample;

import java.sql.DatabaseMetaData;
import java.sql.Connection;

public class DBMT_Exm {
    public static void main(String[] args) throws Exception {
        Connection con = Utility.connnectDB();
        
        DatabaseMetaData dbmt = con.getMetaData();
        
        String dbName = dbmt.getDatabaseProductName();
        String dbVersion = dbmt.getDatabaseProductVersion();
        String driverName = dbmt.getDriverName();
        String driverVersion = dbmt.getDriverVersion();
        
        System.out.println("Database product : " + dbName);
        System.out.println("Database version : " + dbVersion);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Driver Name:" + driverVersion);
        
        con.close();
    }
}
