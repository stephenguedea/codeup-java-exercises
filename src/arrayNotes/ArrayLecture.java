package arrayNotes;

import java.time.Period;
import java.util.Arrays;

public class ArrayLecture {
    public static void main(String[] args) {
//        int[] nums = new int[3];
//        System.out.println(nums[0]); // 0
//        System.out.println(nums[1]); // 0
//        System.out.println(nums[2]); // 0
//
//        String[] num = new String[3];
//        System.out.println(num[0]); // null
//        System.out.println(num[1]); // null
//        System.out.println(num[2]); // null

//        int[] nums = new int[3];
//        nums[0] = 7;
//        System.out.println(nums[0]); // 7
//        System.out.println(nums[1]); // 0
//        System.out.println(nums[4]); // ERROR!!!

//        int[] nums = new int[3];
//        nums[0] = 7;
//        nums[0] = 9;
//        nums[1] = 10;
//        nums[2] = 12;
//
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
        // 9
        // 10
        // 12

//        String[]  = new String[4];
//        names[0] = "adam";
//        names[1] = "bob";
//        names[2] = "catie";
//        names[3] = "daisy";
//
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//        }
//        // adam bob catie daisy

        // a little different way
//        int nums[] = new nums[3];

//        Person p1 = new Person("Fred", 99);
//        Person p2 = new Person("Sally", 45);
//        Person p3 = new Person("Billy", 30);
//
//        Person[] people = new Person[3];
//
//        people[0] = p1;
//        people[1] = p2;
//        people[2] = p3;

//        String[] beatles = {"John", "Paul", "Ringo"};
//
//        System.out.println(beatles.length); // 3
//        System.out.println(beatles[0]); // "John"
//        System.out.println(beatles[1]); // "Paul"
//        System.out.println(beatles[2]); // "Ringo"
//
//        for (int i = 0; i < beatles.length; i++ ) {
//            System.out.println(beatles[i]);
//        }
//
//        final int NUMBER_OF_BEATLES = 4;
//        BandMember[] theBeatles = new BandMember[NUMBER_OF_BEATLES];
//
//        theBeatles[0]


        // array initializer
//        String[] names = { "mary", "bob", "kyle"};
//
//        // enhance for loop
//        for (String name : names) {
//            System.out.println(name);
//        }


        // THE ARRAYS CLASS (bag of tools)


        // Arrays.equals(array1, array2) - returns true if two array elements are equal and in oder
//        String[] words = {"Mushroom", "Mushroom"};
//        String[] words2 = {"Mushroom", "Mushroom"};
//        System.out.println(Arrays.equals(words, words2));

//        String[] testArray = new String[4];
//        Arrays.fill(testArray, "Badgers");
//        String[] twoBadgers = Arrays.copyOf(testArray, 4);
//        System.out.println(Arrays.toString(twoBadgers)); // [Badgers, Badgers, Badgers, Badgers]
//        System.out.println(twoBadgers);

//        String[] meme = {"Badgers", "Mushroom", "Badgers", "Snake"};
//
//        String[] memeCopy = Arrays.copyOf(meme, meme.length);
//        Arrays.sort(memeCopy);
//        System.out.println(Arrays.toString(meme)); // [Badgers, Mushroom, Badgers, Snake]
//        System.out.println(Arrays.toString(memeCopy)); // [Badgers, Badgers, Mushroom, Snake]

        // Arrays.binarySearch(array, value) - returns the index of a value if in the array or -1 if not found
//                String[] meme = {"Badgers", "Mushroom", "Badgers", "Snake"};
//                Arrays.sort(meme);
//        System.out.println(Arrays.binarySearch(meme, "fox")); // -5
//        System.out.println(Arrays.binarySearch(meme, "Mushroom")); // 2


        // TWO-DIMENSIONAL ARRAYs
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

//        System.out.println(matrix[2][1]);
//
//        for(int[] row : matrix) {
//            System.out.println("+---+---+---+");
//
//            System.out.print("| ");
//            for(int n : row) {
//                System.out.print(n + " | ");
//            }
//            System.out.println();
//        }
//        System.out.println("+---+---+---+");

        int[] nums = new int[3];
        nums[0] = 7;
        nums[0] = 9;
        nums[1] = 10;
        nums[2] = 12;



        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }




    }
}
