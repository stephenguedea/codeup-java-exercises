package LearningJava.Lessons.Lesson6OOB;

public class Staff {


    // FIELDS
    private String nameOfStaff;
    private final int hourlyRate = 30;
    // 'final' indicates that the value cannot be changed after it is created.
    private int hoursWorked;


    // METHOD
    public void printMessage(){
        System.out.println("Calculating Pay...");
    }
    // public = method is accessible everywhere in the program(not just within the Staff class)
    // void = method does not return any result
    // printMessage = name of the method stated.
    // () = where parameters can be included.

    // METHOD
    public int calculatePay(){
        printMessage(); // <- - - invoking or calling the printMessage() method

        int staffPay; // < - - declare a local variable
        staffPay = hoursWorked * hourlyRate; // < - - assigning the product

        if (hoursWorked > 0){
            return staffPay;
        } else {
            return -1;
        }
    }
    // int = this method returns a value that is of int type

    // METHOD
    public int calculatePay(int bonus, int allowance) {
        printMessage();
        if (hoursWorked > 0) {
            return hoursWorked * hourlyRate + bonus + allowance;
        } else {
            return 0;
        }
    }

    // SETTER
    public void setHoursWorked(int hours) {
        if (hours>0){
            hoursWorked = hours;
        } else {
            System.out.println("Error: HoursWorked Cannot be Smaller than Zero");
            System.out.println("Error: HoursWorked is not updated");
        }
    }

    // GETTER
    public int getHoursWorked(){
        return hoursWorked;
    }

    // CONSTRUCTOR
    public Staff(String name) {
        nameOfStaff = name;
        System.out.println("\n" + nameOfStaff);
        System.out.println("--------------------");
    }

    // ANOTHER CONSTRUCTOR BUT OVERLOADING (SAME SAME, DIFFERENT SIGNATURES)
    public Staff(String firstName, String lastName){
        nameOfStaff = firstName + " " + lastName;
        System.out.println("\n" + nameOfStaff);
        System.out.println("--------------------");
    }

}
