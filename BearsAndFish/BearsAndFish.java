
/**
 * Name: Badr Choubai 
 * Project: Bears and Fish 
 * Description: 
 * 	Bears and Fish is a
 * 	simulation of two populations, the bears and the fish, competing in a river.
 */
public class BearsAndFish {
	public static void main(String[] args) {

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