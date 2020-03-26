package chapter9Excersises;

import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.*;


public class Example1  {
	


	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setSize(1000,100);
		frame.setVisible(true);
		frame.setLayout(null);
		
		JButton button = new JButton();
		
		JLabel lebel = new JLabel();
		
		button.setBounds(100,300,500,900);
		frame.add(button);
	
		frame.setLayout(new FlowLayout()); 
		button.setText("Hallo");
		

			button.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0){
					lebel.setText("Hallo!!! !");
					
				}});
	
	
	 
	}

}
