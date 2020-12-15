package shapes;

public class Square extends Quadrilateral{



    public Square(double side){
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return this.length * 4;
    }

    @Override
    public double getArea() {
        return this.length * this.length;
    }

    @Override
    public void setLength(double newL) {
        this.length = newL;
        this.width = newL;
    }

    @Override
    public void setWidth(double newW) {
        this.length = newW;
        this.width = newW;
    }
}




//    public int side;//===========NOT EVEN NEEDED, SIDE IS IMPLIED FROM THE LENGTH/WIDTH OF THE RECTANGLE
//
//    public Square (int s){
//        super(s, s);
//    }
//
//    @Override
//    public int getArea(){
//        System.out.println("This is running right? getArea square");
//        return this.width * this.length;
////        return this.side * this.side;----- THIS DID NOT WORK, NEED TO REFERENCE IT LIKE IT IS REFERENCED IN THE PARENT
//        // RECTANGLE CLASS AS LENGTH AND WIDTH???
//    }
//
//    @Override
//    public int getPerimeter(){
//        System.out.println("This is running right? getPerimeter square");
//        return this.length * 4;
//        //        return this.side * 4;----- THIS DID NOT WORK, NEED TO REFERENCE IT LIKE IT IS REFERENCED IN THE PARENT
//        // RECTANGLE CLASS AS LENGTH AND WIDTH???
//    }

//}
