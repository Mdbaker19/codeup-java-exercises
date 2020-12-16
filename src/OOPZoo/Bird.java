package OOPZoo;

public class Bird extends Animal{

    public Bird(int age, String gender, int weight){
        super(age, gender, weight);
    }

    @Override
    public void move(){
        System.out.println("Cutting through the air");
    }

    // taking this out of bird => not all birds can fly so flyable interface is created
//    public void fly(){
//        System.out.println("Flap, soar, flap, glide");
//    }

}
