package myPkg;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import java.sql.DriverManager;
import java.sql.Connection;
import jakarta.servlet.ServletContext;

public class StartingHandler implements ServletContextListener {
    private Connection con ; 

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // stablise a DB connection
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/coviddata?useSSL=false","root","root");
            ServletContext cntx = sce.getServletContext();
            
            cntx.setAttribute("DB_CONNECTION", con);
            
            System.out.println("DB Connected");
        }catch(Exception e){
            System.out.println("Exception Occures while connection to DB" + e);
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // close a DB connection
        try{
            System.out.println("DB Connection Closed");
            con.close();
        }catch(Exception e){
            System.out.println("Exception Occures while closing the connetion with DB" + e);
        }
    }
}
