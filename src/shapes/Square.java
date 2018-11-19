package shapes;

public class Square extends Quadrilateral implements Measureable {
    public Square(double side) {
        super(side, side);
    }

    public double getArea(){
        return width * width;
    }

    public double getPerimeter(){
        return length * 4;
    }






//    // super class constructor | the super keyword gets the data from the Parent (Rectangle)
//    public Square(int side) {
//        super(side, side);
//    }
//
//
//    //method overriding
//    public int getPerimeter(int side) {
//        int perimeter = (4 * side);
//        return perimeter;
//    }
//
//    public int getArea(int side) {
//        int area = (side * side);
//        return area;
//    }
////    method overriding


}
