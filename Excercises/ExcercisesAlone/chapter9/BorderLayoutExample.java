package chapter9;
import java.awt.*;

import javax.swing.*;


public class BorderLayoutExample extends JFrame{

	public BorderLayoutExample() {
		System.out.println("BorderLayoutExample!");
		JPanel northPanel = new JPanel(new FlowLayout());
		this.setVisible(true);
		this.pack();
		this.setLayout(new BorderLayout());
		this.add(new JButton("west"),BorderLayout.WEST);
		this.add(new JButton("East"),BorderLayout.EAST);
		this.add(new JButton("South"),BorderLayout.SOUTH);
		this.add(northPanel,BorderLayout.NORTH);
		this.add(new JButton("c"),BorderLayout.CENTER);
		this.add(new JButton("new Generic"));
	}
	public static void main(String[]args) {
		new BorderLayoutExample();
		
	}
}
