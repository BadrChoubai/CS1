import java.util.Scanner;

class RestaurantBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double billTotal; 
        int tipPercentage;
        double[] percentageAmounts = {0, 0.10, 0.15, 0.20};


        System.out.println("How much was your bill");
        billTotal = scanner.nextDouble();

        System.out.println("How much would you like to tip?");
        System.out.println("(0) No Tip");
        System.out.println("(1) 10% Tip");
        System.out.println("(2) 15% Tip");
        System.out.println("(3) 20% Tip");        
        tipPercentage = scanner.nextInt();

        scanner.close();
        double billTotalWithTip = calculateTotalWithTip(billTotal, percentageAmounts[tipPercentage]);
        System.out.println(billTotalWithTip);
    }

    public static double calculateTotalWithTip(double billTotal, double tipPercentage) {
        double result;

        result = billTotal + (billTotal * tipPercentage);

        return result;
    }
}