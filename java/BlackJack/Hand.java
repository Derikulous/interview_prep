package com.derik;

import java.util.ArrayList;

/**
 *
 * Create a hand of cards, initially with 2 elements
 * Get the size and sum total value of the cards in your hand
 *
 *
 */
public class Hand {
    ArrayList<Card> cards = new ArrayList<Card>(2);

    public void add(Card card){
        cards.add(card);
    }

    public String toString() {
        String cardsInHand = "";
        for(Card c : cards){
            cardsInHand += c.toString();
        }
        return cardsInHand;
    }

    public int size(){
        return cards.size();
    }

    private int computeMinValue(){
        int sum = 0;
        for(Card c : cards){
            sum += c.blackJackCardValue();
        }
        return sum;
    }

    private int computeNumberOfAces(){
        int aceCounter = 0;
        for(Card c : cards){
            if (c.getValue() == 1){
                aceCounter++;
            }
        }
        return aceCounter;
    }

    public int getBestSafeValue(){
        int numAces = computeNumberOfAces();
        int totalVal = computeMinValue();
        for (int i = 0; i < numAces; i++) {
            int potentialMinVal = totalVal + 10;
            if(potentialMinVal <= 21){
                totalVal = potentialMinVal;
            } else {
                return totalVal;
            }
        }
        return totalVal;
    }
}
