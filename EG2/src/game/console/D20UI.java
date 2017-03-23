package game.console;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.Scanner;
import java.awt.TextArea;
	//Extends RollD20 so UI can call games methods
public class D20UI extends RollD20 {

<<<<<<< HEAD
=======
public class D20UI extends RollD20{

	
>>>>>>> branch 'master' of https://github.com/ebumping/EG2.git
	private JFrame frame;
<<<<<<< HEAD
	GameSystem g = new GameSystem();
=======
	protected JTextField playerNumber;
>>>>>>> branch 'master' of https://github.com/ebumping/EG2.git

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					D20UI window = new D20UI();
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
	public D20UI() {
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

<<<<<<< HEAD
=======
		
>>>>>>> branch 'master' of https://github.com/ebumping/EG2.git
		JButton btnSubmit = new JButton("Roll");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				play();
<<<<<<< HEAD

=======
>>>>>>> branch 'master' of https://github.com/ebumping/EG2.git
			}
		});
		btnSubmit.setBounds(128, 156, 201, 100);
		frame.getContentPane().add(btnSubmit);
<<<<<<< HEAD

		JButton btnQuit = new JButton("Quit");
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				quit();
			}
		});
		btnQuit.setBounds(6, 0, 86, 36);
=======
		
		JButton btnQuit = new JButton("Quit");
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gg();
			}
		});
		btnQuit.setBounds(10, 228, 89, 23);
>>>>>>> branch 'master' of https://github.com/ebumping/EG2.git
		frame.getContentPane().add(btnQuit);
	}
}
