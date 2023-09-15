package Work_5.Number_2;

import java.util.Scanner;

public class MAIN{
    public static void main(String[] args) {
        recursive();
    }

    public static void recursive(){
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        if (x == 0) return;
        System.out.print(x + " / ");
        inp.nextInt();
        recursive();
    }
}
