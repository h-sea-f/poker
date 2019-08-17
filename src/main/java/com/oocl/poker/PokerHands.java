package com.oocl.poker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PokerHands {
    public String compare(String play1Card, String play2Card) {
        Cards play1CardList = constructCards(play1Card);
        Cards play2CardList = constructCards(play2Card);
        if (play1CardList.getLevel() == play2CardList.getLevel()) {
            for (int i = play1CardList.getCards().size() - 1; i >= 0; i--) {
                if (play1CardList.getCards().get(i).getPosition() > play2CardList.getCards().get(i).getPosition()) {
                    return "play1 win";
                } else if (play1CardList.getCards().get(i).getPosition() < play2CardList.getCards().get(i).getPosition()) {
                    return "play2 win";
                }
            }
        }
        if (play1CardList.getLevel() > play2CardList.getLevel()) {
            return "play1 win";
        }
        if (play1CardList.getLevel() < play2CardList.getLevel()) {
            return "play2 win";
        }
        return "It ends in a draw";
    }

    private Cards constructCards(String handCards) {
        String[] cards = handCards.split(" ");
        List<Card> cardList = new ArrayList<>();
        for (int i = 0; i < cards.length; i++) {
            Card card = new Card(cards[i]);
            cardList.add(card);
        }
        return new Cards(cardList);
    }
}
