import java.util.Scanner;

class Calculator {
    private Scanner prompter;
    private int solveCounter;
    private int additionCount;
    private int subtractionCount;
    private int multiplicationCount;
    private int divisionCount;

    Calculator() {
        this.prompter = new Scanner(System.in);
        this.solveCounter = 0;
    }

    public void printIntro() {
        System.out.println("Welcome to Calculator v0.1 \n");
    }

    public void calculate() {
        String[] operationChoices = {"Addition", "Subtraction", "Multiplication", "Division"};
        int userOperationChoice;
        Character operation;
    
        System.out.println("Choose a mathematical operation");
        for (int i = 0; i < operationChoices.length; i++) {
            System.out.printf("(%s) - %s \n", i+1, operationChoices[i]);
        }

        userOperationChoice = this.prompter.nextInt() - 1;

        switch(operationChoices[userOperationChoice].toLowerCase()) {
            case "addition":
                operation = '+';
                break;       
            case "subtraction":
                operation = '-';
                break;       
            case "multiplication":
                operation = '*';
                break;       
            case "division":
                operation = '/';
                break;     
            default:
                operation = '_';
        }


    }

    public static void main(String[] args) {
        Calculator main = new Calculator();
        main.printIntro();
        main.calculate();
    }
}