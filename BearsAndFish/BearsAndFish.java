import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Name: Badr Choubai Project: Bears and Fish Description: Bears and Fish is a
 * simulation of two populations, the bears and the fish, competing in a river.
 */
public class BearsAndFish {
	/**
	 * Greet the user.
	 * Explain the program.
	 */
	private static void greetUser() {
		System.out.printf("Welcome to Bears and Fish!\n\nThis is a simplified simulation of two populations,"
				+ " Bears and Fish, competing in a river.\n\n");
	}

	/**
	 * Setup the river
	 * 	- make the river size 7;
	 * 	- fill with blanks;
	 * 	- print the river;
	 * @param size the size of the river;
	 */
	private static River setupRiver(int size) {
		River river = new River(size);
		river.setupRiver();
		System.out.println(river.getRiver());
		return river;
	} 


	/**
	 * Get number of bears from user
	*/

	/**
	 * Get number of fish from user
	*/
	private static int getCreatureAmount(char creature, Scanner inputScanner) {
		int creatureAmount = 0;

		switch(creature) {
			case 'b':
				System.out.println("How many bears would you like to add to the river?");
				creatureAmount = inputScanner.nextInt();
				break;
			case 'f':
				System.out.println("How many fish would you like to add to the river?");
				creatureAmount = inputScanner.nextInt();
				break;
		}

		return creatureAmount;
	}


	 /**
	  * Add creatures to the initial river
	  */

	/**
	 * Main method
	 * @param args
	 */  
	public static void main(String[] args) {
		greetUser();
		setupRiver(7);
		Scanner inputScanner = new Scanner(System.in);

		int numberOfBears = getCreatureAmount('b', inputScanner);
		int numberOfFish = getCreatureAmount('f', inputScanner);

		System.out.println(numberOfBears);
		System.out.println(numberOfFish);

		inputScanner.close();
	}

	  
}

class River {
	int amountOfBears;
	int amountOfFish;
	List<Character> river;
	int riverSize;

	public River(int riverSize) {
		this.riverSize = riverSize;
		river = new ArrayList<Character>(); 
	}

	public List<Character> getRiver() {
		return this.river;
	}

	public void setupRiver() {
		for (int i = 0; i < this.riverSize; i++) {
			this.river.add('-');
		}
	}
}