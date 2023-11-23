package day04.package3;

import day04.package3.Card;

public class Main {
    public static void main(String[] args) {

        Card heart[] = new Card[13];
        for(int i=0; i<13 ; i++)
            heart[i] = new Card("Heart",i+1);

        Card clover[] = new Card[13];
        for(int i=0; i<13 ; i++)
            clover[i] = new Card("Clover",i+1);

        Card diamond[] = new Card[13];
        for(int i=0; i<13 ; i++)
            diamond[i] = new Card("Diamond",i+1);

        Card spade[] = new Card[13];
        for(int i=0; i<13 ; i++)
            spade[i] = new Card("Spade",i+1);

        for(int i=0; i<13 ; i++)
            System.out.println(heart[i].toString());


    }
}
