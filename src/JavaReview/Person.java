package JavaReview;

import java.util.ArrayList;

public class Person {

    private String firstName;
    private String lastName;

    public Person(String f, String l){
        this.firstName = f;
        this.lastName = l;
    }

    public void ringItem(Product item){
        System.out.println("ID # " + item.getId() + " cost " + item.getPrice());
    }

    public double askForMoney(ArrayList<Product> cart){
        double total = 0;
        for(Product item : cart){
            total += item.getPrice();
        }
        return total;
    }


}
