package week2;

public class Boat extends Vehicle{
	boolean inWater = true;

	public Boat(){
		setFuelType("Gas");
		setMaxTopSpeed(40);
		setNumberOfPassengers(4);
		
	}
	
	public void start(){
		if (inWater != false){
			System.out.println("Vrooom");
		}else{
			System.out.println("I've got nowhere to go!");
		}
	}

}
