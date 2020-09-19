/*

Program name: Initials
Description: A program that given a user's first, middle and, last name. Prints their initials.
Author: Badr Choubai
Date: September 8, 2020
Version: 2

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

    static String toTitleCase(String input)
    {
        if (input == null || input.isEmpty())
        {
            return "";
        }

        if (input.length() == 1)
        {
            return input.toUpperCase();
        }

        String[] parts = input.split("\\s+");
        StringBuilder resultString = new StringBuilder(input.length());

        for (String part : parts)
        {
            if (part.length() > 1)
            {
                resultString.append(part.substring(0, 1).toUpperCase()).append(part.substring(1));
            }
            else
                resultString.append(part.toUpperCase());

            resultString.append(" ");
        }

        return resultString.toString().trim();
    }

    public static void main(String[] args) {
        StringBuilder initials = new StringBuilder();
        StringBuilder name = new StringBuilder();

        System.out.print("Enter your first name:\n> ");
        name.append(inputScanner.nextLine());
        System.out.print("Enter your middle name:\n> ");
        name.append(" ").append(inputScanner.nextLine());
        System.out.print("Enter your last name:\n> ");
        name.append(" ").append(inputScanner.nextLine());

        String nameResult = toTitleCase(name.toString());

        for (String namePart : nameResult.split(" ")) {
            initials.append(namePart.charAt(0)).append(".");
        }

        System.out.printf("Your name is: %s.\n", nameResult);
        System.out.printf("Your initials are: %s\n", initials);
    }
}
