public class BurgerTester {
    public static void main(String[] args) {
//        tools.mostPopularTopping = "Pepperjack Cheese";
//        tools.averageDaysBeforeExpiration = 28;
//        tools.temperatureWhenCooked = 50;

        System.out.println(BurgerTools.mostPopularTopping);
        System.out.println(BurgerTools.averageDaysBeforeExpiration);
        System.out.println(BurgerTools.temperatureWhenCooked);
        BurgerTools.grill();

    }
}
