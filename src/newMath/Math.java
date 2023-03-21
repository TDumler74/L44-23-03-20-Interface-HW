package newMath;

public class Math {
    public static void main(String[] args) {
        Shape rectangel =new Rectangel(10,3);
        Shape circle =new Circle(10);
        circle.perimeter();
        circle.area();
        rectangel.perimeter();
        rectangel.area();
    }
}
