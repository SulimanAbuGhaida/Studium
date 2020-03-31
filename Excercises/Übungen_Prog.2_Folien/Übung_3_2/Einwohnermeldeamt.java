package Übung_3_2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.*;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

public class Einwohnermeldeamt extends JFrame {

	
	public Einwohnermeldeamt() {
		this.setTitle("Einwohnermeldeamt");		
		
		//JPanel
		JPanel mainPanel   = new JPanel(new BorderLayout());
		JPanel centerPanel = new JPanel(new FlowLayout());
		
	
		//Kontaktdaten
		JPanel kontaktdatenPanel = new JPanel(new GridLayout(5,2));
		FlowLayout cellLeft = new FlowLayout( FlowLayout.LEFT);
		
		JPanel cellPanel = new JPanel(cellLeft);
		JLabel anrede = new JLabel("Anrede");
		cellPanel.add(anrede);
		kontaktdatenPanel.add(cellPanel);
		
		cellPanel = new  JPanel(cellLeft);
		String [] array = {"Frau", "Herr", "---"};
		JComboBox<String> anredeAuswahl = new JComboBox<String>(array);
		cellPanel.add(anredeAuswahl);
		kontaktdatenPanel.add(cellPanel);
		
		cellPanel = new JPanel(cellLeft);
		JLabel name = new JLabel("Name");
		cellPanel.add(name);
		kontaktdatenPanel.add(cellPanel);
		
		cellPanel = new JPanel(cellLeft);
		JTextField N = new JTextField(10);
		cellPanel.add(N);
		kontaktdatenPanel.add(cellPanel);
		
		cellPanel = new JPanel(cellLeft);
		JLabel vorname = new JLabel("Vorname");
		cellPanel.add(vorname);
		kontaktdatenPanel.add(cellPanel);
		
		cellPanel = new JPanel(cellLeft);
		JTextField V = new JTextField(10);
		cellPanel.add(V);
		kontaktdatenPanel.add(cellPanel);
		
		cellPanel = new JPanel(cellLeft);
		JLabel geburtsname = new JLabel("Geburtsname");
		cellPanel.add(geburtsname);
		kontaktdatenPanel.add(cellPanel);
		
		cellPanel = new JPanel(cellLeft);
		JTextField G = new JTextField(10);
		cellPanel.add(G);
		kontaktdatenPanel.add(cellPanel);
		
		cellPanel = new JPanel(cellLeft);
		JLabel email = new JLabel("E-Mail");
		cellPanel.add(email);
		kontaktdatenPanel.add(cellPanel);
		
		cellPanel = new JPanel(cellLeft);
		JTextField E = new JTextField(10);
		cellPanel.add(E);
		kontaktdatenPanel.add(cellPanel);
		//Border
		Border echtedBorder = BorderFactory.createEtchedBorder();
		Border kontaktBorder = BorderFactory.createTitledBorder(echtedBorder, "Kontaktdaten");
		kontaktdatenPanel.setBorder(kontaktBorder);

		centerPanel.add(kontaktdatenPanel,BorderLayout.EAST);
		
		
		//Familienstand
		JPanel famielienstandPanel= new JPanel(new GridLayout(4,0));
		JRadioButton ledig = new JRadioButton("ledig");
		JRadioButton verheiratet = new JRadioButton("verheiratet");
		JRadioButton verwittvet = new JRadioButton("geschieden");
		JRadioButton geschieden = new JRadioButton("geschieden");
		
		ButtonGroup group = new ButtonGroup();
		group.add(ledig);
		group.add(verheiratet);
		group.add(verwittvet);
		group.add(geschieden);
		
		famielienstandPanel.add(ledig);
		famielienstandPanel.add(verheiratet);
		famielienstandPanel.add(verwittvet);
		famielienstandPanel.add(geschieden);
		Border famielenBorder = BorderFactory.createTitledBorder(echtedBorder, "Famielenstand");
		famielienstandPanel.setBorder(famielenBorder);
		
		centerPanel.add(famielienstandPanel, BorderLayout.EAST);
		
		//addCenter
		mainPanel.add(centerPanel, BorderLayout.CENTER);
		Border centerBorder = BorderFactory.createBevelBorder(BevelBorder.LOWERED);
		centerPanel.setBorder(centerBorder);
		
		//Button
		JPanel buttonPanel = new JPanel(new FlowLayout());
		 JButton hinzufügen = new JButton("Hinzufügen");
		 JButton anzeigen = new JButton("Anzeigen");
		 JButton suchen = new JButton("Suchen");
		 JButton löchen = new JButton("Löchen");
		 
		 buttonPanel.add(hinzufügen);
		 buttonPanel.add(anzeigen);
		 buttonPanel.add(suchen);
		 buttonPanel.add(löchen);
		 
		 mainPanel.add(buttonPanel, BorderLayout.SOUTH);
		
		//North
		 JPanel northPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		 JLabel einwohner = new JLabel("Einwohner Hinzufügen");
		 northPanel.add(einwohner);
		 mainPanel.add(northPanel, BorderLayout.NORTH);
		 this.setContentPane(mainPanel);
		
		//set Frame behavior
		 this.pack();
		 this.setVisible(true);
		 this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
};
	public static void main (String []args) {
		
		new Einwohnermeldeamt();
	}
	
	
	
	}
	


