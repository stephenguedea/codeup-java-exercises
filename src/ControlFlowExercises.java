
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // WHILE
//        int i = 0;
//        while (i < 10) {
//            System.out.println("i is " + i);
//            i++;
//        }

        // DO LOOP
//        do {
//            System.out.println("i is ");
//
//        } while (false);

//        FOR LOOP
//        for (int i = 0; i < 10; i++) {
//            System.out.println("i is " + i);
//        }

//        BREAK AND CONTINUE
//        for (int i = 1; i < 100; i++) {
//            System.out.println(i);
//            if ( i == 5) {
//                break;
//            }
//        } // print 1 - 5

        // CONTINUE
//        for(int i = 1; i <= 10; i++) {
//            if (i % 2 == 1) {
//                continue;
//            }
//            System.out.println(i);

//        EXERCISE WHILE
//        int i = 5;
//        while(i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }

//        EXERCISE DO WHILE
        // 0 - 100 by 2s
//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while (i <= 100);

        // 100 - -10 by 5s
//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);

//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i <= 1000000L);
//        System.out.println(i);

//        EXERCISE FOR LOOP
//        for(int i = 100; i >= -10; i -= 5){
//            System.out.println(i);
//        }

//        for(long i = 2; i < 1000000L; i *= i){
//            System.out.println(i);
//        }

//        FIZZBUZZ
//        for(int i = 1; i <= 100; i++) {
//            if((i % 3 == 0) && (i % 5 == 0)){
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

//        3. DISPLAY A TABLE OF POWERS
//        final int NMAX = 4;
//        final int XMAX = 5;
//
//        for (int n = 1; n < NMAX; n++) {
//            System.out.printf("%10d", n);
//        }
//        System.out.println();
//        for (int n = 1; n <= NMAX; n++) {
//            System.out.printf("%10s", "x ");
//        }
//        System.out.println();
//
//        for (double x = 1; x <= XMAX; x++) {
//            for (int n = 1; n <NMAX; n++) {
//                System.out.printf("%12f", Math.pow(x, n));
//            }
//            System.out.println();
//        }

//        System.out.println("Enter a number: ");
//
//        int i, numLimit, square, cube;
//        Scanner input = new Scanner(System.in);
//        numLimit = input.nextInt();
//
//        System.out.println("number | squared | Cubed ");
//        System.out.println("------ | ------- | ----- ");
//
//        for(i = 1; i <= numLimit; i++) {
//            square = i * i;
//            cube = i * i * i;
//
//            System.out.printf("%-7d| ", i);
//            System.out.printf("%-8d| ", square);
//            System.out.printf("%d\n", cube);
//            if (i == 3) {
//                System.out.println("Do you wish to continue?");
//                String response = scanner.next();
//                if (response.equals("no")) {
//                    break;
//                }
//            }
//        }


//        String more;
//        do {
//        System.out.print("What number would you like to go up to? ");
//        int num, numLimit, numSquare, numCube;
//        Scanner input = new Scanner(System.in);
//        numLimit = input.nextInt();
//
//        System.out.println("Number | Squared | Cubed");
//        System.out.println("====== | ======= | =======");
//
//        for (num = 1; num <= numLimit; num++) {
//            numSquare = num * num;
//            numCube = num * num * num;
//
//            System.out.printf("%-7d| ", num);
//            System.out.printf("%-8d| ", numSquare);
//            System.out.printf("%d\n", numCube);
//        }
//        System.out.println("Would you like to continue?");
//        more = scanner.nextLine();
//    } while (more.equalsIgnoreCase("yes"));
//        System.out.println("Have a great day!");

//        System.out.println("What number would you like to go up to?");
//        int number, numberLimit, numberSquare, numberCube;
//        Scanner userInput = new Scanner(System.in);
//        numberLimit = userInput.nextInt();
//        System.out.println("Number | Squared | Cubed");
//        System.out.println("====== | ======= | =====");
//
//        for(number = 1; number <= numberLimit; number++) {
//            numberSquare = number * number;
//            numberCube = number * number * number;
//
//            System.out.printf("%-7d| ", number);
//            System.out.printf("%-8d| ", numberSquare);
//            System.out.printf("%d\n", numberCube);
//        }


//        4. CONVERT GIVEN NUMBER GRADES INTO LETTER GRADES
        String grades;
        do {
            System.out.println("Enter a numerical grade 0 to 100: ");
            int grade = scanner.nextInt();
            if ((grade <= 100) && (grade >= 98)) {
                System.out.println("Grade: A+");
            } else if ((grade <= 97) && (grade >= 94)) {
                System.out.println("Grade: A");
            } else if ((grade <= 93) && (grade >= 90)) {
                System.out.println("Grade: A-");
            } else if ((grade <= 89) && (grade >= 87)) {
                System.out.println("Grade: B+");
            } else if ((grade <= 86) && (grade >= 84)) {
                System.out.println("Grade: B");
            } else if ((grade <= 83) && (grade >= 80)) {
                System.out.println("Grade: B-");
            } else if ((grade <= 79) && (grade >= 77)) {
                System.out.println("Grade: C+");
            } else if ((grade <= 76) && (grade >= 74)) {
                System.out.println("Grade: C");
            } else if ((grade <= 73) && (grade >= 70)) {
                System.out.println("Grade: C-");
            } else if ((grade <= 69) && (grade >= 67)) {
                System.out.println("Grade: D+");
            } else if ((grade <= 66) && (grade >= 64)) {
                System.out.println("Grade: D");
            } else if ((grade <= 63) && (grade >= 60)) {
                System.out.println("Grade: D-");
            } else if (grade <= 59) {
                System.out.println("Grade: F");
            } else {
                System.out.println("Invalid: enter a numerical grade 0 - 100");
            }
            System.out.println("Would you like to continue?");
            grades = scanner.next();
        } while (grades.equalsIgnoreCase("yes"));
        System.out.println("Have a great day!");
//        System.out.println("Would you like to enter another grade? (Y/N)");
//        char userInput = scanner.next;
//        if ((userInput == 'Y') || (userInput == 'y')) {
//            // enter a number
//        } else if ((userInput == 'N') || (userInput == 'n')) {
//            System.out.println("Goodbye");
//        } else {
//            System.out.println("Please enter Y or N");
//        }

    }
}
