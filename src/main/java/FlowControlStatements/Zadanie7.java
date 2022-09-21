package FlowControlStatements;

public class Zadanie7 {
    public static void main(String[] args) {
        double letssee = area(6.0);
        System.out.println(letssee);

        double rectangle = rectangle(-3,4.0);
        System.out.println(rectangle);
    }
    public static double area (double radius) {
        double circle  = Math.PI * (radius * radius);
        if (radius < 0){
            return -1.0;
        }
            return circle;
            }
    public static double rectangle (double x, double y) {
        double rectangle =  x * y;
        if (x < 0 || y < 0){
            return -1;
        } return rectangle;

    }
}
