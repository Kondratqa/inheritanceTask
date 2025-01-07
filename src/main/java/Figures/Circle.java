package Figures;

public class Circle extends Shape {

    protected double radius;

    public Circle(double square, double radius) {
        super(square);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
       return Math.PI * radius * radius;
    }
}

