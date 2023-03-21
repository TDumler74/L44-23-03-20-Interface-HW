package newMath;

public class Main {
    public static void main(String[] args) {
        Shape circle= new Circle(10);
        Shape rectangel= new Rectangel(10,5);
        circle.area();
        circle.perimeter();
        rectangel.area();
        rectangel.perimeter();

        /*
        Perimeter from circle is 62.800000000000004
        Area from circle is 314.0
        Perimeter from rectangle is: 26.0
        Area from rechtangel is: 30.0

         */

    }
}
