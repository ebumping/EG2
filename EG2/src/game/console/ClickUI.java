package game.console;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClickUI implements SystemInterface {

	private JFrame frame;
	int progress = 0;
	boolean gg = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClickUI window = new ClickUI();
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
	public ClickUI() {
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

		JProgressBar progressBar = new JProgressBar();

		progressBar.setStringPainted(true);
		progressBar.setToolTipText("Status");
		progressBar.setBounds(69, 204, 280, 47);
		frame.getContentPane().add(progressBar);

		JButton btnClickMe = new JButton("Click Me");
		btnClickMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				progressBar.setValue(progress);
				play();
			}
		});
		btnClickMe.setBounds(69, 170, 89, 23);
		frame.getContentPane().add(btnClickMe);
	}

	@Override
	public void play() {
		if (!gg()) {
			charge();
		} else if (gg()) {
			quit();
		}
	}

	@Override
	public boolean gg() {

		if (progress <= 5) {
			System.out.println("Not quite there yet");
			gg = false;
		} else if (progress >= 50 && progress <= 99) {
			gg = false;
			System.out.println("Over halfway there");
		} else if (progress >= 100) {
			gg = true;
			System.out.println("Well done, the planet has been destroyed");

		}
		return gg;
	}

	private void quit() {
		System.exit(0);

	}

	@Override
	public void info() {
		System.out.println("Click the button to charge your interplanetary laser of doom");

	}

	public void charge() {
		progress++;
		// play();
	}

}
