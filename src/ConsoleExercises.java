import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args){

        double pi = 3.14159;

        System.out.println(pi);
        System.out.printf("The value of pi is approximately %.2f%n", pi);
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");
//        System.out.println("Enter a number");
//        int userNum = input.nextInt();
//        System.out.printf("Thank you, your number is: %d%n", userNum);
//        // if an int is not entered, an exception error is thrown
//        System.out.println("Enter 3 words");
//        String first = input.next();
//        String second = input.next();
//        String third = input.next();
//        System.out.printf("first: %s, second: %s, third: %s%n", first, second, third);
        System.out.print("Enter a sentence");
        String sentence = input.nextLine();
        System.out.println(sentence);
        System.out.println("Enter the size of your room, width followed by length");
        double width = Double.parseDouble(input.next());
        double length = input.nextDouble();
        double area = width * length;
        double perimeter = width * 2 + length * 2;
        System.out.printf("Area of your room is: %f ^2%n", area);
        System.out.printf("Perimeter is: %f%n", perimeter);
        System.out.println("Enter a height of the room for volume calculation");
        double height = Double.parseDouble(input.next());
        double volume = area * height;
        System.out.printf("Volume of room is: %f^3", volume);
    }
}
