package game.console;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class GameSystem {
	List<SystemInterface> client = new ArrayList<SystemInterface>();
	String select;

	public static void main(String[] arg) {
		/*
		 * AbstractGame game = new TestGame(); game.play(); game.isSolved();
		 * game.quit();
		 */
		GameSystem s = new GameSystem();
		s.loadClient();
		s.gameSelect();
		// First design implementation of launching specific game UI
		if (s.select.startsWith("0")) {
			D20UI.main(arg);
		} else {
			s.launch();
		}
	}

	protected void launch() {
		// Play the game the user selects
		SystemInterface c = client.get(Integer.valueOf(select).intValue());
		c.info();
		// If the user selects an instance of ClickUI launch laser game UI
		if (!c.gg() && c instanceof ClickUI) {
			ClickUI.main(null);
		} else {
			// Loop until game is over
			while (!c.gg()) {
				c.play();
			}
		}

	}

	protected void gameSelect() {
		int count = 0;
		for (SystemInterface c : client) {
			System.out.print(count++ + ": ");
			c.info();
		}

		System.out.println("Please select a game!");
		Scanner console = new Scanner(System.in);
		select = console.next();
		console.close();

	}

	protected void loadClient() {
		client.add(new RollD20());
		client.add(new ClickUI());
	}

}
