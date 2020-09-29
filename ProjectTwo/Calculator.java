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
    private static Scanner inputScanner = new Scanner(System.in);
    static int additionCount, subtractionCount, divisionCount, multiplicationCount = 0;
    static char symbol;
    static int answer;
    static int firstOperand, secondOperand;

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

    private static void calculate() {
        while (true)
        {
            System.out.println("\nWhat type of operation would you like to perform?");
            System.out.println("Select you answer by typing the first letter");
            for (String prompt: new String[]{"(A)ddition", "(S)ubtraction", "(D)ivision", "(M)ultiplication"})
            {
                System.out.printf("%s\n", prompt);
            }

            System.out.print("> ");
            String userChoice = inputScanner.nextLine().toUpperCase();

            switch(userChoice)
            {
                case "A":
                    System.out.println("You chose Addition");
                    symbol = '+';
                    System.out.print("First number\n> ");
                    firstOperand = inputScanner.nextInt();
                    System.out.print("Second number\n> ");
                    secondOperand = inputScanner.nextInt();
                    answer = firstOperand + secondOperand;
                    additionCount++;
                    break;
                case "S":
                    System.out.println("You chose Subtraction");
                    symbol = '-';
                    System.out.print("First number\n> ");
                    firstOperand = inputScanner.nextInt();
                    System.out.print("Second number\n> ");
                    secondOperand = inputScanner.nextInt();
                    answer = firstOperand - secondOperand;
                    subtractionCount++;
                    break;
                case "D":
                    System.out.println("You chose Division");
                    symbol = '/';
                    System.out.print("First number\n> ");
                    firstOperand = inputScanner.nextInt();
                    System.out.print("Second number\n> ");
                    secondOperand = inputScanner.nextInt();
                    answer = firstOperand / secondOperand;
                    divisionCount++;
                    break;
                case "M":
                    System.out.println("You chose Multiplication");
                    symbol = '*';
                    System.out.print("First number\n> ");
                    firstOperand = inputScanner.nextInt();
                    System.out.print("Second number\n> ");
                    secondOperand = inputScanner.nextInt();
                    answer = firstOperand * secondOperand;
                    multiplicationCount++;
                    break;
            }

            System.out.printf("\n%d %s %d = %d", firstOperand, symbol, secondOperand, answer);
            break;
        }

    }

    private static void printResults()
    {
        System.out.println();
        System.out.printf("Addition Problems Solved: %d\n", additionCount);
        System.out.printf("Subtraction Problems Solved: %d\n", subtractionCount);
        System.out.printf("Division Problems Solved: %d\n", divisionCount);
        System.out.printf("Multiplication Problems Solved: %d\n", multiplicationCount);
        System.out.printf("Total Problems Solved: %d\n", (additionCount + subtractionCount + divisionCount + multiplicationCount));
    }

    public static void main(String[] args)
    {
        printIntro();
        calculate();
        printResults();
    }
}
