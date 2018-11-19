package shapes;

import util.Input;

import java.util.Scanner;


public class CircleApp {
//    Input in = new Input();

//    String in = scanner.next();

    public static void main(String[] args) {
        System.out.println("Please enter a radius for a given circle");
        // input object with scanner object
        Input in = new Input(new Scanner(System.in));
        // circle object with it calling the getDouble() from Input.java
        Circle c = new Circle(in.getDouble());
        System.out.println("Area: " + c.getArea());
        System.out.println("Circumference: " + c.getCircumference());
    }



}
