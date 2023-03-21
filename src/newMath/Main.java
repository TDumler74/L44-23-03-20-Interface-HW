package newMath;

public class Main {
    public static void main(String[] args) {
        Shape circle= new Circle(10);
        Shape rectangel= new Rectangel(10,5);
        circle.area();
        circle.perimeter();
        rectangel.area();
        rectangel.perimeter();

    }
}
