package com.derik;

/**
 * Player class is constructed from the name, money, and bet per hand.
 * The methods can add, subtract, and get the value of money per player,
 * while the toString method allows for better understanding of the players cash reserves.
 */
public class Player {
    private int money;
    private int betPerHand;
    private String nameOfPlayer;

    public Player(String nameOfPlayer, int money, int betPerHand){
        this.nameOfPlayer = nameOfPlayer;
        this.money = money;
        this.betPerHand = betPerHand;
    }

    public int getCash(){
        return this.money;
    }

    public void takeCash(){
        this.money -= this.betPerHand;
    }

    public void giveCash(){
        this.money += this.betPerHand;
    }

    public void giveBonusCash(){
        this.money += (this.betPerHand * 1.5);
    }

    public String toString(){
        return this.nameOfPlayer + " has $" + this.money/100 + " in chips.";
    }
}
