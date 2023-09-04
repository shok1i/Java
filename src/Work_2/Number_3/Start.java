package Work_2.Number_3;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Tester tmp = new Tester();
        System.out.print("Введите количество кружков: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int i = 0; i < num; i++){
            System.out.println("Введите координаты точки x/y");
            double x = scan.nextInt(), y = scan.nextInt();
            System.out.print("Введите радиус круга: " );
            double r = scan.nextInt();
            tmp.addElement(x, y, r);
        }
        System.out.print("\n\n");
        tmp.OutPut();
    }
}
