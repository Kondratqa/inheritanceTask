package Figures;

public class Main {
    public static void main(String[] args) {
        Circle myCircle = new Circle(5, 7);
        System.out.println(myCircle.area());

        Rectangle myRectangle = new Rectangle(5,8, 10);
        System.out.println(myRectangle.area());

        Triangle myTriangle = new Triangle(8.2, 13, 14.7);
        System.out.println(myTriangle.area());

        Square mySquare = new Square(17, 14);
        System.out.println(mySquare.area());

        Pentagon myPentagon = new Pentagon(5, 7);
        System.out.println(myPentagon.area());
    }
}
