package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grade;
    private String ghName;

    public Student(String name, ArrayList<Integer> grade, String gh){
        this.name = name;
        this.grade = grade;
        this.ghName = gh;
    }

    public String getName(){
        return this.name;
    }
    public ArrayList<Integer> getGrade(){
        return this.grade;
    }
    public void addGrade(int grade){
        this.grade.add(grade);
    }
    public double getGradeAverage(ArrayList<Integer> grades){
        double total = 0;
        double len = grades.size();
        for(int grade : grades){
            total += grade;
        }
        return total / len;
    }

    public String getGhName(){
        return this.ghName;
    }

}