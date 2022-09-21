package OOP.ComplexOperations;

public class ComplexNumber2 {
    private double real;
    private double imaginary;

    public ComplexNumber2(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;

    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary) {
        this.real = this.real + real;
        this.imaginary = this.imaginary + imaginary;
    }

    public void add(ComplexNumber2 complexNumber) {
       add(complexNumber.real, complexNumber.imaginary);
    }

    public void subtract(double real, double imaginary) {
     add(-real,-imaginary);
    }

    public void subtract(ComplexNumber2 complexNumber) {
        add(-complexNumber.real, -complexNumber.imaginary);

    }
}
//
//}


