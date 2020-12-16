package OOPZoo;

import javax.crypto.Mac;

public class Zoo {

    public static void main(String[] args) {

//        Animal seal = new Animal(2, "Male", 55);
        Animal seal = new Penguin(2, "Male", 55);
        // can not use the penguin methods, only the "Animal methods"

//        seal.sleep();
//        seal.eat();

        Fish trout = new Fish(3, "Female", 6);
        trout.sleep();
        trout.eat();
        trout.swim();
        trout.move();

        Bird robin = new Bird(7, "Female", 4);
        robin.sleep();

        Penguin flappy = new Penguin(1, "Male", 11);
        flappy.eat();
        flappy.move();

        Maccaw bigOne = new Maccaw(10, "Male", 122);
        bigOne.fly();
        bigOne.eat();
        bigOne.sleep();

    }
}