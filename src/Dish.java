public class Dish {
    public int costInCents;
    public String nameOfDish;
    public boolean wouldRecommend;

    public void printSummary(){
        System.out.printf("Cost: %d, Name: %s, Recommend: %s", costInCents, nameOfDish, wouldRecommend);
    }
}
