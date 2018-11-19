package shapes;

public abstract class Quadrilateral extends Shape implements Measureable {

    protected double length;
    protected double width;

    public Quadrilateral(double length, double width){
        this.length = length;
        this.width = width;
    }

//    public double getLength() {
//        return length;
//    }
//
//    public double getWidth() {
//        return width;
//    }
//
//    abstract void setLength(double length);
//    abstract void setWidth(double width);
}
