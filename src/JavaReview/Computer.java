package JavaReview;

public class Computer extends Product{

    private String os;
    private boolean isLaptop;

    public Computer(String os, boolean isLaptop){
        this.isLaptop = isLaptop;
        this.os = os;
    }


}
