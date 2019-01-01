package LearningJava.Lessons.Lesson8Collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

        LinkedList<Integer> userAgeList = new LinkedList<>();

        userAgeList.add(40);
        userAgeList.add(53);
        userAgeList.add(45);
        userAgeList.add(53);
        userAgeList.add(2, 51);

        System.out.println(userAgeList.size()); // 5
        userAgeList.remove(3);
        System.out.println(userAgeList.contains(12)); // false
        System.out.println(userAgeList.indexOf(12)); // -1
        System.out.println(userAgeList.get(2)); // 51

        Integer[] userAgeArray = userAgeList.toArray(new Integer[0]);
        System.out.println(userAgeArray[0]); // 40
        System.out.println(userAgeList); // [40, 53, 51, 53]

        // WITH LINKEDLIST
        System.out.println(userAgeList.poll()); //40
        System.out.println(userAgeList); // [53, 51, 53]

    }

    // USING LISTS IN OUR METHODS
    public void methodOne(ArrayList<Integer> m){
        // some implementation code
    }

    public ArrayList<Integer> methodTwo(){
        ArrayList<Integer> a = new ArrayList<>();
        // some implementation code

        return a;
    }
}

/* NOTE:
this code demonstrates some of the methods mentioned in the ArrayList section.
 */