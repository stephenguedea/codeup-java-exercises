import java.util.Scanner;

public class StringNotes {
    public static void main(String[] args) {
//        String message = "Hello";
//        System.out.println(message); // Hello
//
//        message = message + " World!";
//        System.out.println(message); // Hello World!
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Continue? [Y/N] ");
//        String userInput = scanner.next();
//        System.out.println(userInput);

        // DON'T DO THIS
//        if ("I am a string" == "I am a string") {
//            System.out.println("Strings are equal");
//        }

        // DO THIS INSTEAD
//        if ("I am a string".equals("I am a string")) {
//            System.out.println("Strings are equal");
//        }

//        String one = "2";
//        String two = "2";
//        System.out.println(one.equals(two)); // true

//        String greeting = "Howdy";
//        System.out.println(greeting.equalsIgnoreCase("HOWDY")); // true


        // START WITH
//        String title = "Dr. Dolittle";
//        boolean isADoctor = title.toLowerCase().startsWith("dr");
//        System.out.println(isADoctor);

        // ENDWITH(STRING SUFFIX)
//        String travisParkAddress = "311 E Travis St, San Antonio, TX 78205";
////        String codeupZip = '78205';
//        boolean codeupZip = travisParkAddress.endsWith("78205");
//        System.out.println(codeupZip);


        // CharAt()
//        boolean firstLetterCap = false;
//        String word = "Test";
//
//        char firstletter = word.charAt(0);
//
//        if (firstletter == Character.toUpperCase(firstletter)) {
//            firstLetterCap = true;
//        }
//
//        System.out.println(firstLetterCap);

        // INDEXOF
//        String cat = "cat";
//        System.out.println(cat.indexOf("at")); // 1

        // lastIndexOf
//        String good = "Good";
//        System.out.println(good.lastIndexOf("o")); // 2
//
//        String longWord = "Thisisthelongestwordever";
//        System.out.println(longWord.length());

        //.replace(char oldChar, char newChar)
//        String search = "Tiny cats looking cute.";
//        String parsedSearch = search.replace("cats", "dogs");
//        System.out.println(search);
//        System.out.println(parsedSearch);

        //.substring(int beginIndex[, int endIndex])
//        String name = "Stephen Ray Guedea";
//        String firstName = name.substring(0, name.indexOf(" "));
//        System.out.println(firstName);
//        String middleName = name.substring(firstName.length() + 1);
//        System.out.println(middleName);
//        String lastName = name.substring(name.lastIndexOf(" ") + 1);
//        System.out.println(lastName);

        // .toLowerCase() .toUpperCase()
//        String hello = "hELlo";
//        System.out.println(hello.toLowerCase());
//        System.out.println(hello.toUpperCase());

        //.trim()
//        String input = "   bob   smith \n\n ";
//        String trimmedInput = input.trim();
//        System.out.println(trimmedInput);
//        System.out.println("|" + input + "|");


//        String word1 = "Test";
//        String pigLatinWord = word1
//                .trim()
//                .toLowerCase()
//                .substring(1)
//                .concat(word1.substring(0, 1).toLowerCase())
//                .concat("ay");
//            System.out.println(pigLatinWord);
    }
}
