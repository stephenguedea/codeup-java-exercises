package LearningJava.Lessons.Lesson11JavaProject;

import util.Input;

import javax.sound.midi.Soundbank;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class MembershipManagement {

    final private Scanner sc = new Scanner(System.in);

    private int getIntInput() {
        int choice = 0;

        while (choice == 0) {
            try {
                // code to try reading an integer from the user
                choice = sc.nextInt();
                if (choice == 0) {
                    throw new InputMismatchException();
                }
                sc.nextLine();
            } catch (InputMismatchException e) {
                // code to prompt the user to enter a new value
                sc.nextLine();
                System.out.println("\nERROR: INVALID INPUT. Please try again: ");
            }
        }
        return choice;
    }

    private void printClubOptions(){
        System.out.println("1) Club Mercury");
        System.out.println("2) Club Neptune");
        System.out.println("3) Club Jupiter");
        System.out.println("4) Multi Clubs");
    }


    public int getChoice() {
        int choice;
        String menu = "WELCOME TO OZONE FITNESS CENTER " +
                     "\n**************************************" +
                     "\n* Available options                  *" +
                     "\n*                                    *" +
                     "\n* 1) Add Member                      *" +
                     "\n* 2) Remove Member                   *" +
                     "\n* 3) Display Member Information      *" +
                     "\n**************************************" +
                "\n\nPlease select an option (or Enter -1 to quit): ";
        System.out.println(menu);
        choice = getIntInput();
        return choice;
    }

    public String addMembers(LinkedList<Member> m){
        String name;
        int club;
        String mem;
        double fees;
        int memberID;
        Member mbr;
        Calculator<Integer> cal;

        // MEMBER'S NAME
        System.out.println("Enter member's name: ");
        name = sc.nextLine();

        // MEMBER'S CLUBID
        printClubOptions();
        System.out.println("Enter member's clubID: ");
        club = getIntInput();
        while (club < 1 || club > 4) {
            System.out.println("INVALID clubID! Please try again: ");
            club = getIntInput();
        }

        // MEMBER'S MEMBERID
        if (m.size() > 0) {
            memberID = m.getLast().getMemberID() + 1;
        } else {
            memberID = 1;
        }

        // ADDING MEMBER TO LINKEDLIST m
        if (club != 4) {
            // add a single club member
            cal = (n)-> {
                switch (n) {
                    case 1:
                        return 900;
                    case 2:
                        return 950;
                    case 3:
                        return 1000;
                        default:
                            return -1;
                }
            };
            // calculate the membership fee of a single club member
            fees = cal.calculateFees(club);

            // instantiate a new SingleClubMember
            mbr = new SingleClubMember('S', memberID, name, fees, club);
            m.add(mbr);
            mem = mbr.toString();
            System.out.println("**************************************");
            System.out.println("STATUS: Single Club Member added!\nMember Name: " + name + "\nMember ID: " + memberID);
            System.out.println("**************************************\n\n\n");


            // add a multi club member
        } else {
            // add a multi club member
            cal = (n)-> {

                    if (n == 4){
                        return 1200;
                    } else {
                        return -1;
                    }

            };
            // calculate the membership fee of a multi club member
            fees = cal.calculateFees(club);

            // instantiate a new SingleClubMember
            mbr = new MulitClubMember('M', memberID, name, fees, 100);
            m.add(mbr);
            mem = mbr.toString();
            System.out.println("**************************************");
            System.out.println("STATUS: MultiClub Member added!\nMember Name: " + name + "\nMember ID: " + memberID);
            System.out.println("**************************************\n\n\n");

        }
        return mem;
    }

    public void removeMember(LinkedList<Member> m) {
        int memberID;
        System.out.println("Enter the MemberID to remove: ");
        memberID = getIntInput();

        for (int i = 0; i < m.size(); i++) {
            if (m.get(i).getMemberID() == memberID) {
                m.remove(i);
                System.out.println("**************************************");
                System.out.println("* Member removed!                    *");
                System.out.println("**************************************\n\n\n");

                return;
            }
        }
        System.out.println("**************************************");
        System.out.println("* Member not found                   *");
        System.out.println("**************************************\n\n\n");

    }

    public void printMemberInfo(LinkedList<Member> m){
        int memberID;
        System.out.println("Enter the MemberID to display: ");
        memberID = getIntInput();
        for (int i = 0; i < m.size(); i++) {
            if (m.get(i).getMemberID() == memberID) {
                String[] memberInfo = m.get(i).toString().split(", ");
                System.out.println("**************************************");
                System.out.println("Member Type: " + memberInfo[0]);
                System.out.println("Member ID: " + memberInfo[1]);
                System.out.println("Member Name: " + memberInfo[2]);
                System.out.println("Membership Fees: " + memberInfo[3]);
                if (memberInfo[0].equalsIgnoreCase("s")) {
                    System.out.println("Club ID: " + memberInfo[4]);
                    System.out.println("**************************************\n\n");

                } else {
                    System.out.println("Membership Points: " + memberInfo[4]);
                    System.out.println("**************************************\n\n");

                }
                return;
            }
        }
        System.out.println("Member ID not found");
    }
}
