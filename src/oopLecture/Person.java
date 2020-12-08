package oopLecture;

public class Person {

    //        // SLIDE 3
    public String firstName;
    public String lastName = "Smith";
    public char age;

    public static String findLongestName(Person p1, Person p2){
        if(p1.name.length() > p2.name.length()){
            return p1.name;
        }
        return p2.name;
    }



    // SLIDE 4

//        // instance variables
//        public String firstName;
//        public String lastName;
//
//        // instance method
        public String sayHello() {
                return lastName + ", " + firstName + " says hi!";
        }

        public void sayName(){
            System.out.println("my name is: " + name);
        }


    // SLIDE 7
        public static long worldPopulation = 7_500_000_000L; // class property
        public String name;                                  // instance property

        public static void main(String[] args) {

//                System.out.println(Person.worldPopulation);
//                Person.worldPopulation -= 1;
//                System.out.println(worldPopulation);


                Person theBestDrummerAlive = new Person();
//                System.out.println(theBestDrummerAlive.name);//==> this is what returns null until defined not Person.name. person.name is not a static method to person
                theBestDrummerAlive.name = "Neil Peart";
                theBestDrummerAlive.sayName();
                Person notDrummer = new Person();
                notDrummer.name = "Justin";
                String longest = Person.findLongestName(theBestDrummerAlive, notDrummer);
                System.out.println(longest);
                Person.worldPopulation += 1; // accessing a static property
                // this also works, but is usually not a good idea
                System.out.println(theBestDrummerAlive.worldPopulation); // 7500000001
                // DONT DO THIS, it will not compile
//                 System.out.println(Person.name);
        }

}