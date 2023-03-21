package newMath;

public class Rectangel implements Shape {
    double sideA;
    double sideB;

    public Rectangel(double sideA,double sideB){
        this.sideA=sideA;
        this.sideB=sideB;
    }
    @Override
    public double area() {
        System.out.println("Area from rectangel is: "+sideA*sideB);
        return 0;
    }

    @Override
    public double perimeter() {
        System.out.println("Perimeter from rectangle is: "+2*(sideA+sideB));
        return 0;
    }
}
