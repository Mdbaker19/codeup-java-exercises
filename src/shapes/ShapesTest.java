package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable myShape;
        myShape = new Rectangle(5, 5);
//        myShape.setLength(5);
//        myShape.setWidth(5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        // CAN NOT DO THIS AS IT IS NOT A METHOD IN MEASURABLE
//        System.out.println(myShape.getLength());
//        System.out.println(myShape.getWidth());


        System.out.println(" ");

        myShape = new Square(5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

    }
}






//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());
//
//        Square box3 = new Square(6);
//        System.out.println(box3.getArea());
//        System.out.println(box3.getPerimeter());

