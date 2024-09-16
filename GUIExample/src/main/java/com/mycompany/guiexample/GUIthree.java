package com.mycompany.guiexample;


import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public final class GUIthree extends Frame implements ActionListener,ItemListener,
                                                     TextListener,FocusListener ,KeyListener,
                                                     MouseListener,WindowListener{
    public GUIthree(){
        initComponents();
    }
    
    public void initComponents(){
        setLayout(new FlowLayout());
        
        ch1 = new Choice();
        ch1.add("RAJGARH"); ch1.add("BHOPAL"); ch1.add("JABALPUR"); ch1.add("INDORE");
        
        t1 = new TextField(10);
        t2 = new TextField(10);
        b1 = new Button("Copy");
        b2 = new Button("Clear");
        b3 = new Button("Exit");
        
        // adding elements in form        
        add(ch1); add(t1); add(t2); add(b1); add(b2); add(b3);
        
        // connecting events to source 
        b2.addFocusListener(this);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        ch1.addItemListener(this);
        
        //t1.addTextListener(this);
        t1.addKeyListener(this);
        t2.addKeyListener(this);
        
        // mouseListenre
        b1.addMouseListener(this);        
        b2.addMouseListener(this);
        t1.addMouseListener(this);        
        t2.addMouseListener(this); 
        
        // window listeners
        addWindowListener(this);
    }
    public static void main(String[] args) {
        GUIthree obj = new GUIthree();
        obj.setVisible(true);
        obj.setSize(500,500);
    }
    
    private TextField t1,t2;
    private Button b1,b2,b3;
    private Choice ch1;

    @Override
    public void actionPerformed(ActionEvent ae) {  
        Button source = (Button)ae.getSource();
        if(source == b1){
            String str = t1.getText();
            t2.setText(str);
        }else if(source == b2){
            t2.setText("");
            t1.setText("");
        }else if(source == b3){
            System.exit(0);
        }
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        String item = ch1.getSelectedItem();
        setTitle(item);
    }

    @Override
    public void textValueChanged(TextEvent te) {
        String str = t1.getText();
        t2.setText(str);
    }

    @Override
    public void focusGained(FocusEvent fe) {
        t1.setText("Focus Gained");
    }

    @Override
    public void focusLost(FocusEvent fe) {
        t1.setText("Focus Lose");
    }

    @Override
    public void keyTyped(KeyEvent ke) {
//        int i = ke.getKeyCode();
//        t1.setText(Integer.toString(i));
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        int i = ke.getKeyCode();
        if(i==38){
            Object btn = ke.getSource();
            if(btn == t1){
                String str = t1.getText();
                String s = str.toUpperCase();
                t1.setText(s);
            }else if(btn == t2){
                String str = t2.getText();
                String s = str.toUpperCase();
                t2.setText(s);
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        int i = ke.getKeyCode();
        if(i==40){
            Object btn = ke.getSource();
            if(btn == t1){
                String str = t1.getText();
                String s = str.toLowerCase();
                t1.setText(s);
            }else if(btn == t2){
                String str = t2.getText();
                String s = str.toLowerCase();
                t2.setText(s);
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        Object src = me.getSource();
        if(src == b1){
            b1.setBackground(Color.blue);
        }
    }

    @Override
    public void mousePressed(MouseEvent me) {
        Object src = me.getSource();
        if(src == b2){
            b2.setBackground(Color.red);
        }
    }
 
    @Override
    public void mouseReleased(MouseEvent me) {
        Object src = me.getSource();
        if(src == b2){
            b2.setBackground(Color.blue);
        }
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        Object src = me.getSource();
        if(src == t1){
            t1.setBackground(Color.yellow);
        }else if(src == t2){
            t2.setBackground(Color.yellow);
        }
    }

    @Override
    public void mouseExited(MouseEvent me) {
        Object src = me.getSource();
        if(src == t2){
            t2.setBackground(Color.white);
        }else if(src == t1){
            t1.setBackground(Color.white);
        }
    }

    @Override
    public void windowOpened(WindowEvent we) {
        setTitle("Well-Come User");
    }

    @Override
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent we) {}

    @Override
    public void windowIconified(WindowEvent we) {
        // when window minimized
        setTitle("Stop");
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
         setTitle("Start");
    }

    @Override
    public void windowActivated(WindowEvent we) {}

    @Override
    public void windowDeactivated(WindowEvent we) {}
}
