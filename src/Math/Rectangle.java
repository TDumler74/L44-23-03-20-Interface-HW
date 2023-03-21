package Math;

public class Rectangle implements Shape{
    int sideA;
    int sideB;

    public Rectangle(int sideA, int sideB){
        this.sideA=sideA;
        this.sideB=sideB;
    }

    @Override
    public void area() {
        System.out.println("Area from rectangle is: "+sideA*sideB);
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter from rectangle is:"+2*(sideA+sideB));
    }
}
