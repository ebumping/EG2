package game.console;

public abstract class AbstractGame {
			//Abstract classes are extended
	public abstract void play();
	public abstract boolean isSolved();
	
	public void quit(){
		System.out.println("Quitting");
		
	}
	

}
