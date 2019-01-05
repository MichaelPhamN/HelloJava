package AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Third extends Frame implements ActionListener {
    TextField tf;
    public Third(){
        Frame f = new Frame();
        tf = new TextField();
        tf.setBounds(60,50,170,20);
        Button b = new Button("Click me");
        b.setBounds(100,120,80,30);
        b.addActionListener(this);
        f.add(b);
        f.add(tf);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        tf.setText("Welcome");
    }
    public static void main(String[] args){
        new Third();
    }
}
