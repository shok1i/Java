package Work_3.Number_5;

public class Tester{
    public static void main(String[] args) {
        Movable rectangle = new MovableRectangle(0, 0, 10, 10, 100, 50);
        System.out.println(rectangle.toString());
        rectangle.moveUP();
        System.out.println(rectangle.toString());
        rectangle.moveRiGHT();
        System.out.println(rectangle.toString());
        rectangle.moveDOWN();
        System.out.println(rectangle.toString());
        rectangle.moveLEFT();
        System.out.println(rectangle.toString());
    }
}
