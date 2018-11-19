package shopping;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingList myList = new ShoppingList();
        int input = 0;

        do {
            System.out.println("");
            System.out.println("----- Shopping List -----");
            System.out.println("1) Add an item to the list.");
            System.out.println("2) Display list and total number of items.");
            System.out.println("3) Exit.");

            if (input == 1) {
                myList.addItem();
            } else if (input == 2) {
                myList.displayItem();
            }
        } while (input != 3);
    }
}
