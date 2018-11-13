public class RestaurantTest {
    public static void main(String[] args) {
        RestaurantDish dish = new RestaurantDish(1000, "Sally Salad", true);
//        dish.costInCents = 1095;
//        dish.nameOfDish = "Stevie's Burger";
//        dish.wouldRecommend = true;
//
//        System.out.println(dish.costInCents);
//        System.out.println(dish.nameOfDish);
//        System.out.println(dish.wouldRecommend);
//        dish.eat();
//        dish.changeCostInCents(1100);
        System.out.println(dish.getCostInCents());
        System.out.println(dish.getNameOfDish());
        System.out.println(dish.isWouldRecommend());
        dish.eat();
    }
    }


