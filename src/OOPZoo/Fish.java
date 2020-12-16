package OOPZoo;

public class Fish extends Animal{

    public Fish(int age, String gender, int weightInLbs){
        super(age, gender, weightInLbs);
    }

    public void swim(){
        System.out.println("Swim swim as fast as I can");
    }

    @Override
    public void move(){
        System.out.println("Through the water");
    }


}
