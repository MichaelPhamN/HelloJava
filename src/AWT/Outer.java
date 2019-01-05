package AWT;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Outer implements ActionListener {
    Four obj;
    Outer(Four obj){
        this.obj = obj;
    }
    public void actionPerformed(ActionEvent e){
        obj.tf.setText("Welcome");
    }
}
