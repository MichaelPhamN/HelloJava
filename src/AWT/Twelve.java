package AWT;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Twelve extends Frame {
    public static void main(String[] args){
        Frame f = new Frame("Checkbox Example");
        Label lb = new Label();
        lb.setAlignment(Label.CENTER);
        lb.setSize(300, 100);
        Checkbox cb1 = new Checkbox("C++");
        Checkbox cb2 = new Checkbox("Java");
        cb1.setBounds(100,100,50,50);
        cb2.setBounds(100,150,50,50);
        cb1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                lb.setText("C++ Checkbox: " + (e.getStateChange() == 1 ? "checked" : "unchecked"));
            }
        });
        cb2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                lb.setText("Java Checkbox: " + (e.getStateChange() == 1 ? "checked" : "unchecked"));
            }
        });
        f.add(lb);
        f.add(cb1);
        f.add(cb2);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
