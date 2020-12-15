package abstractClassesInterfaces;

import java.util.ArrayList;
import java.util.List;

public class AustinMcD extends McBurgerShop{


    // NOT NEEDED ANY MORE AS IT EXTENDS MCBURGER SHOP WITH SAME VARIABLES
//    private List<String> menuItems;
//    private List<String> menuCategories;
//    private int seatingCapacity;
//    private int openTime;
//    private int closeTime;
//    private boolean iceCreamTime;

    // Constructor for the interface Austin
    public AustinMcD(List<String> menuItems, List<String> menuCategories, int seatingCapacity, int openTime, int closeTime, boolean iceCreamTime){
//        this.menuItems = menuItems;
//        this.menuCategories = menuCategories;
//        this.seatingCapacity = seatingCapacity;
//        this.openTime = openTime;
//        this.closeTime = closeTime;
//        this.iceCreamTime = iceCreamTime;

        // this super call () is instantiating an instance of all the listed properties but now available in THIS METHOD
        super(menuItems, menuCategories, seatingCapacity, openTime, closeTime, iceCreamTime);

    }



    //Overrides
    @Override
    public void broilStuff(String menuItem){
        System.out.println("The hipster kitchen just whipped up a " + menuItem);
    }
    @Override
    public void businessHours(int openTime, int closeTime){
        System.out.println("Our store is open from the lovely hours of " + openTime + " to " + closeTime);
    }
    @Override
    public String iceCreamMachineWorking(){
        if(super.iceCreamTime){
            return "Time for Organic Ice Cream!";
        } else {
            return "Sorry, no ice cream for you";
        }
    }


    // SETTERS AND GETTERS NOT NEEDED AS IT CAN USE SUPER
//    public List<String> getMenuItems() {
//        return menuItems;
//    }
//
//    public void setMenuItems(List<String> menuItems) {
//        this.menuItems = menuItems;
//    }
//
//    public List<String> getMenuCategories() {
//        return menuCategories;
//    }
//
//    public void setMenuCategories(List<String> menuCategories) {
//        this.menuCategories = menuCategories;
//    }
//
//    public int getSeatingCapacity() {
//        return seatingCapacity;
//    }
//
//    public void setSeatingCapacity(int seatingCapacity) {
//        this.seatingCapacity = seatingCapacity;
//    }
//
//    public int getOpenTime() {
//        return openTime;
//    }
//
//    public void setOpenTime(int openTime) {
//        this.openTime = openTime;
//    }
//
//    public int getCloseTime() {
//        return closeTime;
//    }
//
//    public void setCloseTime(int closeTime) {
//        this.closeTime = closeTime;
//    }
//
//    public boolean isIceCreamTime() {
//        return iceCreamTime;
//    }
//
//    public void setIceCreamTime(boolean iceCreamTime) {
//        this.iceCreamTime = iceCreamTime;
//    }

}
