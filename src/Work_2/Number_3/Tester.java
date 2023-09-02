package Work_2.Number_3;
import java.util.ArrayList;

public class Tester {
    private ArrayList<Circle> arr = new ArrayList<>();

    // private Circle[] arr = new Circle[256];
    private int NumElem = 0;
    public Tester(){ }

    public void addElement(double x_cord, double y_cord, double radius){
        Circle temp = new Circle(x_cord, y_cord, radius);
        // arr[NumElem] = temp;
        arr.add(temp);
        NumElem++;
    }

    public void OutPut(){
        for (Circle index : arr)
            System.out.println(
                "Координаты точки x/y " + index.getDot().getX() + "/" + index.getDot().getY() + "\t" + "Радиус " + index.getRadius() + "\n" +
                "Периметр\t" + index.CirclePerimeter() + "\n" +
                "Площадь\t\t" + index.CircleArea() + "\n" +
                "Длина\t\t" + index.CircleLength() );
    }
}
