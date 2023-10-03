package Old_Work_3.Number_5;

public class MovablePoint implements Movable {
    private int X = 0;
    private int Y = 0;
    int XSpeed = 0;
    int YSpeed = 0;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        X = x; Y = y; XSpeed = xSpeed; YSpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" + "X=" + X + ", Y=" + Y + ", XSpeed=" + XSpeed + ", YSpeed=" + YSpeed + '}';
    }

    public void moveUP(){ Y += YSpeed; }
    public void moveDOWN(){ Y -= YSpeed; }
    public void moveLEFT(){ X -= XSpeed; }
    public void moveRiGHT(){ X += XSpeed; }
}
