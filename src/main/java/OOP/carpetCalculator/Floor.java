package OOP.carpetCalculator;

public class Floor {
    private double width;
    private double length;

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public Floor(double width, double length) {
        this.width = width;
        if (this.width < 0){
            this.width = 0;
        }
        this.length = length;
        if (this.length < 0){
            this.width = 0 ;
        }
    }
    public double getArea (){
        return this.width * this.length;
    }
}
