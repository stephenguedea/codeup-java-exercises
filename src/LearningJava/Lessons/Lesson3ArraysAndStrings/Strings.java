package LearningJava.Lessons.Lesson3ArraysAndStrings;

public class Strings {
    public static void main(String[] args) {
        String greeting = "Hello";
        System.out.println(greeting); // Hello

        String name = "Stephen";
        System.out.println(name); // Stephen

        System.out.println(greeting + ", " + name); // Hello, Stephen

        String message = greeting + ", " + name;
        System.out.println(message); // Hello, Stephen

        // Find the length of a string
        System.out.println(name.length()); // 7
        System.out.println(message.length()); // 14

        int messageLength = message.length();
        int nameLength = name.length();
        int messageNameLength = messageLength + nameLength;
        System.out.println(messageNameLength); // 21

        String upperCase = greeting.toUpperCase();
        System.out.println(upperCase); // HELLO

        String firstSubstring = name.substring(1);
        System.out.println(firstSubstring); // tephen

        String secondSubstring = "hello world".substring(6);
        System.out.println(secondSubstring); // world

        String thirdSubstring = message.substring(1, 3);
        System.out.println(thirdSubstring); // message = hello so substring(1, 3) = el

        String names = "Peter, John, Andy, David";
        String[] splitNames = names.split(", ");
        System.out.println(names);
        for (String temp : splitNames) {
            System.out.println(temp);
        }
    }
}
