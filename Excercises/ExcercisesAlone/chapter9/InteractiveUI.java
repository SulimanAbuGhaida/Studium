package chapter9;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class InteractiveUI  extends JFrame{
	
	private final String close = "CLOSE";
	public InteractiveUI() {
		System.out.println("InterActiveUI");
		
		this.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		this.add(new JLabel("Flow Layout Example!"));
		JButton button0 = new JButton("Drück mich!");
		JButton button1 = new JButton("Schiessen!");
		
		ActionListener action=(ActionEvent i)->{
			System.out.println("Button wurde gedrückt!");
			System.out.println("Action Command: "+ i.getActionCommand());
			
			if(i.getActionCommand().equals(close)) {
				System.exit(0);
				
			}
		};
			button0.addActionListener(action);
			button1.addActionListener(action);
			button1.setActionCommand(close);
			
			this.add(button0);
			this.add(button1);
			this.setVisible(true);
			this.pack();
			

		
	}

	

	
	
	public static void main(String[] args) {
		
		new InteractiveUI();
	}

}
