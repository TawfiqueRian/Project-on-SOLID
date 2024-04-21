/**
 * Title: This program demonstrates the Single Responsibility Principle by separating
   the responsibilities of calculating area and displaying shapes.
 * Author: Md. Tawfiqul Islam, Undergraduate student, Khulna University
 */

// Shape class representing various geometric shapes
abstract class Shape {
    
    /**
     * Calculates the area of the shape.
     * @return The area of the shape.
     */
    abstract double calculateArea();
}

// Rectangle class representing rectangles
class Rectangle extends Shape {
    private double length;
    private double width;

    /**
     * Constructor to initialize the Rectangle object.
     * @param length The length of the rectangle.
     * @param width The width of the rectangle.
     */
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

// Circle class representing circles
class Circle extends Shape {
    private double radius;

    /**
     * Constructor to initialize the Circle object.
     * @param radius The radius of the circle.
     */
    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// ShapePrinter class responsible for printing shapes
class ShapePrinter {
    
    /**
     * Prints the area of a given shape.
     * @param shape The shape whose area is to be printed.
     */
    void printArea(Shape shape) {
        System.out.println("Area of the shape: " + shape.calculateArea());
    }
}

public class single_responsibility_principle{
    
    /**
     * The main method of the program.
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        // Creating instances of shapes
        Rectangle rectangle = new Rectangle(5, 4);
        Circle circle = new Circle(3);

        // Printing areas of shapes
        ShapePrinter shapePrinter = new ShapePrinter();
        shapePrinter.printArea(rectangle);
        shapePrinter.printArea(circle);
    }
}
