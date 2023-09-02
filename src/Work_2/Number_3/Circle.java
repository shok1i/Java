package Work_2.Number_3;

import static java.lang.Math.pow;

public class Circle {
    private Point Dot = new Point(0.0, 0.0);
    private double Radius = 0;

    public Circle (Point dot, double radius){
        Dot = dot;
        Radius = radius;
    }

    public void setRadius(double radius) {
        Radius = radius;
    }

    public double getRadius() {
        return Radius;
    }

    public double CircleLength ()
    {
        return 2 * Math.PI * getRadius();
    }

    public double CircleArea ()
    {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    public double CirclePerimeter ()
    {
        return 2 * Math.PI * getRadius();
    }

    public void setDot(double x, double y) {
        Dot.setXY(x, y);
    }

    public void moveDot(double x, double y) {
        Dot.move(x, y);
    }
}
