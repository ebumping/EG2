package game.console;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameSystem extends ConsoleUI{
	List<SystemInterface> client = new ArrayList<SystemInterface>();
	String select;
	String replay;
	
	public static void main(String[] arg){
		/*AbstractGame game = new TestGame();
		game.play();
		game.isSolved();
		game.quit();*/
		
		GameSystem s = new GameSystem();
		ConsoleUI ui = new ConsoleUI();
		
		s.loadClient();
		s.gameSelect();
		s.launch();
		

	}
	
	private void launch(){

		
		SystemInterface c = client.get(Integer.valueOf(select).intValue());
		
		c.info();


		while(!c.gg()){
			c.play();


		}
		if(c.gg() && c instanceof RollD20){
			RollD20 d20 = (RollD20)c;
			try {
				d20.replay();
				//exception
				Scanner console = new Scanner(System.in);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	private void gameSelect(){
		int count = 0;
		for (SystemInterface c : client){
			System.out.print(count++ + ": ");
			c.info();
		}			
		
		System.out.println("Please select a game!");

		
		Scanner console = new Scanner(System.in);
		select = console.next();
		console.close();


	}
	
	private void loadClient(){
		client.add(new RollD20());
		//client.add();
	}
	

}
