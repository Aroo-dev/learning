package powtorka.Cylinder;

public class Main {
    public static void main(String[] args) {
        Cylinder cylinder  = new Cylinder(2.2,5);
        System.out.println(cylinder.getArea());
        System.out.println(cylinder.getVolume());
        cylinder.getRadius();
    }
}
