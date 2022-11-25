import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JokeGUI {

	private JFrame frame;
	private JTextField mendescollinsTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JokeGUI window = new JokeGUI();
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
	public JokeGUI() {
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
		
		mendescollinsTextField = new JTextField();
		mendescollinsTextField.setBounds(111, 137, 187, 53);
		frame.getContentPane().add(mendescollinsTextField);
		mendescollinsTextField.setColumns(10);
		
		JButton mendescollinsButton1 = new JButton("why did my wife leave me and take the kids?");
		mendescollinsButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				System.out.println("Just Because lol");
				mendescollinsTextField.setText("Just Because lol");
			}
		});
		mendescollinsButton1.setBounds(58, 68, 329, 44);
		frame.getContentPane().add(mendescollinsButton1);
	}
}
