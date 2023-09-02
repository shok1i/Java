package Work_2.Number_2;

public class Ball {
    double X = 0.0, Y = 0.0;

    public Ball(double x, double y) {  };

    public Ball() {  };

    public double getX() { return X; }
    public void setX(double x) { X = x; }
    public double getY() { return Y; }
    public void setY(double y) { Y = y; }

    public void setXY (double x, double y) { X = x; Y = y; }

    public void move (double xMove, double yMove) { X += xMove; Y += yMove; }

    public String toString(){
        return  "Текущий x:\t" + getX() + "\n" +
                "Текущий y:\t" + getY() + "\n";
    }

}
