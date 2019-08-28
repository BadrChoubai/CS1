import java.util.ArrayList;
import java.util.Scanner;

class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> userInput = new ArrayList<Integer>();
        
        do {
            System.out.println("Give me a number");
            int num = scanner.nextInt();
            userInput.add(num);
        } while (userInput.size() < 2);
        
        int sumFromarray = getSumFromArray(userInput);
        int productFromArray = getProductFromArray(userInput);
        double quotientFromArray = getQuotientFromArray(userInput);
        System.out.printf("Sum : %s \n",sumFromarray);
        System.out.printf("Product : %s \n",productFromArray);
        System.out.printf("Quotient : %s \n", quotientFromArray);

        scanner.close();
    };

    public static int getSumFromArray(ArrayList<Integer> input) {
        int sum = 0;

        for (int i = 0; i < input.size(); i++) {
            sum+=input.get(i);
        }

        return sum;
    };

    public static int getProductFromArray(ArrayList<Integer> input) {
        int product = 1;

        for (int i = 0; i < input.size(); i++) {
            product*=input.get(i);
        }

        return product;
    };

    public static double getQuotientFromArray(ArrayList<Integer> input) {
        double toDouble = (double) input.get(0);

        return toDouble / input.get(1);
    };
}