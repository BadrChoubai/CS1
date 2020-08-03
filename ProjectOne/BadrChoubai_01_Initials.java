
/*
Program name: Initials
Description: A program that given a user's first, middle and, last name. Prints their initials. 
Author: Badr Choubai
Date: June 16, 2020
Version: 1

Vocabulary word (non-computer related):

minimalism :: noun

:- A style or technique (as in music, literature, or design) that is characterized by extreme spareness.

Inspirational quote and author (non-political, non-religious):

“Simply put, humans are not wired to be constantly wired.”
~ Cal Newport, Digital Minimalism: Choosing a Focused Life in a Noisy World 


*/
import java.util.Scanner;

public class BadrChoubai_01_Initials {

    private static Scanner inputScanner = new Scanner(System.in);

    public static void main(String[] args) {
        String initials = "";
        String name = "";

        System.out.print("Enter your first name:\n> ");
        name += " "+inputScanner.nextLine();
        System.out.print("Enter your middle name:\n> ");
        name += " "+inputScanner.nextLine();
        System.out.print("Enter your last name:\n> ");
        name += " "+inputScanner.nextLine();

        for (String namePart : name.split(" ")) {
            if (!namePart.isBlank()) {
                initials += namePart.charAt(0) + ".";
            }
        }

        System.out.printf("Your name is: %s.\n", name.trim().replaceAll("\\s+", " "));
        System.out.printf("Your intials are: %s\n", initials.toUpperCase());
    }
}