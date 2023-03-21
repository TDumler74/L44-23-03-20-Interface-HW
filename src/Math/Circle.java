package Math;

public class Circle implements Shape{
    double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public void area() {
        System.out.println("Area from circle is : "+Math.round(radius*radius*3.14*100)/100.);
    }

    @Override
    public void perimeter() {
        System.out.println("Circumference from circle is: "+Math.round(2*3.14*radius*100)/100.);
    }
}
