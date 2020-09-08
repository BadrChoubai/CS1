/*
Program name: PACE (Physical Activity Calorie Equivalent) and Calories
Description: A program that prompts its user for a food item and the calories it contains. Then, computes and outputs how many minutes the user would need to walk to burn off those calories.
Author: Badr Choubai
Date: September 8, 2020
Version: 1

Vocabulary word (non-computer related):

leader :: noun
:- One that leads or guides
:- One who is in charge or in command of others

Inspirational quote and author (non-political, non-religious):

“Courage is the only virtue you cannot fake.”
~ Nassim Nicholas Taleb, Skin in the Game: The Hidden Asymmetries in Daily Life

*/

import java.util.Scanner;

public class BadrChoubai_01_PACE {
    private static Scanner inputScanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("What was the last thing you ate?: ");
        String foodItem = inputScanner.nextLine();
        System.out.print("How many calories did it have?: ");
        int caloriesInFoodItem = inputScanner.nextInt();

        System.out.printf("Your food item: %s\n", foodItem);
        System.out.printf("Calories: %d\n", caloriesInFoodItem);
        System.out.printf("Minutes to walk: %d\n", (int) (caloriesInFoodItem / 5.4));
    }
}
