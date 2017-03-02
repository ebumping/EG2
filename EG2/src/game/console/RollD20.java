package game.console;

import java.util.Random;
import java.util.Scanner;

public class RollD20 /*extends GameSystem*/ implements SystemInterface{
	int rng20 = (int) rngVal();
	int players = 1;
	
	
	
	/*public int playerNum(){
		//Scanner u = new Scanner(System.in);
		//players = u.nextInt();
		//u.close();
		return players;
	}*/

	@Override
	public void play() {
		log();
		

		
		
	}

	@Override
	public boolean gg() {
		boolean gg = true;
		for (int i = 0; i < players; i++) {
			if (i < players) {
				play();
				
			}else {
				gg = false;
			}
		}
		return gg;

	}

	@Override
	public void info() {
		System.out.println("Roll a D20");

	}
	private int rngVal(){
		Random rng = new Random();
		int rngInt = rng.nextInt(20);
		return rngInt;
	}
	
	public void log(){
		System.out.println(rngVal());
	}
	
	public void replay() throws Exception{
		System.out.println("Would you like to play again? [y/n]");
		Scanner console = new Scanner(System.in);
		//exception here
		//if(console.next().equalsIgnoreCase("n")){
		//}
	}
}
