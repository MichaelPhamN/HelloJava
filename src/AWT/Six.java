package AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Six extends Frame {
    public static void main(String[] args){
        Frame f = new Frame("Button Example");
        Button b = new Button("Click me");
        TextField tf = new TextField();
        tf.setBounds(50,50, 150,20);
        b.setBounds(50,100,60,30);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("Welcome to Java");
            }
        });
        f.add(b);
        f.add(tf);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
