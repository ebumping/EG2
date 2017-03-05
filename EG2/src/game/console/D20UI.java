package game.console;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class ConsoleUI {

	
	private JFrame frame;
	private JTextField gameSelect;
	protected JTextField playerNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsoleUI window = new ConsoleUI();
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
	public ConsoleUI() {
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
		
		JLabel lblNumberOfPlayers = new JLabel("Number of Players");
		lblNumberOfPlayers.setBounds(281, 36, 88, 14);
		frame.getContentPane().add(lblNumberOfPlayers);
		
		gameSelect = new JTextField();
		gameSelect.setBounds(379, 8, 45, 20);
		frame.getContentPane().add(gameSelect);
		gameSelect.setColumns(10);
		
		JLabel lblGameSelection = new JLabel("Game Selection");
		lblGameSelection.setBounds(281, 11, 88, 14);
		frame.getContentPane().add(lblGameSelection);
		
		playerNumber = new JTextField();
		playerNumber.setBounds(379, 33, 45, 20);
		frame.getContentPane().add(playerNumber);
		playerNumber.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnSubmit.setBounds(335, 228, 89, 23);
		frame.getContentPane().add(btnSubmit);
	}
}
