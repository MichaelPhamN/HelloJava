package AWT;

import java.awt.*;

public class First extends Frame {
    public First(){
        Button b = new Button("Click me");
        b.setBounds(30,100,80,30);
        add(b);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args){
        new First();
    }
}
