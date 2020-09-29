/*
 * Program Name: Calculator
 * Description: A small calculator program giving users the ability to perform simple math operations
 * from their computer
 * Author: Badr Choubai
 * Date: September 28, 2020
 * Version: 02
 * Vocabulary Word:
 *
 *     System ~ n. A set of elements or parts that is coherently organized and interconnected in a pattern
 *                 or structure that produces a characteristic set of behaviors, often classified as its
 *                 function or purpose.
 *
 * Inspirational Quote:
 *
 *     “Antifragility is beyond resilience or robustness.
 *      The resilient resists shocks and stays the same;
 *      the antifragile gets better.”
 *      ~ Nassim Nicholas Taleb, Antifragile
 *
 */
import java.util.Scanner;

class Calculator {
    private Scanner inputScanner = new Scanner(System.in);
    int additionCount, subtractionCount, divisionCount, multiplicationCount = 0;
    int totalProblemsSolved = 0;
    Calculator() {}

    private static void printIntro()
    {
        System.out.println("Welcome to JCalc v.0.2");
        System.out.println("This program helps you solve simple math problems.\n");
        System.out.println("First, we'll prompt you for the type of operation you'd like to perform");
        System.out.println("\n\tAddition, Subtraction, Multiplication or Division\n");
        System.out.println("Then, we'll prompt you for two different numbers (Integers only)");
        System.out.print("\nYou can solve as many problems as you want, and we'll keep track of it. Happy Solving!");

    }


    public static void main(String[] args)
    {
        printIntro();
    }
}
