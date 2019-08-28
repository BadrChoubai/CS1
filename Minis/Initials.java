import java.util.Scanner;

class Initials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nameParts = { "First", "Middle", "Last" };
        String initials = "";

        for (int i = 0; i < nameParts.length; i++) {
            System.out.printf("What is your %s name? \n", nameParts[i]);
            String answer = scanner.nextLine();
            initials += answer.charAt(0);
        }
        ;

        scanner.close();
        System.out.println(initials);
    };
}