
/**
 * Name: Badr Choubai 
 * Project: Bears and Fish 
 * Description: 
 * 	Bears and Fish is a
 * 	simulation of two populations, the bears and the fish, competing in a river.
 */
import java.util.Random;

public class BearsAndFish {
	public static void main(String[] args) {
		greetUser(); // Greet the user

		// The next two lines setup the river 
		River simulationRiver = new River(7); 
		simulationRiver.setupRiver();

		System.out.println(simulationRiver.getRiver());
		simulationRiver.addCreaturesToRiver('b', 1);
		System.out.println(simulationRiver.getRiver());
		simulationRiver.addCreaturesToRiver('f', 2);
		System.out.println(simulationRiver.getRiver());

	}

	private static void greetUser() {
		System.out.printf("Welcome to Bears and Fish!\n\nThis is a simplified simulation of two populations,"
				+ " Bears and Fish, competing in a river.\n\n");
	}

}

/**
 * I decided to implement the River as a custom type as it felt more cohesive to abstract the River functionallity away from
 * the BearsAndFish program
 */
class River {
	int size;
	char[] river;
	Random numberGenerator;

	River(int size) {
		this.size = size;
		this.numberGenerator = new Random();
	}

	public void setupRiver() {
		this.river = createRiver(this.size);
	}

  	public char[] getRiver() {
		return this.river;
	}

	private char[] createRiver(int riverSize) {
		char[] newRiver = new char[size];
		for (int i = 0; i < newRiver.length; i++) {
			newRiver[i] = '-';
		}
		return newRiver;
	}

	public char[] addCreaturesToRiver(char creatureType, int creatureAmount) {
		int i = 0;
		while (creatureAmount > i) {
			int randomIndex = numberGenerator.nextInt(this.size);
			if(this.river[randomIndex] == '-') {
				this.river[randomIndex] = creatureType;
			}
			creatureAmount--;
		}
		return this.river;
	}	
}
