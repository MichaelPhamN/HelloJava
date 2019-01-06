package AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Nine extends Frame {
    public static boolean isNumberic(String text){
        for(char c : text.toCharArray()){
            if(!Character.isDigit(c))
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        Frame f = new Frame("Calculator");
        TextField tf1 = new TextField();
        tf1.setBounds(50,50,200,20);
        TextField tf2 = new TextField();
        tf2.setBounds(50,80,200,20);
        TextField tf3 = new TextField();
        tf3.setBounds(50,110,200,20);
        Button b1 = new Button("+");
        b1.setBounds(50,140,30,30);
        Button b2 = new Button("-");
        b2.setBounds(90,140,30,30);
        //Action Listener
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text1 = tf1.getText();
                String text2 = tf2.getText();
                if(text1.length() > 0 && text2.length() > 0){
                    if(isNumberic(text1) && isNumberic(text2)){
                        int number1 = Integer.parseInt(text1);
                        int number2 = Integer.parseInt(text2);
                        String result = String.valueOf(number1 + number2);
                        tf3.setText(result);
                    }
                }
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text1 = tf1.getText();
                String text2 = tf2.getText();
                if(text1.length() > 0 && text2.length() > 0){
                    if(isNumberic(text1) && isNumberic(text2)){
                        int number1 = Integer.parseInt(text1);
                        int number2 = Integer.parseInt(text2);
                        String result = String.valueOf(number1 - number2);
                        tf3.setText(result);
                    }
                }
            }
        });

        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(b1);
        f.add(b2);
        f.setSize(300,200);
        f.setLayout(null);
        f.setVisible(true);
    }
}
