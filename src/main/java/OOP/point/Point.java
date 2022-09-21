package OOP.point;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
//        return Math.sqrt((y) * (y) + (x) * (x));
        return distance(0,0);
    }

    public double distance(int x, int y) {
//        return Math.sqrt((this.y - y) * (this.y - y) + (this.x - x) * (this.x - x));
        return distance(new Point(x, y));
    }

    public double distance(Point point) {
        return Math.sqrt((this.y - point.y) * (this.y - point.y) + (this.x - point.x) * (this.x - point.x));
    }
}
