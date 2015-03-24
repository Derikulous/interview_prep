package com.derik;

/**
 * Creates a Card class constructed with a value and a suit
 * The toString method has been overwritten to provide the card value and suit
 */

public class Card {
    public enum Suit {DIAMOND, HEART, SPADE, CLUB};

    private int valueOfCard = 0;
    private Suit suit;

    public Card(int valueOfCard, Suit suit){
        this.valueOfCard = valueOfCard;
        this.suit = suit;
    }

    public int getValue(){
        return this.valueOfCard;
    }

    public int blackJackCardValue(){
        if (valueOfCard > 10){
            return 10;
        }
        return valueOfCard;
    }

    public String toString(){
        return "Card (" + this.valueOfCard + ") of " + this.suit + " ";
    }
}
