package shopping;

public class ShoppingItem {
    private String itemName;
    private double itemPrice;
    private int itemQty;

    public ShoppingItem()
    {
        itemName = "Fruit";
        itemPrice = 100;
        itemQty = 1;
    }

    public ShoppingItem(String itemName, double itemPrice, int itemQty){
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQty = itemQty;
    }

    public String getItemName(){
        return itemName;
    }

    public double getItemPrice(){
        return itemPrice;
    }

    public int getItemQty(){
        return itemQty;
    }

    public void setItemName(String itemName){
        this.itemName = itemName;
    }

    public void setItemPrice(double itemPrice){
        this.itemPrice = itemPrice;
    }

    public void setItemQty(int itemQty){
        this.itemQty = itemQty;
    }
}
