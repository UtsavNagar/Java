/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/ServletListener.java to edit this template
 */
package myPkg;

import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;

/**
 * Web application lifecycle listener.
 *
 * @author utsav
 */
public class RequestListnerExample implements ServletRequestListener {

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("New req recived........");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("req over........");
    }
}
