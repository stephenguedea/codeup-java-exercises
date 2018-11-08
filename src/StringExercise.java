//import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        String message = "We don't need no education\nWe don't need no thought control";
        System.out.println(message);

//        String message = "Check \"this\" out!, \"s inside of \"s!";
        System.out.println(message.replace(message, "\nCheck \\\"this\\\" out!, \\\"s inside of \\\"s!"));

//        String message = "In windows, the main drive is usually C:\\";
        System.out.println(message.replace(message, "\nIn windows, the main drive is usually C:\\\\"));

//        String message = "I can do backslashes \\, double backslashes \\\\,\nand the amazing triple backslashes \\\\\\";
        System.out.println(message.replace(message,"\nI can do backslashes \\, double backslashes \\\\,\nand the amazing triple backslashes \\\\\\"));

//        System.out.println(message.replace("I can do backslashes \\, double backslashes \\\\,\nand the amazing triple backslashes \\\\\\","In windows, the main drive is usually C:\\" ));

    }
}
