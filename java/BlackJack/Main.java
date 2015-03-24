package com.derik;

public class Main {

    public static void main(String[] args) {
        //initial hand
        Player chris = new Player("Chris",10000, 1000);
        BlackjackGame bj = new BlackjackGame();
        bj.play(chris);
    }
}
