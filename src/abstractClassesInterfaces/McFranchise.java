package abstractClassesInterfaces;

// Declaring this as an "interface"
// BY DEFAULT ALL VARIABLES ARE PUBLIC IN AN INTERFACE
public interface McFranchise {
    // Properties
    String companyName = "McDonald's"; //this string is a constant

    // Can not have a constructor in an "Interface"
    // (only in abstract classes)


    // Abstract Methods ( that we have to completely write out in any class that IMPLEMENTS this interface)
    public void broilStuff(String menuItem);
    public void businessHours(int openTime, int closeTime);
    public String iceCreamMachineWorking();

    // "PUBLIC" KEYWORD IS NOT NEEDED

}
