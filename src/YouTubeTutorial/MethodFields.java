package YouTubeTutorial;

import java.util.Scanner;

public class MethodFields {
    static int randomNumber;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(getRandomNum());
        int guessResult = 1;
        int randomGuess = 0;

        while(guessResult != -1) {
            System.out.println("Guess a number 1 - 50");
            randomGuess = scanner.nextInt();
            guessResult = checkGuess(randomGuess);
        }
        System.out.println("Yes random number is " + randomGuess);

//        int d = 5;
//        tryToChange(d); // 5 (passing the value)
//        System.out.println("Main d = " + d); // 5


    }


    public static int getRandomNum(){
        randomNumber = (int)(Math.random() * 51);
        return randomNumber;
    }

    public static int checkGuess(int guess){
        if (guess == randomNumber){
            return -1;
        } else {
            return guess;
        }
    }

    // pass by values
//    public static void tryToChange(int d){
//        d = d + 1;
//        System.out.println("Try to Change d = " + d); // 6
//    }

}
