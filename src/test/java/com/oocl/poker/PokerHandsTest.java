package com.oocl.poker;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PokerHandsTest {
    @Test
    public void should_return_play2_win_when_given_2H_3H(){
        PokerHands pokerHands = new PokerHands();
        String card1 = "2H";
        String card2 = "3H";
        String result = pokerHands.compare(card1,card2);
        Assert.assertEquals(result,"play2 win");
    }

}
