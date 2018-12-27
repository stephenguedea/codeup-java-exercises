package LearningJava.Lessons.Lesson5ControlFlowStatements;

public class whileStatement {
    /* while (condition is true)
    {
        do A
    }
     */
    public static void main(String[] args) {
//        int counter = 5;
//        while (counter > 0) {
//            System.out.println("Counter = " + counter );
//            counter = counter - 1;
//        }

        // DO-WHILE STATEMENT
//        int counter = 100;
//        do {
//            System.out.println("Counter = " + counter);
//            counter++;
//        } while (counter<0);

//        BREAK
        for (int i = 0; i <= 5; i++){
            System.out.println(i);
            if(i == 2) {
                break;
            }
        }
    }

}
