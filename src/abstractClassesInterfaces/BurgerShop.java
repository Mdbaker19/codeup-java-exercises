package abstractClassesInterfaces;

// BurgerShop will be the "San Antonio" installation of a "Franchise"

import java.util.ArrayList;
import java.util.List;

public class BurgerShop extends Franchise{

    // This will be an ACTUAL McDonald's store
    // has to follow all the "rules" set in the abstract Class "Franchise"

    // can have more properties here than are declared in the abstract class

    private List<String> menuItems;
    private List<String> menuCategories;
    private int seatingCapacity;
    private int openTime;
    private int closeTime;
    private boolean iceCreamTime;


    //Constructor
    public BurgerShop(String managerName, List<String> menuItems, List<String>menuCategories, int seatingCapacity, int openTime, int closeTime, boolean iceCreamTime){
        // managerName is in the superClass(Franchise)
        // initialize an instance of the Franchise class
        super(managerName);
        this.menuItems = menuItems;
        this.menuCategories = menuCategories;
        this.seatingCapacity = seatingCapacity;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.iceCreamTime = iceCreamTime;
    }




    // Override the methods that have to be written, per the "Franchise" abstract class
    @Override
    public void broilStuff(String menuItem){
        System.out.println("The kitchen just cooked up a lovely " + menuItem);
    }
    @Override
    public void businessHours(int open, int close){
        System.out.println("We are open from "+open+" to "+close);
    }
    @Override
    public boolean iceCreamMachineWorking(){
        // This _could_ just be replaced by a getter, but if we wanted to make it more complex, we could also
        // chek if the store is open first and not closed, THEN return true/false;
        if(this.openTime > 100) {
            return this.iceCreamTime;
        }
        return false;
    }


    //Getters and Setters


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

    public static void main(String[] args) {
        List<String> theseMenuItems = new ArrayList<>();
        theseMenuItems.add("BigMac");
        theseMenuItems.add("FrenchFries");
        List<String> theseCategories = new ArrayList<>();
        theseCategories.add("Entrees");
        theseCategories.add("Sides");
        BurgerShop mcDSanAntonio = new BurgerShop("Me", theseMenuItems, theseCategories, 50, 500, 2300, true);
        mcDSanAntonio.setManagerName("Matt");
        mcDSanAntonio.setIceCreamTime(false);
        mcDSanAntonio.greetCustomer();
        System.out.println(mcDSanAntonio.getMenuItems());
    }
}
