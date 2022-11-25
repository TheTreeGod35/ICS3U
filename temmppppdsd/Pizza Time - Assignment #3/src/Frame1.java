import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JFormattedTextField;

public class Frame1 {

	private JFrame frame;
	private JTextField textField;

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
		frame.getContentPane().setBackground(new Color(255, 255, 128));
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 429, 337);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JList list = new JList();
		list.setBounds(123, 121, 1, 1);
		frame.getContentPane().add(list);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 64));
		panel.setBounds(0, 0, 649, 41);
		frame.getContentPane().add(panel);
		
		JLabel Title_Label = new JLabel("Pingus Pizza");
		Title_Label.setBounds(10, 52, 290, 24);
		frame.getContentPane().add(Title_Label);
		Title_Label.setFont(new Font("Vineta BT", Font.PLAIN, 17));
		Title_Label.setForeground(new Color(0, 128, 64));
		
		textField = new JTextField();
		textField.setBounds(34, 119, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel HowLong_Label1 = new JLabel("How Long Is  ");
		HowLong_Label1.setForeground(new Color(0, 128, 64));
		HowLong_Label1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		HowLong_Label1.setBounds(34, 87, 112, 23);
		frame.getContentPane().add(HowLong_Label1);
		
		JLabel HowLong_Label2 = new JLabel("Your Pizza?");
		HowLong_Label2.setForeground(new Color(0, 128, 64));
		HowLong_Label2.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		HowLong_Label2.setBounds(34, 98, 86, 24);
		frame.getContentPane().add(HowLong_Label2);
		
		JLabel lblNewLabel_3 = new JLabel("Sample");
		lblNewLabel_3.setForeground(new Color(0, 128, 64));
		lblNewLabel_3.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(254, 76, 86, 46);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton Confirm_Button = new JButton("Confirm");
		Confirm_Button.setBackground(new Color(252, 245, 197));
		Confirm_Button.setForeground(new Color(0, 128, 64));
		Confirm_Button.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		Confirm_Button.setBounds(34, 147, 89, 24);
		frame.getContentPane().add(Confirm_Button);
		
		JLabel Total_Label = new JLabel("Your Total Is: ");
		Total_Label.setForeground(new Color(0, 128, 64));
		Total_Label.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		Total_Label.setBounds(254, 174, 130, 24);
		frame.getContentPane().add(Total_Label);
	}
}
