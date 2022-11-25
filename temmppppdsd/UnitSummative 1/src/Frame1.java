import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class Frame1 {

	private JFrame frame;
	private JTextField textField;
	private JTextField AnswerField1;
	private JTextField AnswerField2;
	private JTextField AnswerField3;
	private JTextField AnswerField4;
	private JTextField AnswerField5;

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
		frame.getContentPane().setBackground(new Color(206, 163, 220));
		frame.setBounds(100, 100, 400, 712);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		AnswerField1 = new JTextField();
		AnswerField1.setBounds(28, 105, 86, 20);
		frame.getContentPane().add(AnswerField1);
		AnswerField1.setColumns(10);
		
		AnswerField2 = new JTextField();
		AnswerField2.setBounds(28, 231, 86, 20);
		frame.getContentPane().add(AnswerField2);
		AnswerField2.setColumns(10);
		
		AnswerField3 = new JTextField();
		AnswerField3.setBounds(28, 330, 86, 20);
		frame.getContentPane().add(AnswerField3);
		AnswerField3.setColumns(10);
		
		AnswerField4 = new JTextField();
		AnswerField4.setBounds(28, 443, 86, 20);
		frame.getContentPane().add(AnswerField4);
		AnswerField4.setColumns(10);
		
		AnswerField5 = new JTextField();
		AnswerField5.setBounds(28, 563, 86, 20);
		frame.getContentPane().add(AnswerField5);
		AnswerField5.setColumns(10);
		
		JButton CheckButton1 = new JButton("Check");
		CheckButton1.setBounds(28, 123, 86, 23);
		frame.getContentPane().add(CheckButton1);
		
		JButton CheckButton2 = new JButton("Check");
		CheckButton2.setBounds(28, 250, 86, 23);
		frame.getContentPane().add(CheckButton2);
		
		JButton CheckButton3 = new JButton("Check");
		CheckButton3.setBounds(28, 349, 86, 23);
		frame.getContentPane().add(CheckButton3);
		
		JButton CheckButton4 = new JButton("Check");
		CheckButton4.setBounds(28, 462, 86, 23);
		frame.getContentPane().add(CheckButton4);
		
		JButton CheckButton5 = new JButton("Check");
		CheckButton5.setBounds(28, 582, 86, 23);
		frame.getContentPane().add(CheckButton5);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 255));
		panel.setBounds(0, 0, 384, 38);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel_3 = new JLabel("Epic Gamer True or False Quiz");
		lblNewLabel_3.setFont(new Font("Source Code Pro", Font.PLAIN, 16));
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(44, 49, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(10, 74, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(81, 74, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(44, 176, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(10, 201, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(81, 201, 46, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setBounds(44, 284, 46, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setBounds(10, 305, 46, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setBounds(81, 305, 46, 14);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setBounds(44, 396, 46, 14);
		frame.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setBounds(10, 421, 46, 14);
		frame.getContentPane().add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("New label");
		lblNewLabel_12.setBounds(81, 421, 46, 14);
		frame.getContentPane().add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("New label");
		lblNewLabel_13.setBounds(44, 511, 46, 14);
		frame.getContentPane().add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("New label");
		lblNewLabel_14.setBounds(10, 538, 46, 14);
		frame.getContentPane().add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("New label");
		lblNewLabel_15.setBounds(81, 538, 46, 14);
		frame.getContentPane().add(lblNewLabel_15);
		
		
	}
}
