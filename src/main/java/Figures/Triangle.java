package Figures;

public class Triangle extends Shape {

    protected double base;
    protected double height;

    public Triangle(double square, double base, double height) {
        super(square);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double area() {
        return (base*height / 2);
    }
}
