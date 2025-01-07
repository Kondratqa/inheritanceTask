package Figures;

public class Pentagon extends Shape {

    protected double side;

    public Pentagon(double square, double side) {
        super(square);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double area() {
        return (5 * side * side) / (4 * Math.tan(Math.PI / 5)) ;
    }
}
