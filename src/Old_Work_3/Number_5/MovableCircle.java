package Old_Work_3.Number_5;

public class MovableCircle implements Movable {
    int Radius = 0;
    MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        Radius = radius;
    }

    @Override
    public String toString() {
        return "MovableCircle{" + "Radius=" + Radius + ", center=" + center + '}';
    }

    public void moveUP(){ center.moveUP(); }
    public void moveDOWN(){ center.moveDOWN(); }
    public void moveLEFT(){ center.moveLEFT(); }
    public void moveRiGHT(){ center.moveRiGHT(); }
}
