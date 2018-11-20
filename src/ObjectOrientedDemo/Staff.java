package ObjectOrientedDemo;

public class Staff {

    // fields
    private String nameOfStaff;
    private final int hourlyRate = 30;
    private int hoursWorked;

    // constructor
    public Staff(String name){
        nameOfStaff = name;
        System.out.println("\n" + nameOfStaff);
        System.out.println("----------------------------");
    }

    // constructor
    public Staff(String firstName, String lastName){
        nameOfStaff = firstName + " " + lastName;
        System.out.println("\n" + nameOfStaff);
        System.out.println("----------------------------");
    }

    // method
    public void printMessage(){
        System.out.println("Calculating Pay...");
    }

    // method
    public int calculatePay(){
        printMessage();

        int staffPay;
        staffPay = hoursWorked * hourlyRate;

        if (hoursWorked > 0) {
            return staffPay;

        } else {
            return -1;
        }
    }

    public int calculatePay(int bonus, int allowance) {
        printMessage();

        if (hoursWorked > 0) {
            return hoursWorked * hourlyRate + bonus + allowance;

        } else {
            return 0;
        }
    }

    // setter method
    public void setHoursWorked(int hours){
        if (hours > 0) {
            hoursWorked = hours;
        } else {
            System.out.println("Error: HoursWorked Cannot be Smaller than Zero");
            System.out.println("Error: HoursWorked is not updated");
        }
    }

    // get
    public int getHoursWorked(){
        return hoursWorked;
    }
}
