package Old_Work_3.Number_4;

public class Tester{
    public static void main(String[] args) {
        Movable point = new MovablePoint(10, 20, 5, 5);
        System.out.println(point.toString());
        point.moveUP();
        System.out.println(point.toString());
        point.moveRiGHT();
        System.out.println(point.toString());

        Movable circle = new MovableCircle(5, 5, 10, 10, 120);
        System.out.println(circle.toString());
        circle.moveDOWN();
        System.out.println(circle.toString());
        circle.moveLEFT();
        System.out.println(circle.toString());
    }
}
