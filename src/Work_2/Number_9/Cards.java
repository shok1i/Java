package Work_2.Number_9;

public class Cards {
    private char Suit;
    private char Dignity;

    Cards(char suit, char dignity) {
        Suit = suit;
        Dignity = dignity;
    }

    public char getDignity() {
        return Dignity;
    }

    public char getSuit() {
        return Suit;
    }
}
