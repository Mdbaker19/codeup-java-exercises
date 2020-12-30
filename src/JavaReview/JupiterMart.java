package JavaReview;

import java.util.ArrayList;

public class JupiterMart {

    public static void main(String[] args) {

        Person me = new Person("matt", "baker");

        ArrayList<Product> cart = new ArrayList<>();

        Computer laptop = new Computer("first", true);
        Phone iphone = new Phone("new", 6.5);

        laptop.setPrice(199.99);
        iphone.setPrice(149.99);

        cart.add(laptop);
        cart.add(iphone);

        int idCounter = 0;
        for(Product item : cart){
            item.setId(idCounter);
            idCounter++;
        }

        me.ringItem(laptop);
        me.ringItem(iphone);

        System.out.println("Your total is: $" + me.askForMoney(cart));


    }
}