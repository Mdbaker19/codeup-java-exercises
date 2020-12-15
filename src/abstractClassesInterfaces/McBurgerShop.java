package abstractClassesInterfaces;

import java.util.ArrayList;
import java.util.List;

public class McBurgerShop implements McFranchise{

    // Properties
    // COPIED FROM BURGER SHOP
    // can have more properties here than are declared in the abstract class

    // changing these to protected to allow the child AustinMcD to have access to these variables as it extends this class
    protected List<String> menuItems;
    protected List<String> menuCategories;
    protected int seatingCapacity;
    protected int openTime;
    protected int closeTime;
    protected boolean iceCreamTime;

    // Constructor for the interface McBurgerShop
    public McBurgerShop(List<String> menuItems, List<String> menuCategories, int seatingCapacity, int openTime, int closeTime, boolean iceCreamTime){
        this.menuItems = menuItems;
        this.menuCategories = menuCategories;
        this.seatingCapacity = seatingCapacity;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.iceCreamTime = iceCreamTime;
    }


//    // THIS CAN BE RUN IN ANY FILE, IN THE SAME PACKAGE IT HAS ACCESS TO THE METHODS, CLASSES AND WHAT NOT
//    public static void main(String[] args){
//        // Let's try to access some of McBurgerShop's items / methods
//
//        List<String> theseMenuItems = new ArrayList<>();
//        theseMenuItems.add("BigMac");
//        theseMenuItems.add("French Fries");
//        theseMenuItems.add("Drink");
//        List<String> theseCategories = new ArrayList<>();
//        theseCategories.add("Entrees");
//        theseCategories.add("Sides");
//        theseCategories.add("Unhealthy");
//        McBurgerShop mcDDallas = new McBurgerShop(theseMenuItems, theseCategories, 50, 500, 2300, true);
//        mcDDallas.setIceCreamTime(false);
//        System.out.println(mcDDallas.iceCreamMachineWorking());
//
//        Franchise.broilStuff("Big mac", 43);//the static method belongs to the franchise, number is just to differentiate the methods in the Franchise abstract class
//
//        for(String thisItem : mcDDallas.getMenuItems()){
////            System.out.println(thisItem);
//            mcDDallas.broilStuff(thisItem);
//        }
//        System.out.println(" ");
//
//        // Create an instance of AustinMcD, which implements methods SLIGHTLY different than mcBurgerShop
//        AustinMcD austinMcD = new AustinMcD(theseMenuItems, theseCategories, 50, 500, 2300, true);
//        System.out.println(austinMcD.iceCreamMachineWorking());
//        for(String item : austinMcD.getMenuItems()){
//            austinMcD.broilStuff(item);
//        }
//
//    }



    // Overrides
    @Override
    public void broilStuff(String menuItem){
        System.out.println("The kitchen just finished cooking " + menuItem);
    }
    @Override
    public void businessHours(int openTime, int closeTime){
        System.out.println("We are open from " + openTime + " to " + closeTime);
    }
    @Override
    public String iceCreamMachineWorking(){
        if(this.iceCreamTime){
            return "You can have your Ice Cream!";
        } else {
            return "Sorry, no ice cream today";
        }
    }

    // Getters and Setters


    public List<String> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<String> menuItems) {
        this.menuItems = menuItems;
    }

    public List<String> getMenuCategories() {
        return menuCategories;
    }

    public void setMenuCategories(List<String> menuCategories) {
        this.menuCategories = menuCategories;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public int getOpenTime() {
        return openTime;
    }

    public void setOpenTime(int openTime) {
        this.openTime = openTime;
    }

    public int getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(int closeTime) {
        this.closeTime = closeTime;
    }

    public boolean isIceCreamTime() {
        return iceCreamTime;
    }

    public void setIceCreamTime(boolean iceCreamTime) {
        this.iceCreamTime = iceCreamTime;
    }
}
