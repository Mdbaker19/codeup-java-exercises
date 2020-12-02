import java.util.Scanner;

public class ConsoleIoLecture{

    public static void main(String[] args) {
        /* ***************************************
                    print() and println()
         ****************************************/

// >> this:
//        System.out.println("here");
//        System.out.println("there");

// >> is equivalent to this:
//        System.out.print("here2\n");
//        System.out.print("there2\n");


// >> without the newline characters, print outputs this:
//        System.out.print("here");
//        System.out.print("there");


// >> to concatenate, just like JS:
//        System.out.println("Hello" + " " + "World");


        /* ***************************************
                    printf()/.format
        ****************************************/

        //TODO TOGETHER: Print a formatted string using the following... printf(formatString, data)
//        System.out.printf("hello%n");//%n adds the new line to printf
//        System.out.print("World");



        //TODO TOGETHER:
        // (1) Create a string variable
        // (2) print using printf() with placeholder %s
        String codeUp = "CodeUp Class";
//        System.out.printf("We are in %s. %n", codeUp);// normal s
        System.out.printf("We are in %S. %n", codeUp);// capital S


        // TODO: print using printf() with placeholder %S
        String name = "matt";
//        System.out.printf("Hello there, %s. \n", name);//new line char \n for the new line print, printf does not auto a new line like println
//        System.out.println(name);
//        System.out.print(name);


        //TODO: Remove the %n from the first printf. What do you notice?
        //not a new line

        // >>>> Multiple Variables


        //TODO TOGETHER:
        // (1) Create 2 variables - int and string
        // (2) Print using printf() and placeholders
        // note: d : decimal integer [byte, short, int, long]

        int x = 10;
        String person = "matthew";

        System.out.printf("Example: %s has %d dogs.%n", person, x);




        //TODO:
        // (1) Print using printf(), multiple variables, and placeholders
        int a = 2;
        int b = 4;
        String me = "matt";
        String pet = "pets";
        String car = "cars";
        System.out.printf("%S has %d %s and %d %s.%n", me, a, car, b, pet);


        // >>>> Currency


        // %f => float/double formatting
        //We can control the precision of the decimal using .___

        //TODO TOGETHER:
        // (1) Create int variable currencyPennies
        // (2) Print variable using currency formatting

        int currencyPennies = 1000;
        System.out.printf("I'll sell you land for $%.2f and acre!%n", currencyPennies/100.00);



        /* ***************************************
                        USER INPUT
        ****************************************/
        // The Scanner class allows us to get data input that the user enters into the console.
        // Scanner Docs ==> http://www.cs.utexas.edu/users/ndale/Scanner.html

        Scanner userInput = new Scanner(System.in);



        // >>>> .next() method
        // .next() captures each input usually signified by whitespace. The input is returned as a string
        System.out.println("Please Enter your first, middle, and last name.");
        String firstName = userInput.next();
        String middleName = userInput.next();
        String lastName = userInput.next();

        System.out.println(firstName);
        System.out.println(middleName);
        System.out.println(lastName);


        // >>>> .nextInt() method
        // .nextInt() captures the first valid int value
        System.out.println("please enter your age");
        int age = userInput.nextInt();
        if(age >= 21){
            System.out.printf("%d is old enough.%n", age);
        } else {
            System.out.printf("%d is not old enough.%n", age);
        }




        // >>>> .nextLine() method
        // .nextLine() Returns the rest of the current line





        /* ****************** NOTE ********************
         *Quirk of using next() then nextLine()...
         *https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
         *
         *That's because the Scanner.nextInt method does not read the newline character in your input created by hitting "Enter,"
         *the call to Scanner.nextLine returns after reading that newline.
         *You will encounter the similar behaviour when you use Scanner.nextLine() after Scanner.next()
         *or any Scanner.nextFoo method (except nextLine itself).
         */

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Please enter your favorite number: ");
//         int num = sc.nextInt();
//         System.out.println(num);
//         System.out.print("Please enter your favorite words: ");
//         String words = sc.nextLine();
//         System.out.println(words);


    }
}