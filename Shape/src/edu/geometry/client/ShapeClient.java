package edu.geometry.client;

import edu.geometry.Circle;
import edu.geometry.Rectangle;
import edu.geometry.Shape;
import edu.geometry.Triangle;
import java.util.ArrayList;
import java.util.Collection;

class ShapeClient {

    public static void main(String[] args) {
        Circle c1 = new Circle(1.0);
        System.out.println("Circle area: " + c1.getArea());
        System.out.println();

        Rectangle r1 = new Rectangle(8.0, 10.0);
        System.out.println("Rectangle area: " + r1.getArea());
        System.out.println();

        Triangle t1 = new Triangle(2.0, 3.0, 30);
        System.out.println("Triangle area: " + t1.getArea());
        System.out.println();

        Collection<Shape> shapes = new ArrayList<>();
        shapes.add(c1);
        shapes.add(r1);
        shapes.add(t1);

        double totalArea = 0.0;
        for (Shape shape : shapes) {
            double area = shape.getArea();
            System.out.println("Shape area: " + area);
            totalArea += area;  // totalArea = totalArea + area
        }
        System.out.println("Total area: " + totalArea);
    }
}