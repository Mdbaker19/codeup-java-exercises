package animals;

public class Animal {
    private int numberOfLegs;
    private String preferredClimate;

    public Animal(int legs, String climate){
        this.numberOfLegs = legs;
        this.preferredClimate = climate;
    }

    public String getAnimalInfo(){
        return "This animal has " + this.numberOfLegs + " Legs and prefers " + this.preferredClimate;
    }


    public String getPreferredClimate(){
        return this.preferredClimate;
    }
    public int getNumberOfLegs(){
        return this.numberOfLegs;
    }
    public void setNumberOfLegs(int legs){
        this.numberOfLegs = legs;
    }
    public void setPreferredClimate(String climate){
        this.preferredClimate = climate;
    }
}
