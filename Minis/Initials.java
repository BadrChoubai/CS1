
/*

	Program: Initials;
	Author: Badr Choubai;
	Date: 2019-08-30;
    Description: A program that takes a user's full first, middle (if they have one) and, last name. It will return the user's initials;

    Input: User's full name;
    Output: User's initials;
    
*/

import java.util.Scanner;

class Initials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String initials = "";
        String[] fullName = { "first", "middle", "last" };

        for (String namePart : fullName) {
            System.out.printf("What is your %s name? \n", namePart);
            String answer = scanner.nextLine();
            if (answer.length() >= 1) {
                initials += answer.substring(0, 1);
            }
        }
        
        scanner.close();

        System.out.println(initials.toUpperCase());
    };
}