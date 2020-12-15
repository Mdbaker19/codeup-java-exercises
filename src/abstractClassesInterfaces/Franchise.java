package abstractClassesInterfaces;

import java.util.ArrayList;
import java.util.List;

// I am declaring this to be an abstract class
// THE "CLASS" PART OF THIS , IT CAN STILL ACT AS A CLASS
public abstract class Franchise {

    //All the methods in a n abstract class are like a list of rules or requirements
    // for what needs to be implemented in any class that **extends** this abstract class

    // If we were to create a class that extends a Franchise
    // : => McDonald's on I-10 vs McDonald's on Loop 1604

    // Properties (constant values)
    // ABSTRACT CLASS CAN HAVE A PRIVATE VALUE
    // INTERFACES HAVE PUBLIC VALUES
    private final String companyName = "McDonald's";//this is always the same no matter where we
    // build this Franchise location
    private String managerName;

    // If we have enough properties to warrant a constructor - to set those values when
    // initializing this class - let's create that here
    public Franchise(String managerName){
        // we do not have to set companyName because it is already final
        this.managerName = managerName;
    }

    //Methods
    // abstract = have to write out this method WHEN you EXTEND/IMPLEMENT the abstract class / INTERFACE
    // WHEN THIS IS ABSTRACT IT IS A WRITTEN RULE THAT NEEDS TO BE FOLLOWED WHEN THIS CLASS IS EXTENDED(?)
    public abstract void broilStuff(String menuItem); // broilStuff("bigMac")

    // STATIC METHOD = NEED TO DEFINE IT FULLY, SO THAT WHEN YOU CALL IT ( FRANCHISE.BROIL STUFF() IT KNOWS WHAT TO DO)
    // NEEDS TO HAVE A METHOD BODY, ( NOT ABSTRACT ) ;
    public static void broilStuff(String menuItem, int ranNum){
        System.out.println("Static broil of " + menuItem);
    }

    // for example, 8am = 800, 10pm = 2200;
    public abstract void businessHours(int openTime, int closeTime);

    // non void method
    public abstract boolean iceCreamMachineWorking();

    // non abstract method
    public void greetCustomer(){
        // we have to write out method body, NOT an "abstract" method
        System.out.println("Welcome to " + this.companyName + ". Enjoy your meal");
    }
    public String getCompanyName(){
        return companyName; // can retrieve this from any class that extends this abstract class, even though it is declared private
    }

    // Static
    //double result = Math.pow(10, 2);
    // pow is static, have to instantiate(?) Math in order to use it

    // Non-Static
//    Math myCoolMathTool = new Math(); // can not do this on Math. has private access;

    public void setManagerName(String newManager){ this.managerName = newManager;}


}
