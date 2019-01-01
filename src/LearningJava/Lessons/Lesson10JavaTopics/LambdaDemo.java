package LearningJava.Lessons.Lesson10JavaTopics;

public class LambdaDemo {

    public static void main(String[] args) {
        MyNumber num1; // declared a reference (num1) to MyNumber

        num1 = () -> 12.3; // assigned an lambda expression to num1
        System.out.println("The value is " + num1.getValue()); //12. 3 // invoked the getValue() method (num1.getValue())

        num1 = () -> 2 + 3;
        System.out.println("The value is " + num1.getValue()); // 5.0

        num1 = () -> {
            int counter = 1;
            int sum = 0;
            while (counter < 5){
                sum = sum + counter;
                counter++;
            }
            return sum;
        };
        System.out.println("The value is " + num1.getValue()); // 10.0

        MyNumberPara num2;

        num2 = (n, m) -> n + m;
        System.out.println("The value is " + num2.getValue2(2, 3)); // 5.0

        num2 = (n, m) -> {
            if (n > 10) {
                return m;
            } else {
                return m + 1;
            }
        };
        System.out.println("The value is " + num2.getValue2(3, 9)); // 10.0
//        System.out.println("The value is " + num2.getValue2(3, 9.1)); // <- can't run (9.1 is not of int type)
    }
}

// Declare the functional interface MyNumber
@FunctionalInterface
interface MyNumber {
    double getValue();
}

// Declare the functional interface MyNumberPara
@FunctionalInterface
interface MyNumberPara {
    double getValue2(int n, int m); // <- -
}
