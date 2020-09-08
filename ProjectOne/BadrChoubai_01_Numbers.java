/*
Program name: Numbers
Description: A small program that prints the results of several calculations for two given numbers.
Author: Badr Choubai
Date: September 8, 2020
Version: 1

Vocabulary word (non-computer related):

outlier :: noun
:- A statistical observation that is markedly different in value from the others in the sample
:- A person or a thing that is atypical within a particular group, class, or category.

Inspirational quote and author (non-political, non-religious):

“You must not let your need to be right be more important than your need to find out what’s true.” 
~ Ray Dalio

*/

import java.util.Scanner; 

public class BadrChoubai_01_Numbers {
    private static Scanner inputScanner = new Scanner(System.in);
    public static void main(String[] args) {
        var numOne = 0;
        var numTwo = 0;
        System.out.print("Please give me a number:\n> ");
        numOne = inputScanner.nextInt();
        System.out.print("Please give me another number:\n> ");
        numTwo = inputScanner.nextInt();
        
        System.out.printf("Sum = %d\n", (numOne + numTwo));
        System.out.printf("Product = %d\n", (numOne * numTwo));
    }
}