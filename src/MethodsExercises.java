import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

//        recurHello(1);

//        System.out.println(multRecursion(60, 14));
//        System.out.println(add(6, 9));
//        System.out.println(sub(9, 4));
//        System.out.println(mult(5, 6));
//        System.out.println(div(9, 3));
//        System.out.println(mod(25, 4));
//        System.out.println(multLoop(5, 6));
//
//        System.out.printf("Enter a number to find it's factorial(there is a maximum of 16)%n");
//        int factInt = sc.nextInt();
//        if(factInt > 16){
//            System.out.println("Invalid, number too high for accurate calculation");
//        } else {
//            System.out.println(factorial(factInt));
//        }
//
//
//
//
//
//
//        System.out.printf("Enter a number between 1 and 10%n");
//        int intInput = sc.nextInt();
//        while(!getInteger(1, 10, intInput)){
//            System.out.println("Invalid");
//            System.out.printf("Enter a number between 1 and 10%n");
//            intInput = sc.nextInt();
//        }
//        System.out.println("Thank you, that number is valid");





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














    public static int factorial(int f){
        for(int i = f - 1; i > 0; i--){
            f *= i;
        }
        return f;
    }



    public static int factorialR(int f){
        if(f == 1){
            return 1;
        } else {
            return f * factorialR(f - 1);
        }
    }


}
