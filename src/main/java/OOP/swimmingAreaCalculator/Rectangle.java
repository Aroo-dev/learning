package OOP.swimmingAreaCalculator;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        if (this.width < 0){
            this.width = 0;
        }
        this.length = length;
        if (this.length < 0){
            this.length = 0;
        }
        
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    public double getArea(){
        return width*length;
    }
}
