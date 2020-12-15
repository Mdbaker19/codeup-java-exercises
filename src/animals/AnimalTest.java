package animals;

public class AnimalTest {
    public static void main(String[] args) {
        Animal dog = new Dog("Bark");
        displayAnimalDetails(dog);

        Animal fish = new Fish("Swim");
        displayAnimalDetails(fish);

        Animal cat = new Cat(100);
        displayAnimalDetails(cat);
    }
    public static void displayAnimalDetails(Animal a){
        System.out.println(a.getAnimalInfo());
    }
}
