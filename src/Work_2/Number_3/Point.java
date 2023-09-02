package Work_2.Number_3;

public class Point {
    double X, Y;

    public Point (double x, double y) {
        X = x;
        Y = y;
    }

    public void setXY (double x, double y){
        X = x;
        Y = y;
    }

    public void move (double x, double y){
        X += x;
        Y += y;
    }
}
