package myPkg;


import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

public class StartingEventHandler implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Web listner init called...................");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Web listner destroyer called...................");
    }
}
