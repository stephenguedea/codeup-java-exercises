package YouTubeTutorial;

import java.util.Scanner;

public class JavaLessonTwo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What's your favorite number: ");
//        int userInput = sc.nextInt();

        if (sc.hasNextDouble())
        {
            double numberEntered = sc.nextDouble();
            System.out.println("You entered " + numberEntered);
            double numberEnteredRounded = Math.round(numberEntered);
            System.out.println(numberEntered + " rounds to " + numberEnteredRounded);
            double numberEnteredTimes2 = numberEntered * 2;
            System.out.println(numberEntered + " x 2 = " + numberEnteredTimes2);

//            // round number up
//            int numCeiling = (int)Math.ceil(5.24);
//
//            // round number down
//            int numFlooring = (int)Math.floor(5.24);
//
//            // rounding general
//            int numRound = (int)Math.round(5.63);

            // Random number generator
            int randomNumber = (int)(Math.random() * 11); // this is 0 - 10
            int randomNumber2 = (int)(Math.random() * 2); // this is 0 - 1
            System.out.println(randomNumber);
            System.out.println(randomNumber2);

            int whichIsSmaller = Math.min(5, 7);
            int whichIsBigger = Math.max(5,7);
            System.out.println(whichIsSmaller); // 5
            System.out.println(whichIsBigger); // 7


        } else {
            System.out.println("Enter an integer next time!");
        }
    }
}
