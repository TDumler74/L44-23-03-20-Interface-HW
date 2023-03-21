package Math;

public class Main {
    public static void main(String[] args) {
        Shape circle= new Circle(5);
        Shape rectangle =new Rectangel(4,6);
        circle.Umfang();
        circle.Area();
        rectangle.Area();
        rectangle.Umfang();




        /*
        Umfang vom Kreis ist : 31.400000000000002
        Area from circle is : 78.5
        Area from rectangel is: 24
        Umfang vom Rechtwinkel ist :20
         */

    }
}
