package chapter9Excersises;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.Border;

public class AufgabeChapter9 {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setLayout( new FlowLayout());
		JButton button1 = new JButton("Ok");
		JButton button2 = new JButton("Cancel");
		JPanel panel1 = new JPanel();
		panel1.add(button1, button2);

		Border rahmen1 = BorderFactory.createEtchedBorder();
		Border rahmen2 = BorderFactory.createTitledBorder(rahmen1, "Verbindung");
		Border rahmen3 = BorderFactory.createTitledBorder(rahmen1, "Dateien");
		
		JLabel label = new JLabel("User:   ");

		
		
		
		
		
		
		
	}

}
