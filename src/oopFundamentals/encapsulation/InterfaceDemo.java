package oopFundamentals.encapsulation;

import oopFundamentals.encapsulation.Circle;

public class InterfaceDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        System.out.println("oopFundamentals.encapsulation.Circle Area: " + circle.calculateArea());
        System.out.println("oopFundamentals.encapsulation.Circle Perimeter: " + circle.calculatePerimeter());

        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
    }
}
