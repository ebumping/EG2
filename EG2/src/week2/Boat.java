package week2;

public class Boat extends Vehicle{
	boolean inWater = true;

	public Boat(){
		if(inWater != false){
		setFuelType("Gas");
		setMaxTopSpeed(40);
		setNumberOfPassengers(4);
		}else{
		setMaxTopSpeed(0);
		
		}
		
	}
	
	public void start(){
		if (inWater != false){
			System.out.println("Vrooom");
		}else{
			System.out.println("You hear the engine but don't seem to be going anywhere...");
		}
	}

}
