package Dishes;

public class DishTest extends DishTools{
    public static void main(String[] args) {

        Dish dish1 = new Dish();
        double dishCost = dish1.getCost();
        dish1.setCost(899);//makes it less expensive than average
        dish1.setNewName("Steak");
        boolean currDishRecStatus = dish1.getRecommend();
        dish1.setWouldRecommend(false);//change to false

        dish1.printSummary();

        DishTools.shoutDishName(dish1);
        DishTools.analyzeDishCost(dish1);
        System.out.println(DishTools.flipRecommendation(dish1));
    }
}