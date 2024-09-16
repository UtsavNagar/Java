/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiexample;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

/**
 *
 * @author utsav
 */
public class CustomLayout {
    public static void main(String[] args) {
        
        // create fram
        Frame f1 = new Frame();
        f1.setVisible(true);
        f1.setSize(500,500);
        
        
        //Create component
        Label l1 = new Label("Name");
        TextField fl1 = new TextField(10);
        Label l2 = new Label("Age");
        TextField fl2 = new TextField(10);
        Button b1 = new Button("Save");
        Button b2 = new Button("Cancel");
        
        
        f1.setLayout(null);
        
        l1.setSize(50,30);
        l1.setLocation(100,50);
        f1.add(l1);
        
        fl1.setSize(130,30);
        fl1.setLocation(150,50);
        f1.add(fl1);
        
        l2.setSize(50,30);
        l2.setLocation(100,100);
        f1.add(l2);
        
        fl2.setBounds(150,100,130,30);
//        fl2.setSize(130,30);
//        fl2.setLocation(150,100);
        f1.add(fl2);
    }
}
