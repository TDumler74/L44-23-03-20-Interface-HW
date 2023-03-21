package newMath;

public class Main {
    public static void main(String[] args) {
        Shape circle= new Circle(5);
        Shape rectangle= new Rectangle(10,5);
        circle.area();
        circle.perimeter();
        rectangle.perimeter();
        rectangle.area();
        /*
        Area from circle is 78.5
        Circumference from circle is 31.4
        Area from rectangle is: 50.0
        Perimeter from rectangle is: 30.0

         */

    }
}
