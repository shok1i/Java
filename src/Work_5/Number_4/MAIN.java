package Work_5.Number_4;

import java.util.Scanner;

public class MAIN{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        recursive(x);
    }

    public static void recursive(int x){
        System.out.println(x % 10);
        if (x / 10 != 0) recursive(x / 10);
        return;
    }
}
