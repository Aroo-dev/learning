package OOP2.Composition.thePc;

public class Resolution {
    private int heigth;
    private int width;

    @Override
    public String toString() {
        return "Resolution{" +
                "heigth=" + heigth +
                ", width=" + width +
                '}';
    }

    public Resolution(int heigth, int width) {
        this.heigth = heigth;
        this.width = width;
    }



    public int getHeigth() {
        return heigth;
    }

    public int getWidth() {
        return width;
    }
}
