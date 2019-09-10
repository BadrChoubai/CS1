import java.util.Scanner;

class MilitaryTimeConverter {
    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);

        System.out.println("Input military time to convert");
        String userInput = userInputScanner.nextLine();

        userInputScanner.close();

        convertMilitaryTime(userInput);
    }

    public static String convertMilitaryTime(String input) {

        String civilianTime;

        int hours = Integer.parseInt(input.substring(0, 2));

        if (hours > 12) {
            hours = hours - 12;
        }

        civilianTime = String.format("%s:%s", hours, input.substring(2, 4));

        System.out.printf("%s in civilian time is %s \n", input, civilianTime);
        return input;
    }
}