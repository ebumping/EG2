package game.console;

import java.util.Random;
import java.util.Scanner;

public class RollD20 extends GameSystem implements SystemInterface{
	int rng20 = (int) rngVal();
	int players = 1 ;
	
	
	/*public int playerNum(){
		//Scanner u = new Scanner(System.in);
		//players = u.nextInt();
		//u.close();
		return players;
	}*/

	@Override
	public void play() {
		System.out.println(rngVal());

		Scanner roll = new Scanner(System.in);
		if(roll.next().equals("y")){
			
		}
		
	}

	@Override
	public boolean gg(){
		boolean gg = true;
			for (int i = 0; i < players; i++){
				if(i < players){
					System.out.println(rngVal());;
				}else{
				System.out.println("Would you like to roll again?");
				
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
}
