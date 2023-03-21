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
        System.out.println("Area from circle is "+ radius*radius*3.14);
        return 0;
    }

    @Override
    public double perimeter() {
        System.out.println("Perimeter from circle is "+2*radius*3.14);
        return 0;
    }
}
