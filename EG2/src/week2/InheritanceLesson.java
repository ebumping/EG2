package week2;

import java.util.ArrayList;
import java.util.List;

public class InheritanceLesson {
	
	public static void main(String[] args)
	{
		Bike b = new Bike();
		System.out.println(b.toString());
		b.start();
		b.stop();
		b.gettingExercise();
		
		Boat bo = new Boat();
		bo.inWater = false;
		bo.start();
		
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(b);
		vehicles.add(bo);
		
		for (Vehicle v: vehicles){
			v.start();
			v.stop();
			
			if(v instanceof Bike){
				Bike b2= (Bike)v;
				b2.gettingExercise();
			}else if(v instanceof Boat){
				Boat b3 = (Boat)v;
				b3.sink();
			}
		}
			
	}

}
