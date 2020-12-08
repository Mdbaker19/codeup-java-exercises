package Dishes;

public class DishTools {

    public static final int Average_Cost_Of_Dish_In_Cents = 1300;


    public static void shoutDishName(Dish dish){
        System.out.println(dish.getNameOfDish().toUpperCase());
    }

    public static void analyzeDishCost(Dish dish){
        int currCost = dish.getCost();
        if(currCost > Average_Cost_Of_Dish_In_Cents){
            System.out.println("More expensive than average");
        } else {
            System.out.println("Less expensive than average");
        }
    }

    public static boolean flipRecommendation(Dish dish){
        return !dish.getRecommend();
    }



}
