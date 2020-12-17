package grades;

import collections.HashMaps;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


public class GradesApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, Student> studentsInfo = new HashMap<>();

        ArrayList<Integer> myGrades = new ArrayList<>();
        Student me = new Student("Matt", myGrades, "Mdbake19");
        me.addGrade(89);
        me.addGrade(99);
        me.addGrade(90);
        String myUN = me.getGhName();
        studentsInfo.put(myUN, me);

        ArrayList<Integer> wifeGrades = new ArrayList<>();
        Student wife = new Student("Mandy", wifeGrades, "wifeboo");
        wife.addGrade(86);
        wife.addGrade(98);
        wife.addGrade(92);
        String wifeUN = wife.getGhName();
        studentsInfo.put(wifeUN, wife);

        ArrayList<Integer> nemoGrades = new ArrayList<>();
        Student nemo = new Student("Nemo", nemoGrades, "batgoat");
        nemo.addGrade(83);
        nemo.addGrade(91);
        nemo.addGrade(59);
        String nemoUN = nemo.getGhName();
        studentsInfo.put(nemoUN, nemo);

        ArrayList<Integer> sayGrades = new ArrayList<>();
        Student sabear = new Student("Sabear", sayGrades, "waterdog");
        sabear.addGrade(82);
        sabear.addGrade(9);
        sabear.addGrade(30);
        String sayUN = sabear.getGhName();
        studentsInfo.put(sayUN, sabear);

//        System.out.println(studentsInfo);


        System.out.println("Welcome!");
        System.out.println("Here are the GitHub usernames of our students");
        System.out.println("|" + myUN + "| |" + wifeUN + "| |" + nemoUN + "| |" + sayUN + "|");
        ArrayList<String> users = new ArrayList<>(Arrays.asList(myUN, wifeUN, nemoUN, sayUN));


        boolean keepGoing = true;
        do{
            System.out.println("What student would you like to see more information on?");
            String choice = sc.next();

            if(users.contains(choice)){
                System.out.printf("Name: %s - GitHub Username: %s %nCurrent Average: %f %n", studentsInfo.get(choice).getName(), choice, studentsInfo.get(choice).getGradeAverage(studentsInfo.get(choice).getGrade()));
            } else {
                System.out.printf("Sorry, no student found with the Github username of %s%n", choice);
            }

            System.out.println("Would you like to see another Student? [y]es");
            String goAgain = sc.next();
            if(!goAgain.equalsIgnoreCase("Y")){
                keepGoing = false;
                System.out.println("Goodbye, and have a wonderful day!");
            }

        }while(keepGoing);


    }


}
