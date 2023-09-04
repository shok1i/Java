package Work_2.Number_9;

public class Poker {
    public static void main(String[] args) {
        String suit = "♤♡♧♢";
        String dignity = "123456789ВДКТ";

        CardHolder cardHolder = new CardHolder();


        for (int i = 0; i < suit.length(); i++){
            for (int j = 0; j < dignity.length(); j++){
                Cards cards = new Cards((suit.charAt(i)), dignity.charAt(j));
                cardHolder.addCard(cards);
            }
        }

        Player[] player = new Player[2];
        player[0].takeCard(cardHolder);
        player[1].takeCard(cardHolder);

        Croupier croupier = new Croupier();
        croupier.takeCard(cardHolder);

    }

}