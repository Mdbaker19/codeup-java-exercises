package util;

import java.util.Scanner;

public class Input {

    private Scanner sc;

    public Input(){
        this.sc = new Scanner (System.in);
    }

    public String getString(){
        return sc.next();
    }
    public String getString(String input){
        System.out.println(input);
        System.out.println("Enter text");
        return sc.next();
    }



    public boolean yesNo(){
        System.out.print("Enter [y], [Y], [yes] or [Yes]");
        return (sc.next().trim().equalsIgnoreCase("Y") || sc.next().trim().equalsIgnoreCase("yes"));
    }
    public boolean yesNo(String input){
        System.out.print(input);
        return (sc.next().trim().equalsIgnoreCase("Y") || sc.next().trim().equalsIgnoreCase("yes"));
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
    public int getInt(int min, int max, String input){
        System.out.println(input);
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

    public int getInt(String prompt){
        System.out.println(prompt);
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
    public double getDouble(double min, double max, String input){
        System.out.println(input);
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
