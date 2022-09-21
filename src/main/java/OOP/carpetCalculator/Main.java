package OOP.carpetCalculator;

public class Main {
    public static void main(String[] args) {
//        Carpet carpet  = new Carpet(1.5);
//        Floor floor =  new Floor(5.4, 4.5);
        Calculator calculator = new Calculator(new Floor(2,2), new Carpet(2));
        System.out.println(calculator.getTotalCost());}
}
