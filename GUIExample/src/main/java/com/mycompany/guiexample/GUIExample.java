/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiexample;

import java.awt.*;

/**
 *
 * @author utsav
 */
public class GUIExample {

    public static void main(String[] args) {
        
        // create fram
        Frame f1 = new Frame();
        f1.setVisible(true);
        f1.setSize(400,400);
        
        
        //Create component
        Label l1 = new Label("Name");
        TextField fl1 = new TextField(15);
        Button b1 = new Button("Save");
        Button b2 = new Button("Cancel");
        
        
        // add components in fram 
        //f1.add("West", l1); f1.add("East",fl1) ; f1.add("North",b1);  // default
        
        // FlowLayout
        f1.setLayout(new FlowLayout());
        f1.add(l1); f1.add(fl1) ; f1.add(b1);
        f1.pack();
        
        // GridLayout
        f1.setLayout(new GridLayout(2,2));
        f1.add(l1); f1.add(fl1) ; f1.add(b1); f1.add(b2);
        f1.pack();
    }
}
