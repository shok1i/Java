package Work_5.Number_1;

import java.util.Scanner;

public class MAIN{
    public static void main(String[] args) {
        recursive();
    }

    public static void recursive(){
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        if (x == 0) return;
        if (x % 2 != 0) System.out.print(x + " / ");
        recursive();
    }
}
