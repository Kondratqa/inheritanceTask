package Figures;

public class Rectangle extends Shape {

    protected double width;
    protected double height;

    public Rectangle(double square, double width, double height) {
        super(square);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double area() {
        return width * height;
    }
}
