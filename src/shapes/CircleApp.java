package shapes;

import shapes.Circle;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {



        Input circleInput = new Input();
        Circle circle = new Circle();
        int totalCircles = circle.getCircleCount();

        do {
            System.out.println("Let's create a circle");
            System.out.printf("Circles created so far: %d%n", totalCircles);
            double newRadius = circleInput.getDouble();
            circle.setRadius(newRadius);
            circle.setCircleCount(totalCircles++);

            System.out.printf("Area of your circle with radius: %f, is %f%n", newRadius, circle.getArea());
            System.out.printf("Circumference of your circle with radius: %f, is %f%n", newRadius, circle.getCircumference());
            System.out.printf("If you would like to create another circle %n");
        }while(circleInput.yesNo());
        System.out.printf("Looks like you created %d Circle(s)", totalCircles);

    }
}
