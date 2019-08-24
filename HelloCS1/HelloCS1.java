/*
	Program: Hello World;
	Author: Badr Choubai;
	Date: 2019-08-21;

	Description: A hello world program written in Java.
*/

public class HelloCS1 {
    public static void main(String[] args) {
        hello();
    };

    public static void hello() {
        String name = "Badr Choubai";
        System.out.println("Hello Badr Choubai!");
        System.out.printf("Hello %s! \n", name);
        System.out.println("Ending Program");
    };
};