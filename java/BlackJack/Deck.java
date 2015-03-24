package com.derik;

import java.util.ArrayList;

/**
 * A Deck class that is an array of 52 cards. The new deck is always constructed by making a new deck and shuffling.
 * The takeTopCard method is available on the deck, but removes that card from the deck.
 */
public class Deck {
    ArrayList<Card> deck = new ArrayList<Card>(52);

    public Deck(){
        this.reset();
        this.shuffle();
    }

    public void reset(){
        deck.clear();
        for (int i = 1; i < 14; i++) {
            deck.add(new Card(i, Card.Suit.DIAMOND));
            deck.add(new Card(i, Card.Suit.SPADE));
            deck.add(new Card(i, Card.Suit.HEART));
            deck.add(new Card(i, Card.Suit.CLUB));
        }
    }

    public void shuffle(){
    // Durstenfeld modified Fisher-Yates shuffle
        int n = deck.size();
        for (int i = 0; i < n - 1; i++) {
            int rand = i + (int) (Math.random() * (n - i));
            Card cardToSwap = deck.get(0);
            deck.set(i, deck.get(rand));
            deck.set(rand, cardToSwap);
        }
    }

    public int size(){
        return deck.size();
    }

    public String toString(){
        String deckContains = "";
        for(Card c : deck){
            deckContains += c.toString();
        }
        return deckContains;
    }

    public Card takeTopCard(){
        return deck.remove(0);
    }

    public Card whatIsTopCardValue(){
        return deck.get(0);
    }
}
