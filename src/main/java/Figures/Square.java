package Figures;

public class Square extends Shape {

    protected double side;

    public Square(double square, double side) {
        super(square);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double area() {
        return side * side;
    }
}
