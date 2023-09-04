package Work_2.Number_3;
import java.util.ArrayList;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        ArrayList<Circle> arr = new ArrayList<>();
        int NumElem = 0;

        System.out.print("Введите количество кружков: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int i = 0; i < num; i++) {
            NumElem++;
            System.out.println("Введите координаты точки x/y");
            double x = scan.nextInt(), y = scan.nextInt();
            System.out.print("Введите радиус круга: ");
            double r = scan.nextInt();
            Circle tmp = new Circle(x, y, r);
            arr.add(tmp);
        }

        for (Circle index : arr)
            System.out.println("Координаты точки x/y " + index.getDot().getX() + "/" + index.getDot().getY() + "\t" + "Радиус " + index.getRadius());


    }
}