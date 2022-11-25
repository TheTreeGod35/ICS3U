import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame1 {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
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
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 197, 276);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField1 = new JTextField();
		textField1.setBounds(101, 40, 43, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(101, 71, 43, 20);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		textField3 = new JTextField();
		textField3.setBounds(101, 102, 43, 20);
		frame.getContentPane().add(textField3);
		textField3.setColumns(10);
		
		textField4 = new JTextField();
		textField4.setBounds(101, 133, 43, 20);
		frame.getContentPane().add(textField4);
		textField4.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("1st Number");
		lblNewLabel.setBounds(28, 43, 92, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("2nd Number");
		lblNewLabel_1.setBounds(28, 74, 92, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("3rd Number");
		lblNewLabel_2.setBounds(28, 105, 92, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("4th Number");
		lblNewLabel_3.setBounds(28, 136, 92, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Dumb little Calculator");
		lblNewLabel_4.setBounds(28, 15, 143, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(67, 198, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		
		JButton btnNewButton_1 = new JButton("Average");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				int num1 = 0;
				int num2 = 0;
				int num3 = 0;
				int num4 = 0;
				double answer = 0;
				
				num1 = Integer.parseInt(textField1.getText());
				num2 = Integer.parseInt(textField2.getText());
				num3 = Integer.parseInt(textField3.getText());
				num4 = Integer.parseInt(textField4.getText());
				
				answer= num1 + num2 + num3 + num4;
				answer = answer / 4;
				
				answer = answer * 10;
				answer = Math.round(answer);
				answer = answer / 10;
				

				
				
				lblNewLabel_5.setText(Double.toString(answer));
			}
		});
		btnNewButton_1.setBounds(44, 164, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		
		
				
	
		
		
	}
}
