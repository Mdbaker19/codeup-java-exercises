import java.util.Scanner;
import java.lang.Math;

public class MethodsExercises {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        getInteger(1, 10);

//        recurHello(1);

//        System.out.println(multRecursion(60, 14));
//        System.out.println(add(6, 9));
//        System.out.println(sub(9, 4));
//        System.out.println(mult(5, 6));
//        System.out.println(div(9, 3));
//        System.out.println(mod(25, 4));
//        System.out.println(multLoop(5, 6));
//
//        System.out.printf("Enter a number to find it's factorial(there is a maximum of 20)%n");
//        int factInt = sc.nextInt();
//        if(factInt > 20){
//            System.out.println("Invalid, number too high for accurate calculation");
//        } else {
//            System.out.println(factorial(factInt));
//        }






//        boolean rollAgain = false;
//        System.out.println("Would you like to roll some dice? [Y]es");
//        String choice = sc.next();
//        if(choice.equalsIgnoreCase("Y")){
//            rollAgain = true;
//        } else {
//            rollAgain = false;
//        }
//        while(rollAgain) {
//            System.out.println("Let's create a dice, how many sides?");
//            int sides = sc.nextInt();
//            System.out.println("Enter any character to roll the dice");
//            for (int i = 1; i < 3; i++) {
//                int ran = (int) (Math.random() * sides) + 1;
//                System.out.printf("Dice %d landed on: %d%n", i, ran);
//            }
//            System.out.println("Would you like to roll some dice? [Y]es");
//            String again = sc.next();
//            if(again.equalsIgnoreCase("Y")){
//                rollAgain = true;
//            } else {
//                rollAgain = false;
//            }
//        }














    }




    public static int getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number between 1 and 10%n");
        int intInput = sc.nextInt();
        if(intInput < min || intInput > max){
            System.out.printf("Invalid number, not within range %d and %d", min, max);
            return getInteger(min, max);
        } else{
            System.out.printf("%d is valid, thank you", intInput);
            return intInput;
        }
    }




    public static int add(int x, int y){
        return x + y;
    }
    public static int sub(int x, int y){
        return x - y;
    }
    public static int mult(int x, int y){
        return x * y;
    }
    public static int div(int x, int y){
        return x / y;
    }
    public static int mod(int x, int y){
        return x % y;
    }



    public static int multLoop(int x, int y){
        int initialX = x;
        for(int i = 1; i < y; i++){
            x+=initialX;
        }
        return x;
    }

    public static int multRecursion(int x, int y){
        if(y == 1){
            return x;
        } else {
            return x + multRecursion(x, y -1);
        }
    }

    public static void sayHello(){
        System.out.println("hello");
    }

    public static void recurHello(int x){
        if(x >=8562){
            return;
        } else {
            sayHello();
            recurHello(x + 1);
        }
    }



    public static boolean getInteger(int min, int max, int input){
        return input >= min && input <= max;
    }














    public static long factorial(long f){
        for(long i = f - 1; i > 0; i--){
            f *= i;
        }
        return f;
    }



    public static long factorialR(long f){
        if(f == 1){
            return 1;
        } else {
            return f * factorialR(f - 1);
        }
    }


}
