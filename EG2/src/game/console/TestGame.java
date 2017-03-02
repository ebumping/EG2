package game.console;

public class TestGame extends AbstractGame {

	@Override
	public void play() {
		System.out.println("playing");
		
	}

	@Override
	public boolean isSolved() {
		System.out.println("Not solved");
		return false;
	}

}
