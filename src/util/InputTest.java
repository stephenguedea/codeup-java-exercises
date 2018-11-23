package util;

import java.util.Scanner;

public class InputTest {

    // main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Song
        Input test = new Input(scanner); // Loading song onto Deck


        // Play song
        System.out.println("Please enter a number: ");
        int userInt = test.getBinary();
        System.out.println(userInt);


        System.out.println("Enter your favorite color");
        String favColor = test.getString();
        System.out.println(favColor);

        System.out.println("Are you awesome? [y/n]");
        boolean userIsAwesome = test.yesNo();
        if (userIsAwesome) {
            System.out.println("You are REALLY AWESOME");
        } else {
            System.out.println("Don't stop believin'! ");
        }


//        System.out.println(test.getInt(12, 70));
        test.getInt(12, 70);
//        System.out.println(test.getDouble(6.50, 10.00));
        test.getDouble(6.50, 10.10);
    }
}
