package com.oocl.poker;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PokerHandsTest {
    @Test
    public void should_return_play2_win_when_given_2H_3H() {
        PokerHands pokerHands = new PokerHands();
        String card1 = "2H";
        String card2 = "3H";
        String result = pokerHands.compare(card1, card2);
        Assert.assertEquals("play2 win", result);
    }

    @Test
    public void should_return_It_ends_in_a_draw_when_given_2H_2H() {
        PokerHands pokerHands = new PokerHands();
        String card1 = "2H";
        String card2 = "2H";
        String result = pokerHands.compare(card1, card2);
        Assert.assertEquals("It ends in a draw", result);
    }

    @Test
    public void should_return_play2_win_when_given_2H_3D_5S_9C_KD_and_2H_3D_5S_9C_AD() {
        PokerHands pokerHands = new PokerHands();
        String card1 = "2H 3D 5S 9C KD";
        String card2 = "2H 3D 5S 9C AD";
        String result = pokerHands.compare(card1, card2);
        Assert.assertEquals("play2 win", result);
    }

    @Test
    public void should_return_It_ends_in_a_draw_when_given_2H_3D_5S_9C_KD_and_2H_3D_5S_9C_KD() {
        PokerHands pokerHands = new PokerHands();
        String card1 = "2H 3D 5S 9C KD";
        String card2 = "2H 3D 5S 9C KD";
        String result = pokerHands.compare(card1, card2);
        Assert.assertEquals("It ends in a draw", result);
    }

    @Test
    public void should_return_play2_win_when_given_2H_3D_5S_9C_KD_and_2H_2D_5S_9C_KD() {
        PokerHands pokerHands = new PokerHands();
        String card1 = "2H 3D 5S 9C KD";
        String card2 = "2H 2D 5S 9C KD";
        String result = pokerHands.compare(card1, card2);
        Assert.assertEquals("play2 win", result);
    }

    @Test
    public void should_return_play2_win_when_given_2H_2D_5S_9C_KD_and_3H_3D_5S_9C_KD() {
        PokerHands pokerHands = new PokerHands();
        String card1 = "2H 2D 5S 9C KD";
        String card2 = "3H 3D 5S 9C KD";
        String result = pokerHands.compare(card1, card2);
        Assert.assertEquals("play2 win", result);
    }
}
