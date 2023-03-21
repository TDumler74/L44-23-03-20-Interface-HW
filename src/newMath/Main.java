package newMath;

public class Main {
    public static void main(String[] args) {
        Shape circle= new Circle(5);
        Shape rectangel= new Rectangel(10,5);
        circle.area();
        circle.perimeter();
        rectangel.area();
        rectangel.perimeter();

        /*
        Area from circle is 78.5
        Circumference from circle is 31.400000000000002
        Area from rectangel is: 50.0
        Perimeter from rectangle is: 30.0

         */

    }
}
