public class DishTest {
    public static void main(String[] args) {

        Dish dish1 = new Dish();
        dish1.costInCents = 7.99;
        dish1.nameOfDish = "Sirloin Steak";
        dish1.wouldRecommend = true;

        dish1.printSummary();

    }
}