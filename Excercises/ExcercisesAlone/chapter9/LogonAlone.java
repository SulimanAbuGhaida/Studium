package chapter9;

import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.text.MaskFormatter;

public class LogonAlone extends JFrame {
	
	private JTextField host;
	private static final String COMMAND_OK = "OK";
	private static final String COMMAND_CANCEL = "CANCEL";
	
	
	public LogonAlone() throws ParseException { 
		// Port المشكلة هون بزتها مشان اذا صار خطأ بالادخال بحقل 
		
		//set Frame behavior
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	JPanel mainPanel = new JPanel(new BorderLayout()); 
	JPanel centerPanel = new JPanel(new FlowLayout());
	JPanel connectionPanel = new JPanel(new GridLayout(5,2));
	JPanel filePanel = new JPanel(new GridLayout(2,2));
	JPanel south = new JPanel(new FlowLayout());
	centerPanel.add(connectionPanel);
	//When I wrote this,
	//only God and I understood,
	//what I was doing.
	//Now, God only knows
	//^_^ سليمان أبو غيدا
	//Suliman Abu Ghaida 
	centerPanel.add(filePanel);
	mainPanel.add(centerPanel,BorderLayout.CENTER);
	mainPanel.add(south, BorderLayout.SOUTH);	
	this.setContentPane(mainPanel);
	FlowLayout cellFlowLayout = new FlowLayout(FlowLayout.LEFT);
	JPanel flowLayoutForCell = new JPanel(cellFlowLayout);
	
	flowLayoutForCell.add(new JLabel("User:"));
	connectionPanel.add(flowLayoutForCell);
	
	flowLayoutForCell = new JPanel(cellFlowLayout);
	flowLayoutForCell.add(new JTextField(5));
	connectionPanel.add(flowLayoutForCell);
	
	flowLayoutForCell = new JPanel(cellFlowLayout);
	flowLayoutForCell.add( new JLabel("Password"));
	connectionPanel.add(flowLayoutForCell);
	
	flowLayoutForCell = new JPanel(cellFlowLayout);
	flowLayoutForCell.add( new JPasswordField(5));
	connectionPanel.add(flowLayoutForCell);
	
	flowLayoutForCell = new JPanel(cellFlowLayout);
	flowLayoutForCell.add(new JLabel("Art"));

	flowLayoutForCell = new JPanel(cellFlowLayout);
	String[] arrayArt = {"FTP", "Telnet", "SMTP", "HTTP"};
	JComboBox<String> myComboBox = new JComboBox<String>(arrayArt);
	flowLayoutForCell.add(myComboBox);
	
	flowLayoutForCell = new JPanel(cellFlowLayout);
	flowLayoutForCell.add(new JLabel("Host"));
	connectionPanel.add(flowLayoutForCell);
	 
	flowLayoutForCell = new JPanel(cellFlowLayout);
	flowLayoutForCell.add(host);
	connectionPanel.add(flowLayoutForCell);

		host.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("typed");
                System.out.println("Char: " + e.getKeyChar());
                System.out.println("KeyCode: " + e.getKeyCode());
                System.out.println("extended KeyCode: " + e.getExtendedKeyCode());
                System.out.println("Modifier: " + e.getModifiersEx());
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("pressed");
                System.out.println("Char: " + e.getKeyChar());
                System.out.println("KeyCode: " + e.getKeyCode());
                System.out.println("extended KeyCode: " + e.getExtendedKeyCode());
                System.out.println("Modifier: " + e.getModifiersEx());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("released");
                System.out.println("Char: " + e.getKeyChar());
                System.out.println("KeyCode: " + e.getKeyCode());
                System.out.println("extended KeyCode: " + e.getExtendedKeyCode());
                System.out.println("Modifier: " + e.getModifiersEx());
            }
        });
	
	
	flowLayoutForCell = new JPanel(cellFlowLayout);
	flowLayoutForCell.add( new JLabel("Port"));
	
	
	JFormattedTextField  o = new JFormattedTextField(new MaskFormatter("#####"));
	//Exception هون لازم زت مشكلة الى
	// مشات اذا تم ادخال خطأ
	o.setColumns(3);
	
	flowLayoutForCell = new JPanel (cellFlowLayout);
	flowLayoutForCell.add(o);
	connectionPanel.add(flowLayoutForCell);
	
	
	//create & add Fields for file Area
	flowLayoutForCell = new JPanel(cellFlowLayout);
	flowLayoutForCell.add(new JLabel("Quelle"));
	filePanel.add(flowLayoutForCell);
	
	flowLayoutForCell = new JPanel(cellFlowLayout);
	flowLayoutForCell.add(new JTextField(10));
	filePanel.add(flowLayoutForCell);
	
	flowLayoutForCell= new JPanel(cellFlowLayout);
	flowLayoutForCell.add(new JLabel("Ziel"));
	filePanel.add(flowLayoutForCell);
	
	flowLayoutForCell= new JPanel(cellFlowLayout);
	flowLayoutForCell.add(new JTextField(10));
	filePanel.add(flowLayoutForCell);
	
	//Buttons
	JButton okButton = new JButton("OK");
	okButton.setActionCommand(COMMAND_OK);
	
	ActionListener buttonListener =(ActionEvent e) -> {
		switch(e.getActionCommand())
		{
			case COMMAND_OK:
				System.out.println("okay pressed");
				break;
			case COMMAND_CANCEL:
				System.out.println("Cancel pressed");
				System.exit(0);
				break;
		
		}
		};
	okButton.addActionListener(buttonListener);
	
	
	JButton cancel = new JButton("cancel");
	cancel.setActionCommand(COMMAND_CANCEL);
	cancel.addActionListener(buttonListener);
	
	
	okButton.addMouseListener
	(new MouseListener()
	{
	
		@Override
		public void mouseClicked(MouseEvent e) {
			
		}
		@Override
		public void mousePressed(MouseEvent e) {
			
		}
		@Override
		public void mouseReleased(MouseEvent e) {
		}
			@Override
			public void mouseExited(MouseEvent e) {
				((JButton)e.getSource()).setEnabled(true);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				((JButton)e.getSource()).setEnabled(false);
                System.out.println("Haha");
			}
	});
	
	south.add(okButton);
	south.add(cancel);
	
	
	//create & assign Borders
	Border etachedBorder = BorderFactory.createEtchedBorder();
	Border connectionBorder = BorderFactory.createTitledBorder(etachedBorder,"Verbindung");
	Border fileBorder = BorderFactory.createTitledBorder(etachedBorder,"Datei");
	Border centerBorder = BorderFactory.createBevelBorder(BevelBorder.LOWERED);
	
	connectionPanel.setBorder(connectionBorder);
	filePanel.setBorder(fileBorder);
	centerPanel.setBorder(centerBorder);
	}//Constroktor
	
public static void main (String[] args) throws ParseException{
	Dimension screenDimension = Toolkit.getDefaultToolkit().getScreenSize();
	System.out.println("Screen: " + screenDimension.getHeight() + " X "+ screenDimension.getWidth());;

	new LogonAlone();
}
	
	}