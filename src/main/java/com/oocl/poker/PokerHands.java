package com.oocl.poker;

import java.util.List;

public class PokerHands {
    public String compare(String play1Card, String play2Card) {
        Card card1 = new Card(play1Card);
        Card card2 = new Card(play2Card);
        if (card1.getPosition() > card2.getPosition()) {
            return "play1 win";
        } else if (card1.getPosition() < card2.getPosition()) {
            return "play2 win";
        } else {
            return "It ends in a draw";
        }
    }
}
