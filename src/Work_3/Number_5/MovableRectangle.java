package Work_3.Number_5;

public class MovableRectangle implements Movable{
    private MovablePoint TopLeft, BottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        TopLeft = new MovablePoint (x1, y1, xSpeed, ySpeed);
        BottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
        checkSpeed();
    }

    public void checkSpeed(){
        if (TopLeft.XSpeed != BottomRight.XSpeed) System.out.println("The speed of the points is different according to the X coordinates");
            else if (TopLeft.YSpeed != BottomRight.YSpeed) System.out.println("The speed of the points is different according to the Y coordinates");
                else System.out.println("All right");
    }
    @Override
    public String toString() {
        return "MovableRectangle{" + "TopLeft=" + TopLeft.toString() + ", BottomRight=" + BottomRight.toString() + '}';
    }

    public void moveUP(){ TopLeft.moveUP(); BottomRight.moveUP(); }
    public void moveDOWN(){ TopLeft.moveDOWN(); BottomRight.moveDOWN(); }
    public void moveLEFT(){ TopLeft.moveLEFT(); BottomRight.moveLEFT(); }
    public void moveRiGHT(){ TopLeft.moveRiGHT(); BottomRight.moveRiGHT(); }
}
