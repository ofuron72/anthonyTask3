public class Circle {
    double x0;

    double y0;

    double r;

    public Circle(double x0, double y0, double r) {
        this.x0 = x0;
        this.y0 = y0;
        this.r = r;
    }

    public boolean IsPointInCircle(double x, double y) {
        return ((x - x0) * (x - x0)) + ((y - y0) * (y - y0)) <= r * r;
    }
}