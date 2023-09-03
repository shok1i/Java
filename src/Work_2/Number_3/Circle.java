package Work_2.Number_3;

import static java.lang.Math.pow;

public class Circle {
    private Point Dot = new Point(0.0, 0.0);
    private double Radius;

    public Circle(double x_cord, double y_cord, double radius){
        setDot(x_cord, y_cord);
        setRadius(radius);
    }
    public void setDot(double x, double y) { Dot.setXY(x, y); }
    public void moveDot(double x, double y) { Dot.moveXY(x, y); }

    public Point getDot() { return Dot; }

    public void setRadius(double radius) { Radius = radius; }
    public double getRadius() { return Radius; }


}

/*
Для задания номер 6
    public double CircleLength () { return 2 * Math.PI * getRadius(); }
    public double CircleArea () { return Math.PI * Math.pow(getRadius(), 2); }
    public double CirclePerimeter () { return 2 * Math.PI * getRadius(); }
 */