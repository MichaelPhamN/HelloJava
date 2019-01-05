package AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Four extends Frame {
    TextField tf;
    public Four(){
        Frame f = new Frame();
        Button b = new Button("Click me");
        tf = new TextField();
        b.setBounds(100,120,80,30);
        tf.setBounds(60,50,170,20);
        //Register listener
        Outer o = new Outer(this);
        //outer
        b.addActionListener(o);
        f.add(b);
        f.add(tf);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args){
        new Four();
    }
}


