package OOPZoo;

public abstract class Animal {

    public Animal(int age, String gender, int weight){
        this.age = age;
        this.gender = gender;
        this.weightInLbs = weight;
    }

    // shared properties
    protected int age;

    protected String gender;

    protected int weightInLbs;

    //methods
    public void eat(){
        System.out.println("Eating..nom..crunch...chew      chew       chew       chew... I am tired");
    }
    public void sleep(){
        System.out.println("Sleeping..zzzzz.......zzzzzz...... I am hungry");
    }

    abstract void move();
}