import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;

public class AdventureGame {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Thread.sleep(800);
        System.out.println("Welcome back...");
        Thread.sleep(1500);
        System.out.println("I can not seem to remember your name. What was it again?");
        String name = sc.next();
        Thread.sleep(500);
        System.out.printf("Ahhhh... that's right, nice to see you again %s%n", name);
        ArrayList<Integer> pStats = new ArrayList<>();
        ArrayList<Integer> eStats = new ArrayList<>();
        String statType = null;
        for (int i = 0; i < 3; i++) {
            int ran = (int) (Math.random() * 15) + 10;
            pStats.add(ran);
        }

        for (int i = 0; i < 3; i++) {
            int ran = (int) (Math.random() * 15) + 10;
            eStats.add(ran);
        }

        System.out.printf("Your stats are as follows Health, Strength, Agility %s%n", pStats);
        System.out.printf("Enemy stats are as follows Health, Strength, Agility %s%n", eStats);

        double pDamage = pStats.get(1) * .15;
        double pBlockChance = pStats.get(2) * 1.5;


        double eDamage = eStats.get(1) * .15;
        double eBlockChance = eStats.get(2) * 1.5;


//        System.out.println(pDamage);
//        System.out.println(eDamage);

//        System.out.println(pBlockChance);
//        System.out.println(eBlockChance);

        System.out.println("Some story stuff here, enemy shows up and battle begins");

        int pHealth = pStats.get(0);
        int eHealth = eStats.get(0);

        do{
            System.out.printf("player health is: %d%n", pHealth);
            System.out.printf("enemy health is: %d%n", eHealth);
            Thread.sleep(1000);

            int accuracy = (int) (Math.random() * 100) + 1;
            if(accuracy <= pBlockChance){
                System.out.println("You have blocked the incoming attack");
            } else {
                pHealth -= eDamage;
                System.out.printf("You have been hit, taking %f damage%n", eDamage);
            }
            if(accuracy <= eBlockChance){
                System.out.println("Enemy has blocked your attack");
            } else {
                eHealth -= pDamage;
                System.out.printf("You hit the enemy, dealing %f damage%n", pDamage);
            }            if(pHealth <= 0){
                System.out.println("Enemy has defeated you");
            } else if(eHealth <= 0){
                System.out.println("You have defeated your enemy");
            }


        }while(pHealth > 0 && eHealth > 0);



    }
}