public class Dish {
    public double costInCents;
    public String nameOfDish;
    public boolean wouldRecommend;


    public void printSummary(){
        System.out.printf("Cost: %f, Name: %s, Recommend: %s", costInCents, nameOfDish, wouldRecommend);
    }
}