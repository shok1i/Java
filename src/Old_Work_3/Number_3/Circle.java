package Old_Work_3.Number_3;

public class Circle extends Shape {
    protected double Radius;

    public Circle(){}
    public Circle(double radius){ Radius = radius; }
    public Circle(double radius, String color, boolean filled){
        Radius = radius; Color = color; Filled = filled;
    }
    public double getRadius() { return Radius; }
    public void setRadius(double radius) { Radius = radius; }

    @Override
    public double getArea() { return Math.PI * Radius * Radius; }
    @Override
    public double getPerimeter() { return 2 * Math.PI * Radius; }
    @Override
    public String toString() { return "Shape: Circle R=" + Radius + " " + super.toString(); }
}
