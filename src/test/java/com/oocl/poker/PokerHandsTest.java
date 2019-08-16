package com.oocl.poker;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PokerHandsTest {
    @Test
    public void should_return_play2_win_when_given_2H_3H(){
        PokerHands pokerHands = new PokerHands();
        Card card1 = new Card("2","H",1);
        Card card2 = new Card("3","H",2);
        List<Card> play1 = new ArrayList<>();
        play1.add(card1);
        List<Card> play2 = new ArrayList<>();
        play2.add(card2);

        String result = pokerHands.compare(play1, play2);
        Assert.assertEquals(result,"play2 win");
    }

    @Test
    public void should_return_play2_win_

}
