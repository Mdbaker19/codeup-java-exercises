package groceries;
import util.Input;
import java.util.*;

public class GroceryApplication {

    public static void main(String[] args) {

        Input sc = new Input();

        ArrayList<String> groceryCategories = new ArrayList<>(Arrays.asList("Produce", "Meat", "Grains", "Sauce", "Liquid"));
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Grocery> cart = new ArrayList<>();

        HashMap<String, Grocery> betterList = new HashMap<>();

        boolean keepAdding = true;

        if(sc.yesNo("Would you like to create a grocery list?")){
            String[] item = new String[2];

            int catChoice = sc.getInt(0, 4, "To add an item, choose a category [0] Produce, [1] Meat, [2] Grains, [3] Sauce, [4] Liquid");

            String itemName = sc.getString("What is it that you would like to add??");
            Integer quantity = sc.getInt("How many of this item are you planning to buy??");
            Grocery newItem = new Grocery(itemName, groceryCategories.get(catChoice), quantity);

            cart.add(newItem);

            item[0] = newItem.getItemName();
            item[1] = String.valueOf(newItem.getCount());

            betterList.put(newItem.getItemName(), newItem);
            list.add(Arrays.toString(item));

        } else {
            keepAdding = false;
        }

        while(keepAdding){

            String[] item = new String[2];
            System.out.println("Would you like to continue adding items???");



            if(!sc.yesNo()){
                System.out.println(" ");
                System.out.println(" ");

                Set<String> categories = betterList.keySet();

                System.out.println("Okay, here is your list");
                keepAdding = false;
                Collections.sort(list);
                System.out.println(list);

                System.out.println(" ");

                ArrayList<String> itemsInCategory = new ArrayList<>();
                for(String category : categories){
                    itemsInCategory.add(betterList.get(category).getItemName());
                }

                for(String specificItem : itemsInCategory){
                    System.out.println(betterList.get(specificItem).getCategory() + ":");
                    for(String nextLevelItem : itemsInCategory) {
                        if(betterList.get(specificItem).getCategory().equalsIgnoreCase(betterList.get(nextLevelItem).getCategory())) {
                            System.out.println(betterList.get(nextLevelItem).getItemName());
                        }
                    }
                    System.out.println("----------");
                }

                System.out.println(" ");

                System.out.println("your cart includes: " +categories);

                String catChoice = sc.getString("What category would you like to view?");

                for(Grocery listItem : cart){
                    if(listItem.getCategory().equalsIgnoreCase(catChoice)){
                        System.out.printf("You have a %dx %s%n", listItem.getCount(), listItem.getItemName());
                    }
                }

                boolean mistake = sc.yesNo("Is there something that does not look right?");;

                while(mistake){

                    String itemChange = sc.getString("What do you need to remove?");

                    if(betterList.get(itemChange) != null) {
                        betterList.remove(itemChange);
                    } else {
                        System.out.println("Think you made a typo there, not in the list");
                    }
                    System.out.println(betterList.get(itemChange) + " was removed");

                    mistake = sc.yesNo("Is there something that does not look right?");
                }
                System.out.println("final list includes : " + betterList.entrySet());
                System.out.println("Have a nice day");


                //===================================================//















            } else {
                int catChoice = sc.getInt(0, 4, "To add an item, choose a category [0] Produce, [1] Meat, [2] Grains, [3] Sauce, [4] Liquid");
                String itemName = sc.getString("What is it that you would like to add??");
                Integer quantity = sc.getInt("How many of this item are you planning to buy??");
                Grocery newItem = new Grocery(itemName, groceryCategories.get(catChoice), quantity);

                cart.add(newItem);

                item[0] = newItem.getItemName();
                item[1] = String.valueOf(newItem.getCount());

                list.add(Arrays.toString(item));

                betterList.put(newItem.getItemName(), newItem);
            }
        }
    }
}