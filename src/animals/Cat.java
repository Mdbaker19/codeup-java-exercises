package animals;

public class Cat extends Animal{

    private int speed;

    public Cat(int speed){
        super(4, "house");
        this.speed = speed;
    }

    public String getAnimalInfo(){
        return super.getAnimalInfo() + " and can run " + this.speed + " mph";
    }

}
