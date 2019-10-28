
/**
 * Name: Badr Choubai 
 * Project: Bears and Fish 
 * Description: 
 * 	Bears and Fish is a
 * 	simulation of two populations, the bears and the fish, competing in a river.
 */
import java.util.Random;
import java.util.Scanner;

public class BearsAndFish {
	private static int getUserInput(char creature, Scanner inputScanner) {
		int creatureAmount = 0;

		switch(creature) {
			case 'f': 
				System.out.println("How many fish would you like to add to the river?");
				creatureAmount = inputScanner.nextInt();
				break;
			case 'b':
				System.out.println("How many bears would you like to add to the river?");
				creatureAmount = inputScanner.nextInt();
				break;
		}

		return creatureAmount;
	}
	
	private static void greetUser() {
		System.out.printf("Welcome to Bears and Fish!\n\nThis is a simplified simulation of two populations,"
				+ " Bears and Fish, competing in a river.\n\n");
	}

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		greetUser(); // Greet the user

		// The next two lines setup the river
		River simulationRiver = new River(7);
		simulationRiver.setupRiver();

		int bearCount = getUserInput('b', inputScanner);
		int fishCount = getUserInput('f', inputScanner);

		System.out.println("Bears: "+bearCount);
		System.out.println("Fish: "+fishCount);
		
		simulationRiver.getRiver();
		simulationRiver.addCreaturesToRiver('b', bearCount);
		simulationRiver.addCreaturesToRiver('f', fishCount);
		simulationRiver.getRiver();

		inputScanner.close();
	}
}

/**
 * I decided to implement the River as a custom class as it felt more cohesive
 * to abstract the River functionallity away from the BearsAndFish program
 */
class River {
	int size;
	char[] river;
	Random numberGenerator;

	River(int size) {
		this.size = size;
		this.numberGenerator = new Random();
	}

	public char[] addCreaturesToRiver(char creatureType, int creatureAmount) {
		int i = 0;
		while (creatureAmount > i) {
			int randomIndex = numberGenerator.nextInt(this.size);
			if (this.river[randomIndex] == '-') {
				this.river[randomIndex] = creatureType;
			}
			creatureAmount--;
		}
		return this.river;
	}

	private char[] createRiver(int riverSize) {
		char[] newRiver = new char[size];
		for (int i = 0; i < newRiver.length; i++) {
			newRiver[i] = '-';
		}
		return newRiver;
	}

	public char[] getRiver() {
		System.out.println(this.river);
		return this.river;
	}

	public void setupRiver() {
		this.river = createRiver(this.size);
	}

}
