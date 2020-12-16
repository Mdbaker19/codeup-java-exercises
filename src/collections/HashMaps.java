package collections;

import java.util.HashMap;

public class HashMaps {
    //HASH MAPS => USERNAMES AND PASSWORDS UNIQUE VALUES FOR THE KEY USERNAMES
    public static void main(String[] args) {
        // We'll start by defining a hash map
        HashMap<String, String> usernames = new HashMap<>();

        // and putting some data into it

        //======HASH MAP PUT 'PUTS' IT IN AT ANY RANDOM SPOT
        // DIFFERENCE BETWEEN A MAP AND A COLLECTION => MAP IS RANDOM NOTHING IS IN ORDER, JUST CONTAINS UNIQUE KEY/VALUES

        usernames.put("Ryan", "ryanorsinger");
        usernames.put("Zach", "zgulde");
        usernames.put("Fernando", "fmendozaro");
        usernames.put("Justin", "jreich5");

        System.out.println(usernames);
        // TODO: Add more key-value pairs to usernames
        usernames.put("Matt", "Mdbaker19");
        usernames.put("Mat", "");
        usernames.put("Mtt", "Mdbaker");
        System.out.println(usernames.get("Mat"));
        // THE "" EMPTY STRING VALUE IS STILL A VALUE

        // obtaining values from the hash map by key
        // TODO: Get the value stored in key "Ryan"
        System.out.println(usernames.get("Ryan"));
        // TODO: Get the value stored in key "Phillip". What is the result?
        System.out.println(usernames.get("Phillip"));
        System.out.println(usernames.getOrDefault("Phillip", "was not in there"));
        System.out.println(usernames.getOrDefault("Jason", "gocodeup"));

        // checking if keys or values are present
        // TODO: Check if key "Justin" exists in the HashMap
        System.out.println(usernames.containsKey("justin"));
        // TODO: Check if the value "fmendozaro"
        System.out.println(usernames.containsValue("fmendozaro"));

        usernames.put("Ryan", "ryanorsinger");
//        usernames.putIfAbsent("Ryan", "ryanorsinger");

        System.out.println("no additional ryan was added " + usernames); // {Ryan=ryanorsinger}

        usernames.put("Ryan", "newUNforRyan");
        System.out.println("overwrite the previous Ryan " + usernames);// PUT IF ABSENT IS BEST PRACTICE HERE

        usernames.putIfAbsent("Zach", "zgulde");
        usernames.putIfAbsent("Zach", "coderdude24");
        System.out.println(usernames); // {Ryan=ryanorsinger, Zach=zgulde}

        // TODO: Remove key "Zach" and the value associated with it
        usernames.remove("Zach", "zgulde");
        System.out.println("Zach gone now " + usernames); // {Ryan=ryanorsinger}

        // TODO: Replace Ryan's username with "torvalds"
        usernames.replace("Ryan", "torvalds");
        System.out.println("Ryan UN changed to new value " + usernames); // {Ryan=torvalds}

        usernames.clear();
        System.out.println(usernames);
        System.out.println(usernames.isEmpty());
    }
}