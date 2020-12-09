package util;

import java.util.Scanner;

public class Input {

    private Scanner sc = new Scanner(System.in);

    public String getString(){
        System.out.println("Enter some text");
        return sc.next();
    }

    public boolean yesNo(){
        System.out.println("Enter [y], [Y], [yes] or [Yes]");
        return (sc.next().equalsIgnoreCase("Y") || sc.next().equalsIgnoreCase("yes"));
    }

    public int getInt(int min, int max){
        int currInput = getInt();
        if(currInput > max || currInput < min){
            System.out.println("Not within range");
            return getInt(min, max);
        }
        System.out.println("Valid");
        return currInput;
    }

    public int getInt(){
        System.out.println("Enter a number");
        return sc.nextInt();
    }

    public double getDouble(double min, double max){
        double currDouble = getDouble();
        if(currDouble > max || currDouble < min){
            System.out.println("Not within range");
            return getDouble(min, max);
        }
        System.out.println("Valid");
        return currDouble;
    }

    public double getDouble(){
        System.out.println("Enter a number of type double");
        return sc.nextDouble();
    }



}