import java.util.Scanner;

class Initials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char firstInitial, middleInitial, lastInitial;
        String initials;

        System.out.println("What is your first name");
        firstInitial = scanner.nextLine().charAt(0);
        System.out.println("What is your middle name");
        middleInitial = scanner.nextLine().charAt(0);
        System.out.println("What is your last name");
        lastInitial = scanner.nextLine().charAt(0);

        initials = String.format("%s.%s.%s.", firstInitial, middleInitial, lastInitial);

        scanner.close();
        System.out.println(initials);
    };
}