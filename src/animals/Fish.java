package animals;

public class Fish extends Animal{

    private String action;

    public Fish(String action){
        super(0, "Water");
        this.action = action;
    }

    public String getAnimalInfo(){
        return super.getAnimalInfo() + " and can " + this.action;
    }

}
