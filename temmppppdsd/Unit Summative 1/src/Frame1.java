import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Frame1 {
	
	int totalRolls = 0;
	int totalCorrect = 0;
	int totalIncorrect = 0;
	int userGuess;
	int diceRoll;
	double percCorrect = 0;

	private JFrame frame;
	private JTextField txtUserGuess;

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
		frame.getContentPane().setBackground(new Color(255, 128, 128));
		frame.getContentPane().setForeground(new Color(128, 128, 255));
		frame.setBounds(100, 100, 401, 336);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblHeader = new JLabel("Wow, Such cool Epic Dice Roll");
		lblHeader.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblHeader.setBounds(83, 11, 292, 14);
		frame.getContentPane().add(lblHeader);
		
		JLabel lblInst1 = new JLabel("Enter a Number from 1 to 6,");
		lblInst1.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lblInst1.setBounds(117, 36, 162, 14);
		frame.getContentPane().add(lblInst1);
		
		JLabel lblInst2 = new JLabel("And Click \"Roll\" to Roll the Dice");
		lblInst2.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lblInst2.setBounds(117, 61, 180, 14);
		frame.getContentPane().add(lblInst2);
		
		JLabel lblUserGuess = new JLabel("Your Guess");
		lblUserGuess.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		lblUserGuess.setBounds(22, 83, 154, 14);
		frame.getContentPane().add(lblUserGuess);
		
		JLabel lblDiceRoll = new JLabel("0");
		lblDiceRoll.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		lblDiceRoll.setBounds(282, 111, 46, 14);
		frame.getContentPane().add(lblDiceRoll);
		
		JLabel lblRolls = new JLabel("Number of Rolls");
		lblRolls.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lblRolls.setBounds(105, 152, 168, 14);
		frame.getContentPane().add(lblRolls);
		
		JLabel lblCorrect = new JLabel("Number of Correct Rolls");
		lblCorrect.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lblCorrect.setBounds(105, 188, 139, 14);
		frame.getContentPane().add(lblCorrect);
		
		JLabel lblIncorrect = new JLabel("Number of Incorrect Rolls");
		lblIncorrect.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lblIncorrect.setBounds(105, 225, 152, 14);
		frame.getContentPane().add(lblIncorrect);
		
		JLabel lblPercent = 
				new JLabel("Percentage of Correct Guess");
		lblPercent.setBounds(105, 262, 174, 14);
		frame.getContentPane().add(lblPercent);
		
		txtUserGuess = new JTextField();
		txtUserGuess.setBounds(22, 108, 86, 20);
		frame.getContentPane().add(txtUserGuess);
		txtUserGuess.setColumns(10);
		
		JLabel lblRollValue = new JLabel("Dice Roll");
		lblRollValue.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lblRollValue.setBounds(262, 83, 62, 14);
		frame.getContentPane().add(lblRollValue);
		
		JLabel lblRollsValue = new JLabel("0");
		lblRollsValue.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		lblRollsValue.setBounds(282, 150, 46, 14);
		frame.getContentPane().add(lblRollsValue);
		
		JLabel lblCorrectValue = new JLabel("0");
		lblCorrectValue.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		lblCorrectValue.setBounds(282, 186, 46, 14);
		frame.getContentPane().add(lblCorrectValue);
		
		JLabel lblIncorrectValue = new JLabel("0");
		lblIncorrectValue.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		lblIncorrectValue.setBounds(282, 223, 46, 14);
		frame.getContentPane().add(lblIncorrectValue);
		
		JLabel lblPercentValue = new JLabel("0");
		lblPercentValue.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		lblPercentValue.setBounds(282, 262, 46, 14);
		frame.getContentPane().add(lblPercentValue);
		
		JButton btnRollDice = new JButton("Roll");
		btnRollDice.setBackground(new Color(192, 192, 192));
		btnRollDice.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		btnRollDice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				diceRoll = (int)Math.round(Math.random()*5+1);
				lblDiceRoll.setText(String.valueOf(diceRoll));
				
				userGuess = Integer.parseInt(txtUserGuess.getText());
				
				totalRolls = totalRolls + 1;
				
				if (diceRoll == userGuess)
				{
					totalCorrect = totalCorrect +1; 
				}
				else
				{
					totalIncorrect = totalIncorrect + 1;
				}
				
				percCorrect = ((double)totalCorrect/(double)totalRolls)*100;
				
				percCorrect = percCorrect * 100;
				percCorrect = Math.round(percCorrect);
				percCorrect = percCorrect / 100;
				
				lblRollsValue.setText(String.valueOf(totalRolls));
				lblCorrectValue.setText(String.valueOf(totalCorrect));
				lblIncorrectValue.setText(String.valueOf(totalIncorrect));
				lblPercentValue.setText(String.valueOf(percCorrect));
			}
		});
		btnRollDice.setBounds(148, 107, 89, 23);
		frame.getContentPane().add(btnRollDice);
	}
}
