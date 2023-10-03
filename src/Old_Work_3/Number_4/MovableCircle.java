package Old_Work_3.Number_4;

public class MovableCircle implements Movable{
    private int Radius;
    private MovablePoint center;

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
