package newMath;

public class Circle implements Shape{
    double radius;
    double area;
    double perimeter;
    public Circle(double radius){
        this.radius=radius;
    }
    @Override
    public double area() {
        System.out.println("Area from circle is "+ Math.round(radius*radius*3.14*100)/100.);
        return 0;
    }

    @Override
    public double perimeter() {
        System.out.println("Circumference from circle is "+Math.round(2*radius*3.14*100)/100.);
        return 0;
    }
}
