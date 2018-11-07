public class HelloWorld {
    public static void main(String[] args){

//        System.out.println("Hello World!");
        // ^^ JAVA's console.log() version

//        int myFavoriteNumber = 9;
//        System.out.println(myFavoriteNumber);

//        String myString = "3.14159";
//        System.out.println(myString);

//      1 way  float myNumber = 3.14F;
//        System.out.println(myNumber);

//        OR
//        double myNumber = 3.14;
//        float num = (float)myNumber;
//                System.out.println(num);

//        OR OR
//        float myNumber = (float) 3.14;
//        System.out.println(myNumber);

        // 10.
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

        // 11.
//        int class = 9;
//        System.out.println(class); can't use class



        // 9. Change your code to declare myNumber as a float.
        // Assign the value 3.14 to it. What happens? What are two ways we could fix this?
//        float myNumber = 3.14f;
//        System.out.println(myNumber);


        // 12.
//        OBJECT IS THE MOST GENERIC TYPE IN JAVA.
//        YOU CAN ASSIGN ANY VALUE TO A VARIABLE OF TYPE Object
        String theNumberThree = "three";
        Object o = theNumberThree;
//        int three = (int) "three";
        System.out.println(o);

//        int x = 4;
//        x = x + 5;

//        ANOTHER WAY
//        int x = 4;
//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y = y * x;
//        ANOTHER WAY
//        y *= x;
//        System.out.println(y);

//        int x = 10;
//        int y = 2;
//        x = x / y;
////        y = y - x;
////        ANOTHER WAY
        // x /= y;
//        y -= x;
//        System.out.println(y);


        System.out.println(Byte.MAX_VALUE); // 127
//        byte gulp = 127;
//        gulp++;
//        System.out.println(gulp); // -128

        byte gulp = -128;
        gulp--;
        System.out.println(gulp); // 127

    }
}
