package abstractClassesInterfaces;

import java.util.ArrayList;
import java.util.List;

public class OnlyRunThings {

    // CAN HAVE THE MAIN, NOT REALLY NEEDED

    // THIS CAN BE RUN IN ANY FILE, IN THE SAME PACKAGE IT HAS ACCESS TO THE METHODS, CLASSES AND WHAT NOT
    public static void main(String[] args){
        // Let's try to access some of McBurgerShop's items / methods

        List<String> theseMenuItems = new ArrayList<>();
        theseMenuItems.add("BigMac");
        theseMenuItems.add("French Fries");
        theseMenuItems.add("Drink");
        List<String> theseCategories = new ArrayList<>();
        theseCategories.add("Entrees");
        theseCategories.add("Sides");
        theseCategories.add("Unhealthy");
        McBurgerShop mcDDallas = new McBurgerShop(theseMenuItems, theseCategories, 50, 500, 2300, true);
        mcDDallas.setIceCreamTime(false);
        System.out.println(mcDDallas.iceCreamMachineWorking());

        Franchise.broilStuff("Big mac", 43);//the static method belongs to the franchise, number is just to differentiate the methods in the Franchise abstract class

        for(String thisItem : mcDDallas.getMenuItems()){
//            System.out.println(thisItem);
            mcDDallas.broilStuff(thisItem);
        }
        System.out.println(" ");

        // Create an instance of AustinMcD, which implements methods SLIGHTLY different than mcBurgerShop
        AustinMcD austinMcD = new AustinMcD(theseMenuItems, theseCategories, 50, 500, 2300, true);
        System.out.println(austinMcD.iceCreamMachineWorking());
        for(String item : austinMcD.getMenuItems()){
            austinMcD.broilStuff(item);
        }

    }

}
