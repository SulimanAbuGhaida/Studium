package chapter9;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class GridLayoutExample extends JFrame{
	
	public GridLayoutExample() {
		System.out.println("BorderLayoutExample");
	
	this.setLayout(new GridLayout(0,2));
	
	this.add(new JLabel("Feld 0"));
	this.add(new JLabel("Feld 1"));
	this.add(new JLabel("Feld 2"));
	this.add(new JLabel("Feld 3"));
	this.add(new JLabel("Feld 4"));
	this.add(new JLabel("Feld 5"));
	this.add(new JLabel("Feld 6"));
	this.add(new JLabel("Feld 7"));
	this.add(new JLabel("Feld 8"));
	this.add(new JLabel("Feld 9"));
	this.add(new JButton("Feld 10"));
	
	this.setVisible(true);
	this.pack();
	}
	public static void main (String [] args) {
		new GridLayoutExample();
	}
	
	

}
