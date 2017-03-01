package game.console;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameSystem extends ConsoleUI{
	List<SystemInterface> client = new ArrayList<SystemInterface>();
	String select;
	String player;
	
	public static void main(String[] arg){
		
		GameSystem s = new GameSystem();
		//ConsoleUI ui = new ConsoleUI();
		//ConsoleUI.main(arg);
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
	}
	

}
