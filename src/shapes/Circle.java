package shapes;

public class Circle {

    private double radius = 5;
    private int circleCount;

    public Circle(double num){
        this.radius = num;
    }
    public Circle(){

    }

    public int getCircleCount() {
        return circleCount;
    }

    public void setCircleCount(int circleCount) {
        this.circleCount = circleCount;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return (Math.PI * (this.radius * this.radius));
    }

    public double getCircumference(){
        return (Math.PI * (this.radius * 2));
    }


}
