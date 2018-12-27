package LearningJava.Lessons.Lesson6OOB;

public class StaticDemo {
    public static void main(String[] args) {
        anotherClass ac = new anotherClass();
        System.out.println(ac.message);
        ac.displayMessage();

        System.out.println(anotherClass.greetings);
        anotherClass.displayGreeting();

    }

}

class anotherClass {
    // Non static field and method
    public String message = "Hello World";

    public void displayMessage() {
        System.out.println("Message = " + message);
    }

    // Static field and method
    public static String greetings = "Good morning";

    public static void displayGreeting() {
        System.out.println("Greeting = " + greetings);
    }
}



