package newMath;

public class Rectangle implements Shape {
    double sideA;
    double sideB;
    double perimeter;
    double area;

    public Rectangle(double sideA, double sideB){
        this.sideA=sideA;
        this.sideB=sideB;
    }
    @Override
    public double area() {
        area=sideA*sideB;
        return area;
    }

    @Override
    public double perimeter() {
        perimeter=2*(sideA+sideB);
        return perimeter;
    }
}
