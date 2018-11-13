import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//        System.out.println(sum(10, 21));
//        System.out.println(diff(21, 100));
//        System.out.println(product(5, 3));
//        System.out.println(quotient(10, 2));
//        System.out.println(mod(3, 2));
        System.out.println(getInteger(1, 100));
//          System.out.println(getFactorial(1, 10));
//        System.out.println(getFactorial(getInteger(1, 10)));
                    Scanner scanner = new Scanner(System.in);

        rollDice(scanner);

    }

    // BASIC ARITHMETIC
    public static int sum(int number1, int number2) {
        return number1 + number2;
    }

    public static int diff(int number1, int number2) {
        return number1 - number2;
    }

    public static int product(int number1, int number2) {
        return number1 * number2;
    }

    public static int quotient(int number1, int number2) {
        return number1 / number2;
    }

    public static int mod(int number1, int number2) {
        return number1 % number2;
    }

//    2. Create a method that validates that user input is in a certain range

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between " + min + " and " + max);
//        if(!scanner.hasNextInt()) {
//            System.out.println("Please enter a number!\n");
//            return getInteger(min, max);
//        }
        int input = scanner.nextInt();

        if (input <= max && input >= min) {
            System.out.println("You're awesome!\n");
            return input;

        } else {
            System.out.println("Please read the instructions\n");
            return getInteger(min, max);
        }
    }
//
////    3. Calculate the factorial of a number.
    public static int getFactorial(int input) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Would you like to continue? (Yes/No)");
            String userContinue = scanner.next();
            if (userContinue.equalsIgnoreCase("yes") || userContinue.equalsIgnoreCase("y")) {
        long factor = 1;

        for (long i = 1; i <= input;i++) {
            factor *= i;
//                    System.out.println(i + "! " + i + " x " + i++ + " = " + (i * i));
            System.out.println(factor + " is the factor of " + i);

                }
            }
            do {
                break;
            } while (userContinue.equalsIgnoreCase("no") || userContinue.equalsIgnoreCase("n"));
        System.out.println("\nThanks, bye!");
        return 0;
        }



    //     4. Create an application that simulates dice rolling.
    public static int randomRange(int min, int max) {

        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }

    public static void rollDice(Scanner scanner) {
        String userChoice;
        System.out.println("Enter the number of sides for dice: ");
        int numOfSides = getInteger(1, 10);
        do {
            System.out.println("You have rolled a " + randomRange(1, numOfSides) + " and a " + randomRange(1, numOfSides));

            do {
                System.out.println("Would you like to roll again? (y/n)");
                userChoice = scanner.next().trim();
            } while (!userChoice.equalsIgnoreCase("y") & !userChoice.equalsIgnoreCase("n"));
        } while(!userChoice.equals("n"));
    }


}

//     5. Game Development 101






