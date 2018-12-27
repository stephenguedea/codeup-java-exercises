package LearningJava.Lessons.Lesson7OOBpart2;

import org.omg.CORBA.PUBLIC_MEMBER;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Member {

    // SIX FIELDS FOR THE MEMBER CLASS
    public String welcome = "Welcome to ABC Fitness";
    protected double annaulFee;
    private String name;
    private int memberID;
    private int memberSince;
    private int discount;

    // CONSTRUCTOR
    public Member(){
        System.out.println("Parent Constructor with no parameter");
    }

    // CONSTRUCTOR
    public Member(String pName, int pMemberID, int pMemberSince){
        System.out.println("Parent Constructor with 3 parameters");

        name = pName;
        memberID = pMemberID;
        memberSince = pMemberSince;

    }

    // SETTER / GETTER METHODS
    public double getDiscount(){
        return discount;
    }

    public void setDiscount(){
        Scanner input = new Scanner(System.in);
        String password;
        System.out.println("Please enter the admin password: ");
        password = input.nextLine();

        if(!password.equals("HookingItUp123")){
            System.out.println("Invalid password! You do not have authority to edit the discount.");
        } else {
            System.out.println("Please enter the discount: ");
            discount = input.nextInt();
        }
    }

    // METHOD
    public void displayMemberInfo() {
        System.out.println("Member Name: " + name);
        System.out.println("Member ID: " + memberID);
        System.out.println("Member Since: " + memberSince);
        System.out.println("Annual Fee: " + annaulFee);
    }

    // METHOD
    public void calculateAnnualFee(){
        annaulFee = 0;
    }
}
