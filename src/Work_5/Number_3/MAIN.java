package Work_5.Number_3;

import java.util.Scanner;

public class MAIN{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        recursive(x);
    }

    public static void recursive(int x){
        if (x < 10) System.out.println(x);
        else {
            recursive(x /= 10);
            System.out.println(x % 10);
        }
    }
}
