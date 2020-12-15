package shapes;

public class Rectangle extends Quadrilateral implements Measurable{


    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    // WHY DOES THE CODE FAL TO COMPILE IF YOU LEAVE OFF THE GET PERIMETER? => THIS CLASS IMPLEMENTS MEASURABLE, NEEDS TO HAVE EACH OF THE MEASURABLE METHODS PRESENT
    @Override
    public double getPerimeter(){
        return (this.length * 2) + (this.width * 2);
    }

    @Override
    public void setLength(double newL) {
        this.length = newL;
    }

    @Override
    public void setWidth(double newW) {
        this.width = newW;
    }


}
    //    protected int length;
//    protected int width;
//
//    public Rectangle(int l, int w){
//        this.length = l;
//        this.width = w;
//    }
//
//    public int getArea(){
//        return this.length * this.width;
//    }
//
//    public int getPerimeter(){
//        return (this.length * 2) + (this.width * 2);
//    }

