package LearningJava.Lessons.Lesson6OOB;

import java.util.Arrays;

// one class
public class ArrayMethodDemo {

    public static void main(String[] args) {
        // INITIALIZED A MYCLASS OBJECT CALLED AMD
        MyClass amd = new MyClass();

        // DECLARED AN ARRAY AND PASSED IT IN AS AN ARGUMENT TO THE PRINTFIRSTELEMENT METHOD
        int[] myArray = {1, 2, 3, 4, 5};
        amd.printFirstElement(myArray);


        int[] myArray2 = amd.returnArray();
        System.out.println(Arrays.toString(myArray2));
        System.out.println();

        int number = 2;
        System.out.println("Number before pass primitive = " + number);
        amd.passPrimitive(number);
        System.out.println("Number after pass primitive = " + number);

        System.out.println();

        System.out.println("myArray[1] before pass reference = " + myArray[1]);
        amd.passReference(myArray);
        System.out.println("myArray[1] after pass reference = " + myArray[1]);
    }

}

// second class
class MyClass {
    // METHOD
    public void printFirstElement(int[] a) {
        System.out.println("The first element is " + a[0]);
    }

    // METHOD
    public int[] returnArray() {
        int[] a = new int[3];
        for (int i = 0; i < a.length; i++) {
            a[i] = i*2;
        }
        return a;
    }

    // METHOD
    public void passPrimitive(int primitivePara){
        primitivePara = 10;
        System.out.println("Value inside method = " + primitivePara);
    }

    // METHOD
    public void passReference(int[] refPara) {
        refPara[1] = 5;
        System.out.println("Value inside method = " + refPara[1]);
    }
}

