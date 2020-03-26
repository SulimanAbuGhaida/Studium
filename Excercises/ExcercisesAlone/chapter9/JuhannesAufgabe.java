package chapter9;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JuhannesAufgabe extends JFrame{

	
    private final String ACTION_COMMAND_CLOSE = "CLOSE";
    private final String ACTION_COMMAND_OK = "OK";
    private final String ACTION_COMMAND_SCHLIESSEN = "SCHLIESSEN";

    private JPanel createJPanelWithFlowLayoutLabel(String label){
        JPanel jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        jPanel.add(new JLabel(label));

        return jPanel;
    }

    private JPanel createJPanelWithFlowLayoutTextField(String text, int columns){
        JPanel jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        jPanel.add(new JTextField(text, columns));

        return jPanel;
    }

    private JuhannesAufgabe(){
        super("Layouts in Java");

        this.setLayout(new BorderLayout());
        ImageIcon icon = new ImageIcon("C:\\Users\\i516994\\OneDrive - SAP SE\\DHBW\\Vorlesungen\\ZweitesSemester\\Programmierung\\Übungen\\icon.png");
        this.setIconImage(icon.getImage());

        Border thick = BorderFactory.createBevelBorder(BevelBorder.LOWERED);
        Border connections = BorderFactory.createTitledBorder("Verbindungen");
        Border data = BorderFactory.createTitledBorder("Dateien");

        //Rote Box
        JPanel flowLayoutCenter = new JPanel(new FlowLayout());
        flowLayoutCenter.setBorder(thick);

        //Blaue Box Verbindungen
        JPanel gridLayoutConnections = new JPanel(new GridLayout(5, 2));
        gridLayoutConnections.setBorder(connections);

        //User-Layout
        JPanel userText = createJPanelWithFlowLayoutLabel("User:");
        JPanel userInput = createJPanelWithFlowLayoutTextField("", 3);

        //Passwort-Layout
        JPanel passwordText = createJPanelWithFlowLayoutLabel("Passwort:");
        JPanel passwordInput = createJPanelWithFlowLayoutTextField("", 5);

        //Art-Layout
        JPanel kindText = createJPanelWithFlowLayoutLabel("Art:");
        String[] items = {"FTP", "Telnet", "HTTP", "SMTP"};
        JPanel kind = new JPanel(new FlowLayout(FlowLayout.LEFT));
        kind.add(new JComboBox(items));

        //Host-Layout
        JPanel hostText = createJPanelWithFlowLayoutLabel("Host:");
        JPanel hostInput = createJPanelWithFlowLayoutTextField("", 5);

        //Port-Layout
        JPanel portText = createJPanelWithFlowLayoutLabel("Port:");
        JPanel portInput = createJPanelWithFlowLayoutTextField("", 1);

        gridLayoutConnections.add(userText);
        gridLayoutConnections.add(userInput);
        gridLayoutConnections.add(passwordText);
        gridLayoutConnections.add(passwordInput);
        gridLayoutConnections.add(kindText);
        gridLayoutConnections.add(kind);
        gridLayoutConnections.add(hostText);
        gridLayoutConnections.add(hostInput);
        gridLayoutConnections.add(portText);
        gridLayoutConnections.add(portInput);

        //Blaue Box Dateien
        JPanel gridLayoutData = new JPanel(new GridLayout(2, 2));
        gridLayoutData.setBorder(data);

        //Quelle-Layout
        JPanel sourceText = createJPanelWithFlowLayoutLabel("Quelle:");
        JPanel sourceInput = createJPanelWithFlowLayoutTextField("", 7);

        //Target-Layout
        JPanel targetText = createJPanelWithFlowLayoutLabel("Ziel:");
        JPanel targetInput = createJPanelWithFlowLayoutTextField("", 7);

        gridLayoutData.add(sourceText);
        gridLayoutData.add(sourceInput);
        gridLayoutData.add(targetText);
        gridLayoutData.add(targetInput);


        flowLayoutCenter.add(gridLayoutConnections);
        flowLayoutCenter.add(gridLayoutData);

        ActionListener closeActionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(actionEvent.getActionCommand().equals(ACTION_COMMAND_CLOSE)){
                    System.exit(0);
                }
            }
        };

        //Grüne Box
        JPanel flowLayoutBottom = new JPanel(new FlowLayout());

        JButton ok = new JButton("OK");
        ok.setActionCommand(ACTION_COMMAND_OK);

        JButton cancel = new JButton("Cancel");
        cancel.setActionCommand(ACTION_COMMAND_CLOSE);
        cancel.addActionListener(closeActionListener);
        flowLayoutBottom.add(cancel);

        //Nachricht Box
        JPanel flowLayoutMessage = new JPanel(new FlowLayout());
        JLabel message = new JLabel("Die Daten wurden erfolgreich übernommen.");
        message.setForeground(Color.GREEN);
        JButton schliessen = new JButton("Schließen");
        schliessen.setActionCommand(ACTION_COMMAND_SCHLIESSEN);
        flowLayoutMessage.add(message);
        flowLayoutMessage.add(schliessen);


        ActionListener schliessenActionListener = (ActionEvent actionEvent) -> {
            if(actionEvent.getActionCommand().equals("SCHLIESSEN")){
                System.exit(0);
            }
        };

        ActionListener okActionListener = (ActionEvent actionEvent) -> {
            if (actionEvent.getActionCommand().equals("OK")) {

                flowLayoutBottom.setVisible(false);
                this.add(flowLayoutMessage, BorderLayout.SOUTH);
                flowLayoutMessage.setVisible(true);
            }
        };

        ok.addActionListener(okActionListener);
        schliessen.addActionListener(schliessenActionListener);

        flowLayoutBottom.add(ok);

        this.add(flowLayoutCenter);
        this.add(flowLayoutBottom, BorderLayout.SOUTH);

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
    }

    public static void main(String[] args) {

        new JuhannesAufgabe();
    }
}

