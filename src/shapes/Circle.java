package shapes;

public class Circle {
    private double radius;

    // PI
//    public final double PI = 3.14159;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return (Math.PI * radius * radius);
    }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }



}
