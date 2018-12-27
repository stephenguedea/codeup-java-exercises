package LearningJava.Lessons.Lesson5ControlFlowStatements;

public class ForLoop {
    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i++){
//            System.out.println(i);
//        }
        int[] myNumbers = {10, 20, 30, 40, 50};
//        for (int i = 0; i < myNumbers.length; i++){
//            System.out.println(myNumbers[i]);
//        }
        for (int item : myNumbers) {
            System.out.println(item);
        }

    }
}
