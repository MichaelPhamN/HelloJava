package AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Eleven extends Frame {
    public static int countCharacters(String text){
        return text.length();
    }

    public static int countWords(String text){
        if(text.length() > 0)
            return text.split("\\s").length;
        return 0;
    }
    public static void main(String[] args){
        Frame f = new Frame("Count Words");
        Label l1 = new Label();
        l1.setBounds(30,30,100,30);
        Label l2 = new Label();
        l2.setBounds(150,30,100,30);
        TextArea ta = new TextArea();
        ta.setBounds(20, 80, 260, 240);
        String str;
        Button b = new Button("Count Words");
        b.setBounds(100,330,100,30);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("Characters: " + countCharacters(ta.getText()));
                l2.setText("Words: " + countWords(ta.getText()));
            }
        });
        f.add(l1);
        f.add(l2);
        f.add(ta);
        f.add(b);
        f.setSize(300, 380);
        f.setLayout(null);
        f.setVisible(true);
    }
}
