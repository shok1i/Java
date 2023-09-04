package Work_2.Number_8;

public class Stroks {
    public static void main(String[] args) {
        String[]  DoubleFuckArray = {"Pipi", "Pupu",  "PiiiPii", "PuuPuu", "PiiPuu", "123", "312"};

        for (int i = 0; i < DoubleFuckArray.length / 2; i++){

            String tmp_1 = DoubleFuckArray[i];
            String tmp_2 = DoubleFuckArray[DoubleFuckArray.length - 1 - i];

            DoubleFuckArray[DoubleFuckArray.length - 1] = tmp_1;
            DoubleFuckArray[i] = tmp_2;
        }

        for (String index : DoubleFuckArray)
            System.out.println(index);
    }
}
