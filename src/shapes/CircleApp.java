package shapes;

import util.Input;

import java.util.Scanner;


public class CircleApp {
//    Input in = new Input();

//    String in = scanner.next();

    public static void main(String[] args) {
        System.out.println("Please enter a radius for a given circle");
        Input in = new Input(new Scanner(System.in));
        Circle c = new Circle(in.getDouble());
        System.out.println("Area: " + c.getArea());
        System.out.println("Circumference: " + c.getCircumference());
    }



}
