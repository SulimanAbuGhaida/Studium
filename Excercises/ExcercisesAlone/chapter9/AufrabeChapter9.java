package chapter9;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.*;
import java.awt.event.ItemListener;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class AufrabeChapter9 extends JFrame{
	
	
	
	public AufrabeChapter9 () {
		super("Hallo");
		
		
		
		this.setLayout(new BorderLayout());
		
		
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(0,2,5,50));
		
		panel1.add(new JLabel ("User:      "));
		panel1.add(new JTextField(2));
		panel1.add(new JLabel ("Passwort:  "));
		panel1.add(new JTextField(5));
		panel1.add(new JLabel ("Art:       "));
		Object[] werte = {"FTP"};
		panel1.add(new JComboBox(werte));
		panel1.add(new JLabel ("Host:      "));
		panel1.add(new JTextField());
		panel1.add(new JLabel ("Pot: "));
		panel1.add(new JTextField(1));
		panel1.setLayout(new GridLayout(5,2,0,10));
		
		this.add(panel1,BorderLayout.WEST);
		
		TitledBorder leftBorder = BorderFactory.createTitledBorder("Verbindung");
		panel1.setBorder(leftBorder);

		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(0,2,5,50));
		panel2.add(new JLabel("Quelle:"));
		panel2.add(new JTextField(10));
		panel2.add(new JLabel("Ziel:"));
		panel2.add(new JTextField(10));
		//panel2.setPreferredSize(new Dimension(200, 500));
		this.add(panel2,BorderLayout.EAST);
		TitledBorder rightBorder = BorderFactory.createTitledBorder("Dateien");
		panel2.setBorder(rightBorder);

		JPanel panel3 = new JPanel();
		panel3.add(new JButton("OK"));
		panel3.add(new JButton("Cancel"));
		
		panel3.setLayout(new FlowLayout());
		this.add(panel3,BorderLayout.SOUTH);
		
		
		
		this.setVisible(true);
		this.pack();
		
		
	}
	
	public static void main(String[] args) {
		new AufrabeChapter9();
	}

}
