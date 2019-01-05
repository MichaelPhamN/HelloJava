package AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Eight extends Frame {
    public static void main(String[] args){
        Frame f = new Frame("What is my IP?");
        TextField tf = new TextField();
        tf.setBounds(50,50,300,20);
        Label lb = new Label();
        lb.setBounds(50,100, 300,20);
        Button b = new Button("Find IP");
        b.setBounds(50,150,300,20);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String host = tf.getText();
                    String ip = java.net.InetAddress.getByName(host).getHostAddress();
                    lb.setText("IP of " + host + " is: " + ip);
                }catch(Exception ex){
                    System.out.println(ex);
                }
            }
        });
        f.add(tf);
        f.add(b);
        f.add(lb);
        f.setSize(400,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
