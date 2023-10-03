package Old_Work_3.Number_3;

public abstract class Shape {
    protected String  Color;
    protected boolean Filled;

    public Shape() {  }
    public Shape(String color, boolean filled){ Color = color; Filled = filled; }
    public void setColor(String color) { Color = color; }
    public String getColor() { return Color; }
    public void setFilled(boolean filled) { Filled = filled; }
    public boolean isFilled() { return Filled; }

    abstract public double getArea();
    abstract public double getPerimeter();

    @Override
    public String toString(){ return "The color is " + Color + " Is field: " + Filled; }
}
