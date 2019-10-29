
/**
 * Name: Badr Choubai 
 * Project: Bears and Fish 
 * Description: 
 * 	Bears and Fish is a
 * 	simulation of two populations, the bears and the fish, competing in a river.
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
	 */

	/**
	 * Get number of bears from user
	*/

	/**
	 * Get number of fish from user
	*/

	 /**
	  * Add creatures to the initial river
	  */

	/**
	 * Main method
	 * @param args
	 */  
	public static void main(String[] args) {
		greetUser();
	}

	  
}

class River {
	char[] river;
	int riverSize;
	int amountOfBears;
	int amountOfFish;

	public River() {
		riverSize = 7;
		river = new char[riverSize]; 
	}


	public void setupRiver() {
		for (int i = 0; i < this.riverSize; i++) {
			this.river[i] = '-';
		}
	}

	public char[] getRiver() {
		return this.river;
	}
}