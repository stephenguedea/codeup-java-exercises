import java.util.Scanner;

public class ConsoleExercise {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f\n", pi);

        // SCANNER CLASS
        Scanner scanner = new Scanner(System.in);
//        scanner.useDelimiter(",");

//
//        System.out.print("Enter Something: ");
//        String userInput = scanner.nextLine();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");
//
        System.out.println("Please enter your first, middle, and last name");
        String firstName = scanner.next();
        String middleName = scanner.next();
        String lastName = scanner.next();
        System.out.println("Your name is " + firstName + " " + middleName + " " + lastName);
//
//        // ASK FOR AGE
//        1. Prompt a user to enter a integer and store that value in an int variable using the nextInt method.

//        System.out.println("How old are you?");
//        int age = scanner.nextInt();
//        System.out.println("You are " + age + " years old!");

//        System.out.println("Enter your favorite number: ");
//        int inputNumber = scanner.nextInt();
//        System.out.println("Your favorite number is " + inputNumber);

//        2. Prompt a user to enter 3 words and store each of them in a separate variable,
//        then display them back, each on a newline.

//        System.out.println("Please enter 3 favorite superheros: ");
//        String hero = scanner.nextLine();
//        System.out.println(hero);

        // BETTER WAY


//        System.out.println("Please enter 3 favorite superheros: ");
//        String hero = scanner.nextLine();
//        System.out.println(hero);
//
//        String hero1 = scanner.next();
//        String hero2 = scanner.next();
//        String hero3 = scanner.next();
////
////
//        System.out.printf("%s, %s, %s", hero1, hero2, hero3);

//        3. Prompt a user to enter a sentence, then store that sentence in a String variable using the .next method,
//        then display that sentence back to the user.

//        4. Rewrite the above example using the .nextLine method.
//        System.out.println("Enter your favorite quote:");
//        String quote = scanner.nextLine();
//        System.out.println("Your quote is... " + quote);

//        System.out.println("Please enter your favorite number: ");
//        int num = scanner.nextInt();
//        System.out.println(num);
//        scanner.nextLine();


//        CALCULATE THE PERIMETER AND AREA and VOLUME (of a rectangle)
//        System.out.println("Enter the length and width:");
//        float num1 = scanner.nextFloat();
//        float num2 = scanner.nextFloat();
//
//        System.out.println("The perimeter is " + (2*num1 + 2*num2));
//        scanner.nextLine();
//        System.out.printf("The area is %.1f", (num1 * num2));
//
//        System.out.println("\nEnter the base: ");
//        float num3 = scanner.nextFloat();
//        System.out.printf("The volume is %.2f",(num1 * num2 * num3));

//        System.out.print("Enter the length of the classroom in feet: ");
//        int lengthInFeet = Integer.parseInt(scanner.nextLine());
//
//        System.out.print("Enter the width of the classroom in feet: ");
//        int widthInFeet = Integer.parseInt(scanner.nextLine());
//
//        int area = lengthInFeet * widthInFeet;
//        int perimeter = lengthInFeet * 2 + widthInFeet * 2;
//        String message = String.format("Room area is %d feet\nPerimeter is %d feet", area, perimeter);

//        System.out.println(message);








    }

}
