import java.util.Scanner;

public class ControlFlowExercises {

    public static char format(int g){
        if(g >= 60){
            String single = Integer.toString(g);
            return single.charAt(1);
        }
        return (char) g;
    }


    public static void main(String[] args) {
//        int i = 5;
//        while(i <= 15){
//            System.out.println(i);
//            i++;
//        }
//
//        int d = 100;
//
//        do{
//            System.out.println(d);
//            d-=5;
//        }while(d >= -10);

//        for(int d = 100; d >= -10; d-=5){
//            System.out.println(d);
//        }

//        for(long m = 2; m <= 65536; m = (long) Math.pow(m, 2)){
//            System.out.println(m);
//        }
//
//
//        long mults = 2;
//
//        do{
//            System.out.println(mults);
//            mults = (long) Math.pow(mults, 2);
//        }while(mults <= 65536);

//        for(int i = 0; i <= 100; i++){
//            if(i % 15 == 0){
//                System.out.printf("FizzBuzz: %d%n", i);
//            } else if(i % 5 == 0){
//                System.out.printf("Buzz: %d%n", i);
//            } else if(i % 3 == 0){
//                System.out.printf("Fizz: %d%n", i);
//            }
//        }

        Scanner sc = new Scanner(System.in);


//        boolean yesOrNo = false;
//        do {
//            System.out.println("Please enter an integer");
//            int enteredNum = sc.nextInt();
//            System.out.println("number | squared | cubed");
//            System.out.println("...... | ......  | ......");
//            for (int i = 1; i <= enteredNum; i++) {
//                int x = i * i;
//                int y = i * i * i;
//                if(x >= 10) {
//                    System.out.printf("%d      |%d      |%d    %n", i, x, y);
//                } else {
//                    System.out.printf("%d      |%d       |%d    %n", i, x, y);
//                }
//            }
//            System.out.println("Would you like to continue with another number [Y]es [N]o ???");
//            String goAgain = sc.next();
//            if (goAgain.equalsIgnoreCase("Y")) {
//                yesOrNo = true;
//            } else {
//                yesOrNo = false;
//                System.out.println("Goodbye");
//                }
//        } while (yesOrNo);

        boolean getAnotherGrade = false;
        do {
            System.out.println("Enter a numerical grade from 0 - 100");
            int grade = Integer.parseInt(sc.next());
            int tenth = Character.getNumericValue(format(grade));

            if (grade >= 90 && grade <= 100) {
                if (tenth >= 8) {
                    System.out.print("A");
                    System.out.println("+");
                } else if (tenth <= 3) {
                    System.out.print("A");
                    System.out.println("-");
                } else {
                    System.out.println("A");
                }
            } else if (grade >= 80 && grade <= 89) {
                if (tenth >= 8) {
                    System.out.print("B");
                    System.out.println("+");
                } else if (tenth <= 3) {
                    System.out.print("B");
                    System.out.println("-");
                } else {
                    System.out.println("B");
                }
            } else if (grade >= 70 && grade <= 79) {
                if (tenth >= 8) {
                    System.out.print("C");
                    System.out.println("+");
                } else if (tenth <= 3) {
                    System.out.print("C");
                    System.out.println("-");
                } else {
                    System.out.println("C");
                }
            } else if (grade >= 60 && grade <= 69) {
                if (tenth >= 8) {
                    System.out.print("D");
                    System.out.println("+");
                } else if (tenth <= 3) {
                    System.out.print("D");
                    System.out.println("-");
                } else {
                    System.out.println("D");
                }
            } else {
                System.out.println("F");
            }

            System.out.println("Would you like to check another Grade??? [Y]es, [N]o");
            String again = sc.next();
            if(again.equalsIgnoreCase("Y")){
                getAnotherGrade = true;
            } else {
                System.out.println("Goodbye");
                getAnotherGrade = false;
            }

        } while(getAnotherGrade);
    }
}
