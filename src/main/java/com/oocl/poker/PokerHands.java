package com.oocl.poker;

import java.util.List;

public class PokerHands {
    public String compare(List<Card> play1, List<Card> play2) {
        if(play1.get(0).getPosition()>play2.get(0).getPosition()) {
            return "play1 win";
        }else {
            return "play2 win";
        }
    }
}
