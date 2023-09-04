package Work_2.Number_3;
import java.util.ArrayList;

public class Tester {
    private final ArrayList<Circle> arr = new ArrayList<>();
    private int NumElem = 0;
    public Tester(){ }
    public void addElement(double x_cord, double y_cord, double radius){
        Circle temp = new Circle(x_cord, y_cord, radius);
        arr.add(temp);
        NumElem++;
    }
    public void OutPut(){
        for (Circle index : arr)
            System.out.println(
                "Координаты точки x/y " + index.getDot().getX() + "/" + index.getDot().getY() + "\t" + "Радиус " + index.getRadius() + "\n");
    }
}
