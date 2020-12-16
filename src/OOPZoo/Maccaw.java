package OOPZoo;

public class Maccaw extends Bird implements Flyable{

    public Maccaw(int age, String gender, int weight){
        super(age, gender, weight);
    }

    @Override
    public void fly(){
        System.out.println("Im am a Mccaw, hear me mccaw as i fly and mccccaaawwwww!!!!!!");
    }

}
