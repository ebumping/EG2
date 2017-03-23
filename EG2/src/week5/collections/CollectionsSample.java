package week5.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class CollectionsSample {

	//Collections are interfaces <?>
	//Generics - concept of where you can specify what types of things will be in the list
	//List<> myList = new ArrayList<>();
	private List<User> users = new ArrayList<User>();
	
	private static Comparator<User> SORT_BY_FIRSTNAME = new Comparator<User>(){
		

		@Override
		public int compare(User arg0, User arg1) {			
			return arg0.getFirstName().compareTo(arg1.getFirstName());
		}
		
	};
	private static Comparator<User> SORTBY_LASTNAME = new Comparator<User>(){
		
		@Override
		public int compare(User argz0, User argz1){
			return argz0.getLastName().compareTo(argz1.getLastName());
		}
		
	};
	
	//sortListF Sorts the list by first name
	private void sortListF(){
		System.out.println("\nSort by first name");
		Collections.sort(users, SORT_BY_FIRSTNAME);
		list();
	}
	
	//sortListL sorts list by last name
	private void sortListL(){
		System.out.println("\nSort by last name");
		Collections.sort(users, SORTBY_LASTNAME);
		list();
	}
	
	private void loadUsers(){
		users.add(new User("Dylan", "Jeffery", "ebumping@gmail.com", "stuff"));
		users.add(new User("Nova", "Pup", "doggo@gmail.com", "iamapup"));
		users.add(new User("Lindsey", "Chase", "linsorfs@gmail.com", "girlstuff"));
		
	}
	//Iterates over the list of users
	public void list(){
		for (User x : users){
			System.out.println(x);
		}
	}
	//main method loads users, prints an unsorted list, then prints a version organized by first then last name.
	public static void main(String[] argz){
		CollectionsSample cs = new CollectionsSample();
		cs.loadUsers();
		cs.list();
		cs.sortListF();
		cs.sortListL();
	}



	
}
