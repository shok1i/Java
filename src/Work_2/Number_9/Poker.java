package Work_2.Number_9;

import java.util.ArrayList;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        String suit = "♤♡♧♢";
        String[] dignity = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "В", "Д", "К", "Т"};

        CardHolder cardHolder = new CardHolder();


        for (int i = 0; i < suit.length(); i++){
            for (int j = 0; j < dignity.length; j++){
                Cards cards = new Cards((suit.charAt(i)), dignity[j]);
                cardHolder.addCard(cards);
            }
        }

        ArrayList<Player> player = new ArrayList<>();

        System.out.print("Введите количество игроков максимально количество игроков 10: ");
        Scanner scan = new Scanner(System.in);
        int numberPlayers = scan.nextInt();
        for (int i = 0; i < numberPlayers; i++){
            Player tmp = new Player();
            tmp.takeCard(cardHolder);
            player.add(tmp);
        }

        Croupier croupier = new Croupier();
        croupier.takeCard(cardHolder);

        System.out.println("Карты у крупье:");
        System.out.println(croupier.ToStr());

        System.out.println("Карты у игроков:");
        for (Player index : player){
            System.out.println(index.ToStr());
        }

    }

}