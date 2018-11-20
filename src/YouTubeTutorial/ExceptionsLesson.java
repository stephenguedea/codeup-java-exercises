package YouTubeTutorial;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;

public class ExceptionsLesson {
    static Scanner userInput = new Scanner(System.in);



    public static void main(String[] args) {
        // slide 3

        //slide 4
        try {
            getAFile("./somestuff.txt");
        }
        catch (IOException e){
            System.out.println("IO Error Occurred");
        }

        // slide 2
//        System.out.println("How old are you?");
//        int age = checkValidAge();
//        if (age !=0){
//            System.out.println("You are "+ age + " years old");
//        }

        // slide 1
//        divideByZero(2);

    }

    // slide 3
    public static void getAFile(String fileName) throws IOException, FileNotFoundException{
        FileInputStream file = new FileInputStream(fileName);
        // slide 4



        //slide 3
//        try {
//            FileInputStream file = new FileInputStream((fileName));
//        }
//        // THIS CATCHES A SPECIFIED EXCEPTION
//        catch (FileNotFoundException e){
//            System.out.println("Sorry can't find that file");
//        }
//        // THIS CATCHES THE LESS EXACT EXCEPTION
////        catch(IOException e){
////            System.out.println("Unknown IO Error");
////        }
//
//        catch (ClassNotFoundException | IOException e){
//            System.out.println("Unknown IO Error");
//        }
//
//        // THIS CATCHES EVERY EXCEPTION
//        catch (Exception e){
//            System.out.println("Some error occurred");
//        }
//
//        // ALWAYS CALLED NO MATTER WHAT
//        finally {
//            System.out.println("");
//        }
    }

    // slide 2
//    public static int checkValidAge(){
//
//        try {
//            return userInput.nextInt();
//        }
//        catch (InputMismatchException e)
//        {
//            userInput.next();
//            System.out.println("That isn't a whole number");
//            return 0;
//        }
//    }

//    slide 1
//    public static void divideByZero(int a ){

//        try {
//            System.out.println(a/0);
//        }
//        catch (ArithmeticException e){
//            System.out.println("You can't do that!");
//
//            System.out.println(e.getMessage()); // / by zero
//
//            System.out.println(e.toString()); // java.lang.ArithmeticException: / by zero
//
//            e.printStackTrace(); // default error message
//        }
//    }
}
