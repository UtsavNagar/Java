package myPkg;

import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

public class SessionListnerExample implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("New user has Joined........");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("New user has left........");
    }
}
