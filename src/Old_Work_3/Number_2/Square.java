package Old_Work_3.Number_2;

public class Square extends Rectangle {
    protected double Side;

    public Square(){}
    public Square(double side, String color, boolean filled){
        Side = side; setLength(side);
        setColor(color); setFilled(filled);
    }
    public double getSide() { return Side; }
    public void setSide(double side) { Side = side; }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }
    @Override
    public void setLength(double length) {
        super.setLength(length);
    }
    @Override
    public String toString() {
        return "Shape: Square Side: " + Side +  super.toString();
    }
}
