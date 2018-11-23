package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner; // scanner variable
    //create input object and pass scanner object into the constructor

    //create input object and pass scanner object into the constructor
    public Input(Scanner scanner) {
        this.scanner = scanner;
    }




    // String getString
    public String getString() {
        return scanner.nextLine();
    }

    // boolean yesNo
    public boolean yesNo(){
        String userInput = getString();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }

    // int getInt
    public int getInt(int min, int max){
//        System.out.println("Enter a number: " + min + " - " + max);
        int userInput = getInt();
        if (userInput <= max && userInput >= min) {
            System.out.println("Thank you\n");
            return userInput;
        } else {
            System.out.println("Please read the instructions\n");
            return getInt(min, max);
        }
    }

    // getInt()
    public int getInt() {
        int inputInteger;
        try {
            inputInteger = Integer.valueOf(getString());
        } catch (NumberFormatException e){
            System.out.println("ERROR: Must enter a non-decimal number");
            return getInt();
        }
        return inputInteger;
    }

    // double getDouble
    public double getDouble(double min, double max) {
//        System.out.println("Enter a number between " + min + " and " + max);
        double userInput = getDouble();
        if (userInput <= max && userInput >= min) {
            return userInput;
        } else {
            System.out.println("Please read the instructions\n");
            return getDouble(min, max);
        }
    }

    // getDouble()
    public double getDouble(){
        double userInput;
        try {
            userInput = Double.valueOf(getString());
        } catch (NumberFormatException e) {
            System.out.println("ERROR: Must enter a decimal number");
            return getDouble();
        }
        return userInput;
    }

    // getBinary
    public int getBinary() {
        int output;
        try {
            output = Integer.valueOf(getString(), 2);
        } catch (NumberFormatException e){
            System.out.println("ERROR: Invalid binary number. Try again.");
            return getBinary();
        }
        return output;
    }

    // getHex
    public int getHex(){
        int output;
        try {
            output = Integer.valueOf(getString(), 16);
        } catch (NumberFormatException e) {
            System.out.println("ERROR: Invalid hexadecimal. Try again.");
            return getHex();
        }
        return output;
    }

    public static void main(String[] args) {
        Input input = new Input(new Scanner(System.in));
        System.out.println("Enter a number: ");
        int userInt = input.getBinary();
        System.out.println(userInt);
    }

}
