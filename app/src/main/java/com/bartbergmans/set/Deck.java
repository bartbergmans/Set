package com.bartbergmans.set;


import java.util.ArrayList;
import java.util.List;

public class Deck {

    private List<Card> mSet = new ArrayList<>();

    void getDeck() {
        // Set!
        Card card1 = new Card();
        card1.setFill(Fill.DOTTED);
        card1.setShape(Shape.CURL);
        card1.setColor(Color.GREEN);
        card1.setAmount(Amount.DUO);
        mSet.add(card1);

        Card card2 = new Card();
        card2.setFill(Fill.OPEN);
        card2.setShape(Shape.CURL);
        card2.setColor(Color.GREEN);
        card2.setAmount(Amount.DUO);
        mSet.add(card2);

        Card card3 = new Card();
        card3.setFill(Fill.DOTTED);
        card3.setShape(Shape.CURL);
        card3.setColor(Color.GREEN);
        card3.setAmount(Amount.DUO);
        mSet.add(card3);

        isSet(mSet);
        mSet.clear();

        // No set!
        Card card4 = new Card();
        card4.setFill(Fill.DOTTED);
        card4.setShape(Shape.CURL);
        card4.setColor(Color.GREEN);
        card4.setAmount(Amount.DUO);
        mSet.add(card4);

        Card card5 = new Card();
        card5.setFill(Fill.DOTTED);
        card5.setShape(Shape.CURL);
        card5.setColor(Color.BLUE);
        card5.setAmount(Amount.DUO);
        mSet.add(card5);

        Card card6 = new Card();
        card6.setFill(Fill.OPEN);
        card6.setShape(Shape.CURL);
        card6.setColor(Color.GREEN);
        card6.setAmount(Amount.DUO);
        mSet.add(card6);

        isSet(mSet);
        mSet.clear();
    }

    void isSet(List<Card> set) {
    }
}
