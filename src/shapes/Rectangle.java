package shapes;

public class Rectangle extends Quadrilateral implements Measureable {

    public Rectangle(double length, double width) {
        super(length, width);
    }

    public double getPerimeter(){
        return (2 * this.length) + (2 * this.width);
    }

    public double getArea(){
        return this.length * this.width;
    }

//    @Override
//    public double getLength() {
//        return super.getLength();
//    }
//
//    @Override
//    public double getWidth() {
//        return super.getWidth();
//    }
//
//    @Override
//    void setLength(double length) {
//        this.length = length;
//    }
//
//    @Override
//    void setWidth(double width) {
//        this.width = width;
//    }

    //    protected int length;
//    protected int width;
//
//
//
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public int getArea(){
//        int area = (length * width);
//        return area;
//    }
//
//    public int getPerimeter(){
//        int perimeter = (2 * length) + (2 * width);
//        return perimeter;
//    }
}
