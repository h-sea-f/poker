package com.oocl.poker;

import org.junit.Assert;
import org.junit.Test;

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

    @Test
    public void should_return_play2_win_when_given_2H_2D_5S_9C_KD_and_3H_3D_4S_4C_KD() {
        PokerHands pokerHands = new PokerHands();
        String card1 = "2H 2D 5S 9C KD";
        String card2 = "3H 3D 4S 4C KD";
        String result = pokerHands.compare(card1, card2);
        Assert.assertEquals("play2 win", result);
    }

    @Test
    public void should_return_play2_win_when_given_2H_2D_3S_3C_KD_and_3H_3D_4S_4C_KD() {
        PokerHands pokerHands = new PokerHands();
        String card1 = "2H 2D 3S 3C KD";
        String card2 = "3H 3D 4S 4C KD";
        String result = pokerHands.compare(card1, card2);
        Assert.assertEquals("play2 win", result);
    }

    @Test
    public void should_return_It_ends_in_a_draw_when_given_2H_2D_5S_9C_KD_and_2H_2D_5S_9C_KD() {
        PokerHands pokerHands = new PokerHands();
        String card1 = "2H 2D 5S 9C KD";
        String card2 = "2H 2D 5S 9C KD";
        String result = pokerHands.compare(card1, card2);
        Assert.assertEquals("It ends in a draw", result);
    }

    @Test
    public void should_return_It_ends_in_a_draw_when_given_2H_2D_3S_3C_KD_and_2H_2D_3S_3C_KD() {
        PokerHands pokerHands = new PokerHands();
        String card1 = "2H 2D 3S 3C KD";
        String card2 = "2H 2D 3S 3C KD";
        String result = pokerHands.compare(card1, card2);
        Assert.assertEquals("It ends in a draw", result);
    }

    @Test
    public void should_return_play2_win_when_given_2H_2D_3S_3C_KD_and_2H_2D_3S_3C_AD() {
        PokerHands pokerHands = new PokerHands();
        String card1 = "2H 2D 3S 3C KD";
        String card2 = "2H 2D 3S 3C AD";
        String result = pokerHands.compare(card1, card2);
        Assert.assertEquals("play2 win", result);
    }

    @Test
    public void should_return_play2_win_when_given_2H_2D_3S_3C_KD_and_2H_2D_2S_3C_AD() {
        PokerHands pokerHands = new PokerHands();
        String card1 = "2H 2D 3S 3C KD";
        String card2 = "2H 2D 2S 3C AD";
        String result = pokerHands.compare(card1, card2);
        Assert.assertEquals("play2 win", result);
    }

    @Test
    public void should_return_play1_win_when_given_2H_2D_2S_3C_KD_and_2H_2D_2S_3C_KD() {
        PokerHands pokerHands = new PokerHands();
        String card1 = "4H 4D 4S 3C KD";
        String card2 = "2H 2D 2S 3C KD";
        String result = pokerHands.compare(card1, card2);
        Assert.assertEquals("play1 win", result);
    }

    @Test
    public void should_return_It_ends_in_a_draw_when_given_2H_2D_2S_3C_KD_and_2H_2D_2S_3C_KD() {
        PokerHands pokerHands = new PokerHands();
        String card1 = "2H 2D 2S 3C KD";
        String card2 = "2H 2D 2S 3C KD";
        String result = pokerHands.compare(card1, card2);
        Assert.assertEquals("It ends in a draw", result);
    }

    @Test
    public void should_return_play1_win_when_given_2H_2D_2S_3C_AD_and_2H_2D_2S_3C_KD() {
        PokerHands pokerHands = new PokerHands();
        String card1 = "2H 2D 2S 3C AD";
        String card2 = "2H 2D 2S 3C KD";
        String result = pokerHands.compare(card1, card2);
        Assert.assertEquals("play1 win", result);
    }

    @Test
    public void should_return_It_ends_in_a_draw_when_given_2H_3D_4S_5C_6D_and_2H_3D_4S_5C_6D() {
        PokerHands pokerHands = new PokerHands();
        String card1 = "2H 3D 4S 5C 6D";
        String card2 = "2H 3D 4S 5C 6D";
        String result = pokerHands.compare(card1, card2);
        Assert.assertEquals("It ends in a draw", result);
    }

    @Test
    public void should_return_play1_win_when_given_3H_4D_5S_6C_7D_and_2H_3D_4S_5C_6D() {
        PokerHands pokerHands = new PokerHands();
        String card1 = "3H 4D 5S 6C 7D";
        String card2 = "2H 3D 4S 5C 6D";
        String result = pokerHands.compare(card1, card2);
        Assert.assertEquals("play1 win", result);
    }

    @Test
    public void should_return_play1_win_when_given_3H_2H_5H_6H_7H_and_2H_3D_4S_5C_6D() {
        PokerHands pokerHands = new PokerHands();
        String card1 = "3H 2H 5H 6H 7H";
        String card2 = "2H 3D 4S 5C 6D";
        String result = pokerHands.compare(card1, card2);
        Assert.assertEquals("play1 win", result);
    }

    @Test
    public void should_return_It_ends_in_a_draw_when_given_3H_2H_5H_6H_7H_and_3H_2H_5H_6H_7H() {
        PokerHands pokerHands = new PokerHands();
        String card1 = "3H 2H 5H 6H 7H";
        String card2 = "3H 2H 5H 6H 7H";
        String result = pokerHands.compare(card1, card2);
        Assert.assertEquals("It ends in a draw", result);
    }

    @Test
    public void should_return_play1_win_when_given_3H_2H_5H_6H_8H_and_3H_2H_5H_6H_7H() {
        PokerHands pokerHands = new PokerHands();
        String card1 = "3H 2H 5H 6H 8H";
        String card2 = "3H 2H 5H 6H 7H";
        String result = pokerHands.compare(card1, card2);
        Assert.assertEquals("play1 win", result);
    }

    @Test
    public void should_return_play1_win_when_given_3H_3D_5S_5C_3D_and_3H_2H_5H_6H_7H() {
        PokerHands pokerHands = new PokerHands();
        String card1 = "3H 3D 5S 5C 3D";
        String card2 = "3H 2H 5H 6H 7H";
        String result = pokerHands.compare(card1, card2);
        Assert.assertEquals("play1 win", result);
    }

    @Test
    public void should_return_play1_win_when_given_4H_4D_5S_5C_4D_and_3H_3D_5S_5C_3D() {
        PokerHands pokerHands = new PokerHands();
        String card1 = "4H 4D 5S 5C 4D";
        String card2 = "3H 3D 5S 5C 3D";
        String result = pokerHands.compare(card1, card2);
        Assert.assertEquals("play1 win", result);
    }

    @Test
    public void should_return_play1_win_when_given_4H_4D_5S_5C_4D_and_3H_3D_4S_4C_3D() {
        PokerHands pokerHands = new PokerHands();
        String card1 = "4H 4D 5S 5C 4D";
        String card2 = "3H 3D 4S 4C 3D";
        String result = pokerHands.compare(card1, card2);
        Assert.assertEquals("play1 win", result);
    }

    @Test
    public void should_return_play1_win_when_given_3H_3D_3S_5C_3D_and_3H_3D_4S_4C_3D() {
        PokerHands pokerHands = new PokerHands();
        String card1 = "3H 3D 3S 5C 3D";
        String card2 = "3H 3D 4S 4C 3D";
        String result = pokerHands.compare(card1, card2);
        Assert.assertEquals("play1 win", result);
    }

    @Test
    public void should_return_play2_win_when_given_3H_3D_3S_5C_3D_and_4H_4D_4S_4C_3D() {
        PokerHands pokerHands = new PokerHands();
        String card1 = "3H 3D 3S 5C 3D";
        String card2 = "4H 4D 4S 4C 3D";
        String result = pokerHands.compare(card1, card2);
        Assert.assertEquals("play2 win", result);
    }

    @Test
    public void should_return_play2_win_when_given_3H_3D_3S_5C_3D_and_3H_3D_3S_4C_3D() {
        PokerHands pokerHands = new PokerHands();
        String card1 = "3H 3D 3S 5C 3D";
        String card2 = "3H 3D 3S 4C 3D";
        String result = pokerHands.compare(card1, card2);
        Assert.assertEquals("play1 win", result);
    }

    @Test
    public void should_return_It_ends_in_a_draw_when_given_3H_3D_3S_5C_3D_and_3H_3D_3S_5C_3D() {
        PokerHands pokerHands = new PokerHands();
        String card1 = "3H 3D 3S 5C 3D";
        String card2 = "3H 3D 3S 5C 3D";
        String result = pokerHands.compare(card1, card2);
        Assert.assertEquals("It ends in a draw", result);
    }

    @Test
    public void should_return_play1_win_when_given_3H_4H_5H_6H_7H_and_3H_3D_3S_4C_3D() {
        PokerHands pokerHands = new PokerHands();
        String card1 = "3H 4H 5H 6H 7H";
        String card2 = "3H 3D 3S 4C 3D";
        String result = pokerHands.compare(card1, card2);
        Assert.assertEquals("play1 win", result);
    }

    @Test
    public void should_return_play2_win_when_given_3H_4H_5H_6H_7H_and_4H_5H_6H_7H_8H() {
        PokerHands pokerHands = new PokerHands();
        String card1 = "3H 4H 5H 6H 7H";
        String card2 = "4H 5H 6H 7H 8H";
        String result = pokerHands.compare(card1, card2);
        Assert.assertEquals("play2 win", result);
    }

    @Test
    public void should_return_It_ends_in_a_draw_when_given_3H_4H_5H_6H_7H_and_3H_4H_5H_6H_7H() {
        PokerHands pokerHands = new PokerHands();
        String card1 = "3H 4H 5H 6H 7H";
        String card2 = "3H 4H 5H 6H 7H";
        String result = pokerHands.compare(card1, card2);
        Assert.assertEquals("It ends in a draw", result);
    }
}
