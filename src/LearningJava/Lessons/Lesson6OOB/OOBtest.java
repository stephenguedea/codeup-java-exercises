package LearningJava.Lessons.Lesson6OOB;

public class OOBtest {
    public static void main(String[] args) {
        Staff staff1 = new Staff("Stephen");
        staff1.setHoursWorked(160);
        int pay = staff1.calculatePay(1000, 400);
        System.out.println("Stephen's pay = " + pay);

        Staff staff2 = new Staff("Chente");
        staff2.setHoursWorked(160);
        pay = staff2.calculatePay();
        System.out.println("Chente's pay = " + pay);

//        DATA VALIDATION WITH SETTER METHODS
        System.out.println("\n\nUpdating Chente's Hours Worked to -10");
        staff2.setHoursWorked(-10);
        System.out.println("\nHours worked = " + staff2.getHoursWorked());
        pay = staff2.calculatePay();
        System.out.println("Chente's pay = " + pay);
    }
}
