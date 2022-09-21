package OOP.ComplexOperations;

public class Main {
    public static void main(String[] args) {
        ComplexNumber x = new ComplexNumber(2,3);
        System.out.println(x.getImaginary());
        System.out.println(x.getReal());
        x.add(new ComplexNumber (2,1));
        System.out.println(x);
        x.add(1,2);
    }
}
