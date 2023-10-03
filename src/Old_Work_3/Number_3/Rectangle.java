package Old_Work_3.Number_3;

public class Rectangle extends Shape {
    protected double Width, Length;

    public Rectangle(){}
    public Rectangle(double width, double length){ Width = width; Length = length; }
    public Rectangle(double width, double length, String color, boolean filled){
        Width = width; Length = length; Color = color; Filled = filled;
    }
    public double getLength() { return Length; }
    public void setLength(double length) { Length = length; }
    public double getWidth() { return Width; }
    public void setWidth(double width) { Width = width; }



    @Override
    public double getArea() { return Width * Length; }

    @Override
    public double getPerimeter() { return 2 * (Width + Length); }

    @Override
    public String toString() {
        return "Shape: Rectangle Width: " + Width + " Length: " + Length + " " + super.toString();
    }
}
