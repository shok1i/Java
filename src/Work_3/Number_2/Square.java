package Work_3.Number_2;

public class Square extends Rectangle {
    public Square(){}
    public Square(double side, String color, boolean filled){
        setWidth(side); setLength(side);
        setColor(color); setFilled(filled);
    }

    public double getSide(){ return getWidth(); }
    public void setSide(double side) { setWidth(side); }
}
