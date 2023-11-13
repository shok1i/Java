package task152;

public class MVCPatternDemo {
    public static void main(String[] args) {
        EmployeeContoller cont = new EmployeeContoller();
        cont.setSalary(1200.00);
        cont.updateView();
    }
}
