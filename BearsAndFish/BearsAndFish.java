
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
	public static void main(String[] args) {
		greetUser();
		char[] river = setupRiver();
		Scanner inputScanner = new Scanner(System.in);
		int random = generateRandomNumber(river.length);
		 
		String bearAmount =	getUserInput('b', inputScanner);
		String fishAmount =	getUserInput('f', inputScanner);
		String[] amounts = {bearAmount, fishAmount};

		placeCreaturesInRiver(river, amounts);

		inputScanner.close();
	};

	private static void greetUser() {
		System.out.println("Welcome to Bears and Fish. A simplified simulation of a river's population");
	}

	private static char[] setupRiver() {
		char[] river = {'-', '-', '-', '-', '-', '-', '-'};
		return river;
	}
	
	private static String getUserInput(Character creatureType, Scanner scanner) {
		int inputTotal;
		String creature = creatureType.equals('b') ? "Bear" : "Fish";
		System.out.printf("How many %s would you like in the river? \n", creature);
		inputTotal = scanner.nextInt();

		String result = String.format("%d%s", inputTotal, creatureType);
		System.out.println(result);
		return result;
	}

	private static char[] placeCreaturesInRiver(char[] river, String[] creatureInputInfo) {
		int bearAmount = Integer.parseInt(creatureInputInfo[0].substring(0, 1)); ;
		int fishAmount = Integer.parseInt(creatureInputInfo[1].substring(0, 1)); ;
		int creatureTotal = bearAmount + fishAmount;

		for (int i = 0; i < creatureTotal; i++) {
			int randomIndex = generateRandomNumber(river.length);
			if(river[randomIndex] == '-') {
				river[randomIndex] = 'b';
			} else if (river[randomIndex] == 'b') {
				river[randomIndex] = 'f';
			}

		}

		System.out.println(river);
		return river;

	}
 	
	private static int generateRandomNumber(int max) {
		Random numberGenerator = new Random();
		int randomNumber = numberGenerator.nextInt(max);
		return randomNumber;
	}


}	
