package edu.geometry;

public class Triangle implements Shape {
    private final double side1;
    private final double side2;
    private final double angleBetween;

    public Triangle(double side1, double side2, double angleBetween) {
        this.side1 = side1;
        this.side2 = side2;
        this.angleBetween = angleBetween;
    }

    @Override
    public double getArea() {
        return 0.5 * side1 * side2 * Math.sin(Math.toRadians(angleBetween));
    }
}