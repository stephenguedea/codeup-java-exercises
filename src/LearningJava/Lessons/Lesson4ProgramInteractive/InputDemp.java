package LearningJava.Lessons.Lesson4ProgramInteractive;

import java.util.Scanner;

public class InputDemp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer");
        int myInt = input.nextInt();
        System.out.printf("you entered %d", myInt);


        System.out.println("\nEnter a double");
        double myDouble = input.nextDouble();
        System.out.printf("you entered %.2f", myDouble);

        System.out.println("\nEnter a string");
        input.nextLine();
        String myString = input.nextLine();
        System.out.printf("You entered \"%s\". %n%n", myString);
    }
}
