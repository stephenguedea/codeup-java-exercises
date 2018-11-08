import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String talkToBob;
        System.out.println("Talk to Bob!");
        do {

        System.out.println("\nAsk him a question, yell at him, don't say anything, just talk to him");
        String userResponse = scanner.nextLine();

//        System.out.println("Ask Bob a question:");
//        String question = scanner.nextLine();
        if (userResponse.endsWith("?")) {
            System.out.println("- Sure");
        }

//        System.out.println("Tell Bob to do it now!");
//        String scream = scanner.nextLine();
        else if (userResponse.endsWith("!")) {
            System.out.println("- Whoa, chill out!");
        }

//        System.out.println("Don't talk to Bob (just hit enter)");
//        String input = scanner.nextLine();
        else if (userResponse.equals("")) {
            System.out.println("- Fine. Be that way!");
            break;
        }

//        System.out.println("Talk to Bob");
//        String userInput = scanner.nextLine();
//        if (userInput.endsWith(" ") || userInput.endsWith(".") || userInput.endsWith("")) {
//            System.out.println("Whatever");
        else if (userResponse.endsWith(" ") || userResponse.endsWith(".") || userResponse.endsWith("")) {
                System.out.println("- Whatever");

        }



//         ENDWITH(STRING SUFFIX)


//        boolean question = userInput.endsWith("?");
//        System.out.println("Sure");
//
//        boolean screams = userInput.endsWith("!");
//        System.out.println("Whoa, chill out!");
//
//        boolean noAnswer = userInput.
    }
    while (true);
//        System.out.println("Do you want to talk to Bob?");
//        String userAnswer = scanner.nextLine();
//        if (userAnswer.equalsIgnoreCase("yes")) {
//            talkToBob = scanner.next();
//        }
    }
}
