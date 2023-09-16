package Work_6.Number_1;

public class Tester {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        // Создаем массив и выводим его
        for (int i = 0; i < 5; i++) {
            students[i] = new Student("Student - " + (int)(Math.random() * 128 ), (int)(Math.random() * 1024 ));
            System.out.println(students[i].toString());
        }
        System.out.print("\n\n\n");


    }
}
