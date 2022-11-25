package Unit1;

import javax.swing.JOptionPane;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TryCatchGUI {
	
	int userInput = 0;
	int userOutput = 0;
	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TryCatchGUI window = new TryCatchGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TryCatchGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton Button1 = new JButton("Click Me!");
		Button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Butt code
			try {	
				userInput = Integer.parseInt( textField1.getText());
				textField2.setText(Integer.toString(userInput));
				
			}
			catch (Exception fubar) {
				
				JOptionPane.showMessageDialog(null, "INVALID ENTRY. USE NUMBERS");
			
				}
			}
		});
		Button1.setBounds(163, 126, 89, 23);
		frame.getContentPane().add(Button1);
		
		textField1 = new JTextField();
		textField1.setBounds(32, 176, 86, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(312, 176, 86, 20);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Enter an Interger");
		lblNewLabel.setBounds(33, 151, 111, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("You Entered ...");
		lblNewLabel_1.setBounds(312, 151, 86, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton Button2 = new JButton("Clear Selection");
		Button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				System.exit(0);
			}
		});
		Button2.setBounds(147, 227, 126, 23);
		frame.getContentPane().add(Button2);
	}
}
