package animals;

public class Dog extends Animal{

    private String sound;

    public Dog(String sound){
        super(4, "house");
        this.sound = sound;
    }

    public String getAnimalInfo(){
        return super.getAnimalInfo() + " and can " + this.sound;
    }

}
