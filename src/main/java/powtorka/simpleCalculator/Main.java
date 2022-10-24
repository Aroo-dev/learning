package powtorka.simpleCalculator;

import OOP.carpetCalculator.Calculator;

public class Main {
    public static void main(String[] args) {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.setFirstNumber(5.9);
        simpleCalculator.setSecondNumber(2.0);
        double x = simpleCalculator.getAdditionResult();
        System.out.println(x);
    }
}
