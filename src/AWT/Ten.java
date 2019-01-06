package AWT;

import java.awt.*;

public class Ten extends Frame {
    public static void main(String[] args){
        Frame f = new Frame("Text Area Example");
        TextArea ta = new TextArea("Welcome to Java");
        ta.setBounds(20, 40, 260, 240);
        f.add(ta);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

}
