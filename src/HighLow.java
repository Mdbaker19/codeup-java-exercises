import java.util.Scanner;
import java.lang.Math;

public class HighLow {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the RNG");
        System.out.println("A random number will be generated between 1 and 100 and you can guess it! It will be so much fun!!");
        int random = (int) (Math.random() * 100) + 1;
        int count = 1;
        boolean notRight = true;
        while (notRight) {
            System.out.printf("Enter guess number %d%n", count);
            int guess = sc.nextInt();
            if(guess > random){
                System.out.println("LOWER");
                count++;
            } else if(guess < random){
                System.out.println("HIGHER");
                count++;
            } else if (guess == random) {
                System.out.println("GOOD GUESS!");
                notRight = false;
            }
        }
    }
}
