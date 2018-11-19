package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        // new objects instances

        Measureable rectangle = new Rectangle(20, 6);
        Measureable square = new Square(7);


        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        System.out.println();
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());


        // Measureable myShape;
        // myShape = new Rectangle(4.0, 5.0);
        // sout(myShape.getArea());
        // sout(myShape.getPerimeter());
        // myShape = new Square(4.0);
        // sout(myShape.getArea());
        // sout(myShape.getPerimeter());


//        Square square = myShape.getArea();
//        Square square1 = myShape.getPerimeter();

//        Rectangle rectangle = myShape.getArea();
//        Rectangle rectangle1 = myShape.getArea();

//        Rectangle box1 = new Rectangle(5, 4);
//        Rectangle box2 = new Square(5 );
//
////        box1.getArea();
////        box1.getPerimeter();
//        System.out.println(box1.getPerimeter()); // 18
//        System.out.println(box1.getArea()); // 20
//
//        System.out.println(box2.getPerimeter()); // 20
//        System.out.println(box2.getArea()); // 25
//
//        System.out.println(((Square) box2).getPerimeter()); // 20
//        System.out.println(((Square) box2).getArea()); // 25

    }


}
