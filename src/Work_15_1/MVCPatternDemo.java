package task151;

public class MVCPatternDemo {
    public static void main(String[] args) {
        StudentController cont = new StudentController();
        cont.setStudentName("Бабиджон");
        cont.setStudentRollNo("Так и не понял что это");
        cont.updateView();
        Student stu = retriveStudentFromDatabase(cont);
        System.out.println("==========================================\nStudent from database:\nName: " + stu.getName()+"\nRollNo: "+stu.getRollNo());
    }
    public static Student retriveStudentFromDatabase(StudentController cont){
        Student student = new Student();
        student.setName(cont.getStudentName());
        student.setRollNo(cont.getStudentRollNo());
        return student;
    }
}
