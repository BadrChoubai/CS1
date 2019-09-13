import java.util.Scanner;

class Calculator {
    private Scanner scanner;
    private int totalSolvedCount, additionSolveCounter, subtractionSolveCounter, multiplicationSolveCounter, divisionSolveCounter;

    Calculator() {
        this.scanner = new Scanner(System.in);
        this.totalSolvedCount = 0;
        this.additionSolveCounter = 0;
        this.subtractionSolveCounter = 0;
        this.multiplicationSolveCounter = 0;
        this.divisionSolveCounter = 0;
    }
    
    private void printIntro() {
        String systemUser = System.getProperty("user.name");
        System.out.printf("Hello %s welcome to Calculator v.0.0.1 \n\n", systemUser);
    }
    private void calculate() {}
    private void printResult() {};

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        calculator.printIntro();
        calculator.calculate();
        calculator.printResult();
    }
}