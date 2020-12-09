public class Person {


    public static void main(String[] args) {
        Person me = new Person("matt");
        System.out.println(me.getName());
        me.setName("matthew");
        System.out.println(me.name);
        me.sayHello();

    }



    private String name;

    public Person (String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public void sayHello(){
        System.out.println(this.name);
    }

}
