package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    // MAIN METHOD
    public static void main(String[] args) {

        // CREATE A HASHMAP NAMED STUDENTS
//        HashMap<String, String> usernames = new HashMap<>();
        HashMap<String, Student> students = new HashMap<>();

        // CREATE 4 STUDENTS OBJECTS WITH AT LEAST 3 GRADES EACH
        // AND ADD THEM TO THE MAP
        students.put("sguedea", new Student("Stephen"));
        students.put("lizb", new Student("Liz"));
        students.put("miley23", new Student("Miley"));
        students.put("lilernie", new Student("Ernie"));

        students.get("sguedea").addGrade(90);
        students.get("sguedea").addGrade(85);
        students.get("sguedea").addGrade(80);

        students.get("lizb").addGrade(90);
        students.get("lizb").addGrade(85);
        students.get("lizb").addGrade(80);

        students.get("miley23").addGrade(90);
        students.get("miley23").addGrade(85);
        students.get("miley23").addGrade(80);

        students.get("lilernie").addGrade(90);
        students.get("lilernie").addGrade(85);
        students.get("lilernie").addGrade(80);


        System.out.println("Welcome!");
        System.out.println("Here are the github usernames of our students: \n");


        // list of usernames
        for (String k : students.keySet()) {
            System.out.format("|%s| ", k);
        }

        String student;
            do {

                System.out.println("\n\nWhat student would you like to see more information on? ");
                Scanner scanner = new Scanner(System.in);
                String userInput = scanner.next();

                if (userInput.equalsIgnoreCase("miley23")) {

                    System.out.print("Name: " + students.get(userInput).getName());
                    System.out.println(" - Github username: " + userInput);
                    System.out.println("Grade Average: " + students.get(userInput).getGradeAverage());

                } else if (userInput.equalsIgnoreCase("lilernie")) {

                    System.out.print("Name: " + students.get(userInput).getName());
                    System.out.println(" - Github username: " + userInput);
                    System.out.println("Grade Average: " + students.get(userInput).getGradeAverage());

                } else if (userInput.equalsIgnoreCase("lizb")) {

                    System.out.print("Name: " + students.get(userInput).getName());
                    System.out.println(" - Github username: " + userInput);
                    System.out.println("Grade Average: " + students.get(userInput).getGradeAverage());

                } else if (userInput.equalsIgnoreCase("sguedea")) {

                    System.out.print("Name: " + students.get(userInput).getName());
                    System.out.println(" - Github username: " + userInput);
                    System.out.println("Grade Average: " + students.get(userInput).getGradeAverage());

                } else {

                    System.out.println("Sorry, no student found with the gihub username of \"" + userInput + "\".");

                }

                System.out.println("Would you like to see another student?");
                student = scanner.next();

            } while (student.equalsIgnoreCase("y") || student.equalsIgnoreCase("yes"));

        System.out.println("Goodbye, and have a wonderful day!");
        }

//        System.out.println("Would you like to continue?");
//    grades = scanner.next();
//} while (grades.equalsIgnoreCase("yes"));
//        System.out.println("Have a great day!");
//
//        System.out.println(students.get("lizb").getName());
//        System.out.println(students.get("lizb").getGradeAverage());
//
//        System.out.println(students.get("miley23").getName());
//        System.out.println(students.get("miley23").getGradeAverage());
//
//        System.out.println(students.get("lilernie").getName());
//        System.out.println(students.get("lilernie").getGradeAverage());


}
