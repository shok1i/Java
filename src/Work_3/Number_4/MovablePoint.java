package Work_3.Number_4;

public class MovablePoint implements Movable{
    private int X, Y, XSpeed, YSpeed;

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
