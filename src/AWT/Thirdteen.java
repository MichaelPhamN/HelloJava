package AWT;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Thirdteen extends Frame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("List Example");
		Label lb = new Label();
		List l1 = new List(4, false);
		List l2 = new List(4, true);
		l1.setBounds(50, 50, 200, 70);
		l1.add("C");
		l1.add("C++");
		l1.add("Java");
		l1.add("PHP");
		Button b = new Button("Show");
		b.setBounds(100, 130, 100, 30);
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String text = ", List 2: ";
				for(String frame:l2.getSelectedItems()) {
					text = text + frame;
				}
				
				lb.setText("List 1: " + l1.getItem(l1.getSelectedIndex()) + text );
			}
		});
		
		l2.setBounds(50, 170, 200, 70);
		l2.add("Tubo C++");
		l2.add("Spring");
		l2.add("Hibernate");
		l2.add("CodeIgniter");
		
		lb.setBounds(50, 250, 200, 30);
		f.add(l1);
		f.add(l2);
		f.add(b);
		f.add(lb);
		f.setSize(300, 300);
		f.setLayout(null);
		f.setVisible(true);
	}

}
