package Math;

public class Circle implements Shape{
    double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public void area() {
        System.out.println("Area from circle is : "+radius*radius*3.14);
    }

    @Override
    public void perimeter() {
        System.out.println("Circumference from circle is: "+2*3.14*radius);
    }
}
