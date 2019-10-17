
/**
 * Name: Badr Choubai Project: Bears and Fish Description: Bears and Fish is a
 * simulation of two populations, the bears and the fish, competing in a river.
 */

 import java.util.Random;

public class BearsAndFish {
	public static void main(String[] args) {
		greetUser();
		char[] river = setupRiver();
		addCreaturesToRiver(river);
		randomNumberGenerator();
	}

	/**
	 * Greets the user and explains the program to them
	 */
	private static void greetUser() {
		System.out.println("Hello, welcome to Bears and Fish. This is a program meant "
		+ "to simulate a river ecosystem, to an extent.");
	}

	/**
	 * Sets up the river. The river will be initialized as a char array with seven dashes.
	 * The river will be filled with user input in another method.
	 */
	private static char[] setupRiver() {
		char[] river = {'-', '-', '-', '-', '-', '-', '-'};
		System.out.println(river);
		return river;
	}

	/**
	 * Add creatures to the initial river. This method asks a user for two values, 
	 * the amount of fish they'd like adn the amount of bears they'd like.
	 */
	private static char[] addCreaturesToRiver(char[] river) {
		return river;
	}

	/**
	 * A random number generator
	 */
	private static int randomNumberGenerator() {
		Random numberGenerator = new Random();
		int randomNumber = numberGenerator.nextInt(7);
		System.out.println(randomNumber);
		return randomNumber;
	}
}	