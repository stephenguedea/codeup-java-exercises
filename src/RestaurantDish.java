public class RestaurantDish {

    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;

    public RestaurantDish(int costInCents, String nameOfDish, boolean wouldRecommend) {
        this.costInCents = costInCents;
        this.nameOfDish = nameOfDish;
        this.wouldRecommend = wouldRecommend;
    }

    public int getCostInCents() {
        return this.costInCents;
    }

    public void setCostInCents(int costInCents) {
        this.costInCents = costInCents;
    }

    public String getNameOfDish(){
        return this.nameOfDish;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public boolean isWouldRecommend(){
        return this.wouldRecommend;
    }

    public void setWouldRecommend(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }

    public void eat() {

        System.out.println("\nNom nom nom!");
    }


}


//    Refactor your RestaurantDish and RestaurantTest classes...
// 1) Change your public properties in your RestaurantDish class to private
// 2) Add getters and setters for these properties (write them manually then erase them and use IntelliJ to do this quickly)
// 3) Refactor code used in RestaurantTest to set and print these property values...
//  ...to use your getters and setters
// 4) Add a constructor method to RestaurantDish that will assign property...
//  ...values based on arguments passed into the constructor