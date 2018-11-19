package shopping;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    ArrayList<ShoppingItem> list = new ArrayList<>();

    // Add a new ShoppingItem to the list
    public void addItem(){
        System.out.println();
        System.out.println("Enter name of your item: ");
        Scanner scanner = new Scanner(System.in);
        String itemName = scanner.nextLine();

        System.out.println("Enter the price of the item: ");
        double itemPrice = scanner.nextDouble();

        System.out.println("Enter the quantity: ");
        int itemQty = scanner.nextInt();

        ShoppingItem Item = new ShoppingItem(itemName, itemPrice, itemQty);
        list.add(Item);
        System.out.println("Item Added!");
    }

    // DISPLAY LIST AND TOTAL NUMBER OF ITEMS
    public void displayItem(){
        System.out.println( list.size()+ " items. ");
        for(ShoppingItem i : list){
            System.out.println(i.toString());
        }
    }
}
