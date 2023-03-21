package Math;

public class Rectangel implements Shape{
    int sideA;
    int sideB;

    public Rectangel(int sideA,int sideB){
        this.sideA=sideA;
        this.sideB=sideB;
    }
    @Override
    public void Area() {
        System.out.println("Area from rectangel is: "+sideA*sideB);
    }
    @Override
    public void Umfang() {
        System.out.println("Umfang vom Rechtwinkel ist :"+2*(sideA+sideB));

    }
}
