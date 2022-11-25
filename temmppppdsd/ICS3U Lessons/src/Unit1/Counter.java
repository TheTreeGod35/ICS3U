package Unit1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Counter {
	
	//Variable Declaraations
	
	int counter = 0;

	private JFrame frame;
	private JTextField textField1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Counter window = new Counter();
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
	public Counter() {
		initialize();
		textField1.setText(Integer.toString(counter));
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton Button1 = new JButton("Counter");
		Button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		Button1.setBounds(155, 71, 89, 23);
		frame.getContentPane().add(Button1);
		
		textField1 = new JTextField();
		textField1.setBounds(158, 146, 86, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
	}

}
