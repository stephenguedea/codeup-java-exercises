package grades;

import java.util.ArrayList;
import java.util.Scanner;


// create a class named Student
public class Student {

    // have private properties for the student's name and grades
    // the grades property should be a list of integers
    private String studentName;
    private ArrayList<Integer> grades;


    // the student class should have a constructor that sets the name property,
    // and initializes the grades property as an empty list
    public Student (String studentName) {
        this.studentName = studentName;
        this.grades = new ArrayList<>();
    }

    // METHODS getName(), addGrade(), getGradeAverage()

        // returns the student's name
        public String getName() {
            return studentName;
        }

        // adds the given grade to the grades property
        public void addGrade(int grade){
           grades.add(grade);
        }

        // returns the average of the students grades
        public double getGradeAverage(){
            Integer sum = 0;
            if(!grades.isEmpty()){
                for(Integer grade : grades){
                    sum += grade;
                }
                return sum.doubleValue() / grades.size();
            }
            return sum;
        }

        // MAIN METHOD
    public static void main(String[] args) {
//        ArrayList<Integer> nums = new ArrayList<>();
        Student s = new Student("Stephen");
        s.addGrade(80);
        s.addGrade(90);
        s.addGrade(94);
        System.out.println("Student: " + s.getName() + "\nGrade Average: " +s.getGradeAverage());

        Student s1 = new Student("Liz");
        s1.addGrade(95);
        s1.addGrade(98);
        s1.addGrade(99);
        System.out.println("\nStudent: " + s1.getName() + "\nGrade Average: " +s1.getGradeAverage());






    }

}
