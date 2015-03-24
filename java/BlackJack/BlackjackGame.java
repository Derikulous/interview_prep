package com.derik;

/**
 * This BlackJackGame contains the logic for playing BlackJack. Captain Jack Sparrow, sailing the stormy seas.
 */
public class BlackjackGame {
    public void play(Player p){
        Deck deck = new Deck();
        Hand hand = new Hand();
        while(p.getCash() > 0){
            for (int i = 0; i < deck.size(); i++) {
                if (hand.getBestSafeValue() == 21 && hand.size() == 2){
                    System.out.println("Blackjack! The payout is 1.5x");
                    p.giveBonusCash();
                    return;
                } else if(hand.getBestSafeValue() < 21){
                    hand.add(deck.takeTopCard());
                    hand.getBestSafeValue();
                    System.out.println("Not yet 21. Hit.");
                } else if (hand.getBestSafeValue() == 21){
                    System.out.println("You got blackjack. Here's payout");
                    p.giveCash();
                    System.out.println(p.getCash());
                    return;
                } else if (hand.getBestSafeValue() > 21){
                    System.out.println("You busted.");
                    p.takeCash();
                    return;
                }
                System.out.println(hand.getBestSafeValue());

            }
        }
    }
}
