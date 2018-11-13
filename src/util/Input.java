package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner; // scanner variable
    //create input object and pass scanner object into the constructor
//    public Input() {
//        scanner
//        new Scanner(System.in);
//    }

    //create input object and pass scanner object into the constructor
    public Input(Scanner scanner) {
        this.scanner = scanner;
    }


    //        Scanner scanner = new Scanner(System.in);

    public String getString() {
        System.out.println("Welcome to your Application\n======================\n");
        System.out.println("Would you like to start the application? [Y/N]");
        String userInput = scanner.next();
        return userInput;
    }

    public boolean yesNo(String userInput){

        if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")){
            System.out.println("Great, let's start!");

        } else if (userInput.equalsIgnoreCase("n") || userInput.equalsIgnoreCase("no")) {
            System.out.println("Goodbye");
        }

        return true;

    }

    public int getInt(int min, int max){
        System.out.println("Enter your age: " + min + " and " + max);

        int userInput = scanner.nextInt();

        if (userInput <= max && userInput >= min) {
            System.out.println("Thank you!\n");

        } else {
            System.out.println("Please read the instructions\n");
            return getInt(min, max);
        }
        return userInput;
    }

    public int getInt() {
        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        System.out.println("Enter an expected hourly rate: " + min + " and " + max);

        double userInput = scanner.nextDouble();

        if (userInput <= max && userInput >= min) {
            System.out.println("Looks good, we'll look other your information and contact you shortly. Thank you!\n");
            return userInput;

        } else {
            System.out.println("Please read the instructions\n");
            return getDouble(min, max);
        }
    }

    public double getDouble(){
        return scanner.nextDouble();
    }

}
