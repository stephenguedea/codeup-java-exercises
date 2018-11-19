package util;

import java.util.Scanner;

public class InputTest {

    // main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Song
        Input test = new Input(scanner); // Loading song onto Deck


        // Play song
        System.out.println(test.getString());
        test.yesNo("");
        System.out.println(test.getInt(12, 70));
        test.getInt();
        System.out.println(test.getDouble(6.50, 10.00));
        test.getDouble();
    }
}
