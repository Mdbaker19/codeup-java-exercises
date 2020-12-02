public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");

        int myFavoriteNumber = 20;
        String myString = "matt";
//        myString = 'm';
//        myString = 3.14159;
        System.out.println(myString);
        System.out.println(myFavoriteNumber);

//        long myNumber;
        float myNumber;
        myNumber = 3.14F;//requires the F
        // decimal does not work to long due to it explicitly being a decimal number requiring float or double
//        myNumber = 123L;
//        myNumber = 123;
        System.out.println(myNumber);


//        int x = 5;
//        System.out.println(x++);//increments after sout for 5
//        System.out.println(x);// the new 6 from the increment


//        int x = 5;
//        System.out.println(++x);// increment before sout
//        System.out.println(x);// new number from increment


//        class name = "matt";//error { expected


//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        System.out.println(o);
//        int three = (int) o;// run time error with changing from string to integer will compile

//        int three = (int) "three";
//        System.out.println(three);// incompatible types


        int x = 4;
        x += 5;
//        System.out.println(x);

        int a = 3;
        int y = 4;
        y *= a;
//        System.out.println(y);


        int z = 10;
        int b = 2;
        char m = ' ';
//        z/=b;
//        b-=z;
        System.out.println(z + " " + b);
//        System.out.print(m);
//        System.out.println(b);

        int max = Integer.MAX_VALUE;

        System.out.println(max);


//
//        public class HelloWorld {
//
//            public static void main(String[] args) {
//        // ============================ SYNTAX, TYPES, VARIABLES EXERCISE
//
//        // Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
//             int myFavoriteNumber = 7;
//             System.out.println(myFavoriteNumber);
//
//        // Create a String variable named myString and assign a string value to it, then print the variable out to the console.
//             String myString = "Hello";
//             System.out.println(myString);
//
//        // Change your code to assign a character value to myString. What do you notice?
//             myString = 'h'; // ERROR
//             System.out.println(myString);
//
//        // Change your code to assign the value 3.14159 to myString. What happens?
//             myString = 3.14159; // ERROR
//
//        // Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
//              long myNumber;

//        // Change your code to assign the value 3.14 to myNumber. What do you notice?
//             myNumber = 3.14; // ERROR
//
//        // Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
//             myNumber = 123L;
//
//        // Change your code to assign the value 123 to myNumber.
//             myNumber = 123;
//
//        // Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
////             Longs can only hold integers
//
//        // Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
//             float myNumber = 3.14F; // ERROR
//            // use F after the number or explicit casting
//
//
//        // Copy and paste the following code blocks one at a time and execute them

//             int x = 5;
//             System.out.println(x++);
//             System.out.println(x);
//
//             int x = 5;
//             System.out.println(++x);
//             System.out.println(x);
//
//
//        // What is the difference between the above code blocks? Explain why the code outputs what it does.
//
////             the difference between pre and post increment
//
//        // Try to create a variable named class. What happens?
//
//            // ERROR unexpected identifier

//        Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?

//            String theNumberThree = "three";
//            Object o = theNumberThree;
//            int three = (int) o;
                // error caught at runtime

//        How is the above example different from the code block below?
//            int three = (int) "three"; // error caught during compilation
//
//        // Rewrite the following expressions using the relevant shorthand assignment operators:
//
//             int x = 4;
//             x += 5;
//
//             int x = 3;
//             int y = 4;
//             y *= x;
//
//             int x = 10;
//             int y = 2;
//             x /= y;
//             y -= x;


//
//            }
//
//        }
    }
}