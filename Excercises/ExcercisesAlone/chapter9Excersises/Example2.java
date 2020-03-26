package chapter9Excersises;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example2 {
	
	public static void main (String[] args) {
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton button = new JButton();
		JTextField field = new JTextField(10);
		
		button.addActionListener((ActionListener) new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				button.setText(field.getText());
				
			}
		});
		frame.add(button);
		frame.add(field);
		frame.pack();
		
		
	

}}
