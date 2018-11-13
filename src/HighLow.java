import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {

//        System.out.println(getInteger(1, 100));


        // Create a random number generator
        Random random = new Random();

        // Use Scanner for getting input from user
        Scanner scanner = new Scanner(System.in);

        // use the random generator to pick a number between 0-100
        int max = 100;
        int number = random.nextInt(max);
        int min = 1;
        int guess = 1;
        int numberOfGuess = 1;

        System.out.println("Welcome! Let's play High-Low");
        // loop until the user guessed the number correctly
        while (guess != number) {
            // prompt the user for their next guess

            System.out.println("Enter your guess " + min + " - " + max);

            // read the user's guess
            guess = scanner.nextInt();

            // check if the guess is high, low or correct
            if (guess < number) {
                System.out.println("HIGHER!");
                numberOfGuess++;
            } else if (guess > number) {
                System.out.println("LOWER!");
                numberOfGuess++;
            } else {
                System.out.println("YOU GOT IT!");
                System.out.println("It took you " + numberOfGuess + " attempts!");

            }
        }


//
//    public static String welcome(){
//        return "Welcome to High-Low! Guess what number I'm thinking about!";
//    }
//    public static long getInteger(int min, int max) {
//        System.out.println(welcome());
////        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter a number between " + min + " and " + max);
//        int userInput = scanner.nextInt();
//        if (userInput <= max && userInput >= min) {
//            System.out.println("You're awesome!");
//            return userInput;
//
//        } else {
//            System.out.println("Please read the instructions");
//            return getInteger(min, max);
//        }
//    }

    }
}
