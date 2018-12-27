package LearningJava.Lessons.Lesson3ArraysAndStrings;
import java.util.Arrays;


public class ArraysLesson {
    public static void main(String[] args) {
        int[] userAge;
        userAge = new int[] {21, 22, 23, 24, 25};
        for (int u : userAge) {
            System.out.println(u);
        }

        int[] arr1 = {0, 2, 4, 6, 8, 10};
        int[] arr2 = {0, 2, 4, 6, 8, 10};
        int[] arr3 = {10, 8, 6, 4, 2, 0};

        boolean result1 = Arrays.equals(arr1, arr2);
        boolean result2 = Arrays.equals(arr1, arr3);

        System.out.println(result1 + " " + result2);

        int [] source = {12, 1, 5, -2, 16, 14, 18, 20, 25};
        int [] dest = Arrays.copyOfRange(source, 3, 7);
        System.out.println(Arrays.toString(dest));

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
    }

}
