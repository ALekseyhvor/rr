import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Registr {
	static JLabel reg = new JLabel("Registration");
	static JLabel login = new JLabel("Login: ");
	static JLabel password = new JLabel("Password: ");
	static JLabel message = new JLabel("Sucsessful registration!");
	static JFrame frame = new JFrame("Registr");
	static JFrame frame2 = new JFrame("Sucsess");
	static JButton button = new JButton("Registration");
	static JButton okButton = new JButton("OK");
	static JPanel mainPanel = new JPanel();
	static JPanel panel = new JPanel();
	static JPanel logPanel = new JPanel();
	static JPanel pasPanel = new JPanel();
	static JPanel messageButtonPanel = new JPanel();
	static JPanel buttonPanel = new JPanel();
	static JPanel messagePanel = new JPanel();
	static JTextField log = new JTextField(15);
	static JTextField pass = new JTextField(15);
	boolean checkStatus = true;

	public static void main(String[] args) {
		Registr reg = new Registr();
		reg.run();
	}
	public void run() {
		setUpGui();
	}
	
	public void setUpGui2() {
		message.setFont(new Font("Serif", Font.BOLD, 12));
		frame2.setSize(250, 120);
		frame2.setVisible(true);
		frame2.getContentPane().add(messagePanel);
		frame2.getContentPane().add(BorderLayout.SOUTH, messageButtonPanel);
		messageButtonPanel.add(okButton);
		messagePanel.add(message);
		okButton.addActionListener(new CloseFrame());
	}
	
	public void setUpGui() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.NORTH, panel);
		frame.getContentPane().add(BorderLayout.SOUTH, buttonPanel);
		frame.getContentPane().add(BorderLayout.WEST,mainPanel);
		frame.setSize(350, 200);
		frame.setVisible(true);
		
		button.addActionListener(new CheckFields());
		logPanel.add(login);
		logPanel.add(log);
		
		pasPanel.add(password);
		pasPanel.add(pass);
		
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		mainPanel.add(logPanel);
		mainPanel.add(pasPanel);
		
		panel.add(reg);
		buttonPanel.add(button);
	}
	
	public class CheckFields implements ActionListener{
		public void actionPerformed(ActionEvent event) {
		   if(checkStatus){
			if(log.getText().trim().length() > 0 && pass.getText().trim().length() > 0) {
				setUpGui2();
				pass.setText("");
				log.setText("");
			}else {
				pass.setText("");
				log.setText("");
			}
			}
		}
	}
	public class CloseFrame implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			frame2.dispose();
		}
	}
}
