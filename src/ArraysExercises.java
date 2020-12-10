import java.util.Arrays;

public class ArraysExercises {
    private String name;

    public void Person(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("matt");
        people[1] = new Person("nemo");
        people[2] = new Person("mandy");

        Person fourth = new Person("sabear");
        people = (Person[]) addPerson(people, fourth);
        for(int i = 0; i < people.length; i++){
            System.out.println(people[i].getName());
        }


    }

    public static Object addPerson(Object[] p, Object obj){
        Object[] editedPeople = Arrays.copyOf(p, p.length + 1);
        Arrays.fill(editedPeople, p.length, p.length + 1, obj);
        return editedPeople;
    }

}
