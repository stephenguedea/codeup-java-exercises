public class MethodNotes {
//    public static void main(String[] args) {
        // DEFINING METHODS
//        greetings("Hola", "Esteban");
//        System.out.println(shout("i don't what we're yelling about"));
//        System.out.println(returnThree());

        // CALLING A METHOD
//        startApplication("Starting application, please wait...");

        // METHODS RETURN METHODS
//        System.out.println(returnFive()); // 5
//        System.out.println(returnFive() + returnFive()); // 10
//        System.out.println(returnFive() * 3); // 15

//        String message = returnGreeting("stephen");
//        System.out.println(returnGreeting("stephen") + " " +niceMessage());
//        System.out.println(returnNumber(returnTen()));
//        System.out.println(sayHello("Stephen"));

//        System.out.println(message());
//        System.out.println(message("This is a custom message"));
//        System.out.println(message("Custom message", "Urgent"));
//        System.out.println(message(10));

        // PASSING PARAMETERS TO METHODS
//        String changeMe = "Hello codeup!";
//        changeString(changeMe);
//        System.out.println(changeMe);

        // RECURSION
//        countDownNumber(10);
//        countDownNum(10);

//    }

    // Defining methods
    public static void greetings(String greet, String name) {
        System.out.printf("%s, %s!\n", greet, name);
    }

    public static String shout(String s) {
        return s.toUpperCase() + "!!!";
    }

    public static int returnThree(){
        return 3;
    }

    // CALLING METHODS
    public static void startApplication(String s){
        System.out.printf("%s", s);
    }


    // method return a method
    public static int returnNumber(int number) {
        return number;
    }
    public static int returnFive() {
        return 5;
    }

    public static int returnTen(){
        return returnFive() + returnFive();
    }

    public static String returnGreeting(String name) {
        return String.format("Hello %s,", name);
    }

    public static String niceMessage() {
        return "you are great!";
    }

    public static String sayHello(String name) {
        return String.format("Hello there, %s!", name);

    }

    // PASSING PARAMETERS TO METHODS
    public static void changeString(String s) {
        s = "Wub a lub a dub dub";

    }

    // RECURSION
    public static void count(int n){
        if (n <= 5) {
            System.out.println("All Done");
            return;
        }
        System.out.println(n);
        count(n++);
    }
    public static void main(String[] args) {
        count(5);
    }


    // METHOD OVERLOADING
    public static String message(){
        return "This is a message";
    }
    public static String message(String message) {
        return message;
    }

    public static String message(String message, String status){
        return message + " Status: " + status;
    }

    public static String message(int code) {
        return "Code: " + code + " message";
    }

    //RECURSION
    public static void countDownNumber(int number) {
        for(int i = number; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("Happy New Year!");
    }

    public static int countDownNum(int num) {
        if (num == 0){
            System.out.println("Finished!");
            return 0;
        }
        System.out.println(num);
        return countDownNum(num--);
    }


}
