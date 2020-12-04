import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println(multRecursion(50000, 10000));
        System.out.println(add(6, 9));
        System.out.println(sub(9, 4));
        System.out.println(mult(5, 6));
        System.out.println(div(9, 3));
        System.out.println(mod(25, 4));
        System.out.println(multLoop(5, 6));
        System.out.println(getInteger(1, 10, 8));
        System.out.println(factorial(11));
        // 16 is max return that is not negative
        System.out.println(factorialR(16));
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
