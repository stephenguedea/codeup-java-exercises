package ExceptionsNotes;

public class ExceptionsLecture {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3};
//        System.out.println(numbers[999]);

//        try {
//            // something that
//            // might go wrong
//        } catch (Exception e) {
//            // handle the error
//        }

//        try {
//            System.out.println("Let's see...");
//            int result = 1 / 0;
//            System.out.println("I can divide by zero!");
//        } catch (ArithmeticException e) {
//            System.out.println("Math still works!");
//        }

//        int[] numbers = {1, 2, 3}; // an array of integers
//        int x; // assign to
//
//        try {
//            x = numbers[100];
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Caught an array index exception!");
//        } catch (Exception e) {
//            System.out.println("Caught a generic exception!");
//        } finally {
//            System.out.println("This will always run.");
//
//        }

        try {
            throw new Exception("Bummer...");
        } catch (Exception e){
            e.printStackTrace();
        }

    }

}
