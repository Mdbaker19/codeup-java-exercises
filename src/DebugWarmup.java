import java.util.Scanner;

public class DebugWarmup {
    // TODO: The following app is broken and needs to be debugged. Change the code below to run in the expected manner.
    //  In this exercise, assume the user will always enter a valid data type (an integer, then a string).
    //  When working correctly, the program should have a similar output to the following:
    /*
        Welcome to 'PRINT THE VEGETABLE COUNT' app!

        How many vegetables do you have? 3
        What kind of vegetable? (use a singular noun, e.g. 'carrot' vs. 'carrots'): carrot
        You have 3 carrots!


        Process finished with exit code 0
     */

    // HINT: You can fix the unexpected behavior by altering or adding a single line
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to 'PRINT THE VEGETABLE COUNT' app!\n");
        System.out.printf("How many vegetables do you have? %n");
        int count = sc.nextInt();
        System.out.printf("What kind of vegetable? (use a singular noun, e.g. 'carrot' vs. 'carrots'): %n");
        String veggie = sc.next();
        System.out.printf("You have %d %ss!\n\n", count, veggie);
    }
}
