package LearningJava.Lessons.Lesson2Variables;

public class Variables {
    public static void main(String[] args) {
        byte userAge = 20;
        short numberOfStudents = 45;
        int numberOfEmployees = 500;
        long numberOfInhabitants = 21021313012678L;

        float hourlyRate = 60.5f;
        double numberofHours = 5120.5;

        char grade = 'A';
        boolean proote = true;

        byte level = 2, userExperience = 5; // how to declare and initialize two of the same date type

        byte year; // declare the variable first
        year = 20; // initialize it later

//        System.out.println(year); // 20

        // THE ASSIGNMENT OPERATOR
        int x = 5;
        int y = 10;
        System.out.println(x - y); // -5
        System.out.println(y - x); // 5

        System.out.println(7 / 2); // 3
        System.out.println(7.0 / 2); // 3.5
        System.out.println(7 / 2.0); // 3.5
        System.out.println(7.0 / 2.0 ); // 3.5

        /* if both are integers, Java will give an integer answer
        if neither's a non integer, you'll get a non integer answer
         */
        x++;
        System.out.println(x); //6


        // TYPE CASTING
        // convert from one data type to another, double to int, or int to double, etc.

        // Assign a short to a double
        short age = 10;
        double myAgeDouble = age;
        System.out.println(myAgeDouble); // 10.0 NOT 10

        // Want to assign a larger data type to a smaller data type...
        int z = (int) 20.9;
        System.out.println(z); // 20
        // THIS IS NARROWING PRIMITIVE CONVERSION
        // the decimal portion is truncated after the conversion

        // Cast a double into a float
        // ==========================

        // assign 20.9 to a float...
        float num1 = (float) 20.9;
        System.out.println(num1); // 20.9
        // OR
        float num2 = 20.9F;
        System.out.println(num2); //
    }

}
