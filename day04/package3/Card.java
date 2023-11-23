package day04.package3;

public class Card {

    private int number;
    private String symbol;
    private int width;
    private int height;

    public Card(String symbol,int number) {
        this.number = number;
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "Card{" +
                "symbol=" + symbol +
                ", number='" + number + '\'' +
                '}';
    }
}
