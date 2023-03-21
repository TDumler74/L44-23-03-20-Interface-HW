package Math;

public class Main {
    public static void main(String[] args) {
        Shape circle= new Circle(5);
        Shape rectangle =new Rectangle(4,6);
        circle.perimeter();
        circle.area();
        rectangle.area();
        rectangle.perimeter();




        /*
        Circumference from circle is: 31.400000000000002
        Area from circle is : 78.5
        Area from rectangle is: 24
        Perimeter from rectangle is:20

         */

    }
}
