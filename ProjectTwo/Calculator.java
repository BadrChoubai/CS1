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

public class Calculator {
    private static Scanner inputScanner = new Scanner(System.in);
    static int additionCount, subtractionCount, divisionCount, multiplicationCount, moduloCount;

    Calculator() {
        additionCount = 0;
        subtractionCount = 0;
        divisionCount = 0;
        multiplicationCount = 0;
        moduloCount = 0;
    }

    private static void printIntro() {
        System.out.println("Welcome to JCalc v.0.2");
        System.out.println("This program helps you solve simple math problems.\n");
        System.out.println("First, we'll prompt you for the type of operation you'd like to perform");
        System.out.println("Then, we'll prompt you for two different numbers (Integers only)");
        System.out.println("You can solve as many problems as you want, and we'll keep track of it. Happy Solving!\n");
    }

    private static void calculate() {
        String response;
        int operandOne, operandTwo;

        do {
            String operationChoice;
            System.out.println("What operation would you like to perform?");
            System.out.println("(A)ddition");
            System.out.println("(S)ubtraction");
            System.out.println("(M)ultiplication");
            System.out.println("(D)ivision");
            System.out.println("(R) Modulo");

            operationChoice = inputScanner.next().toUpperCase();

            switch (operationChoice) {
                case "A":
                    System.out.println("You chose Addition");
                    System.out.println("Give me a number");
                    operandOne = inputScanner.nextInt();
                    System.out.println("Give me another number");
                    operandTwo = inputScanner.nextInt();
                    System.out.printf("%d + %d = %d\n", operandOne, operandTwo, (operandOne + operandTwo));
                    additionCount++;
                    break;
                case "S":
                    System.out.println("You chose Subtraction");
                    System.out.println("Give me a number");
                    operandOne = inputScanner.nextInt();
                    System.out.println("Give me another number");
                    operandTwo = inputScanner.nextInt();
                    System.out.printf("%d - %d = %d\n", operandOne, operandTwo, (operandOne - operandTwo));
                    subtractionCount++;
                    break;
                case "M":
                    System.out.println("You chose Multiplication");
                    System.out.println("Give me a number");
                    operandOne = inputScanner.nextInt();
                    System.out.println("Give me another number");
                    operandTwo = inputScanner.nextInt();
                    System.out.printf("%d * %d = %d\n", operandOne, operandTwo, (operandOne * operandTwo));
                    multiplicationCount++;
                    break;
                case "D":
                    System.out.println("You chose Division");
                    System.out.println("Give me a number");
                    operandOne = inputScanner.nextInt();
                    System.out.println("Give me another number");
                    operandTwo = inputScanner.nextInt();
                    System.out.printf("%d / %d = %d\n", operandOne, operandTwo, (operandOne / operandTwo));
                    divisionCount++;
                    break;
                case "R":
                    System.out.println("You chose Modulo");
                    System.out.println("Give me a number");
                    operandOne = inputScanner.nextInt();
                    System.out.println("Give me another number");
                    operandTwo = inputScanner.nextInt();
                    System.out.printf("%d %% %d = %d\n", operandOne, operandTwo, (operandOne % operandTwo));
                    moduloCount++;
                    break;
            }

            System.out.println("Would you like to solve another problem");
            System.out.println("(Y)es");
            System.out.println("(N)o");
            response = inputScanner.next();
        } while ((response.startsWith("Y")) || response.startsWith("y"));
    }

    private static void printResults() {
        System.out.println();

        if (additionCount > 0)
            System.out.printf("Addition Problems Solved: %d\n", additionCount);

        if (subtractionCount > 0)
            System.out.printf("Subtraction Problems Solved: %d\n", subtractionCount);

        if (multiplicationCount > 0)
            System.out.printf("Multiplication Problems Solved: %d\n", multiplicationCount);

        if (divisionCount > 0)
            System.out.printf("Division Problems Solved: %d\n", divisionCount);

        if (moduloCount > 0)
            System.out.printf("Modulo Problems Solved: %d\n", moduloCount);

        System.out.printf("Total Problems Solved: %d\n",
                (additionCount + subtractionCount + multiplicationCount + divisionCount + moduloCount));
    }

    public static void main(String[] args) {
        printIntro();
        calculate();
        printResults();

        inputScanner.close();
    }
}
