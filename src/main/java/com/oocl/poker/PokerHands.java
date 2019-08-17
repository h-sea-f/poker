package com.oocl.poker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PokerHands {
    public String compare(String play1Card, String play2Card) {

        Cards play1CardList = constructCards(play1Card);
        Cards play2CardList = constructCards(play2Card);
        if (play1CardList.getLevel() == play2CardList.getLevel()) {
            for (int i = 0; i < play1CardList.getCards().size(); i++) {
                if (play1CardList.getCards().get(i).getPosition() > play2CardList.getCards().get(i).getPosition()){
                    return "play1 win";
                } else if (play1CardList.getCards().get(i).getPosition() < play2CardList.getCards().get(i).getPosition()){
                    return "play2 win";
                }
            }
        }
        return "It ends in a draw";
//        Card card1 = new Card(play1Card);
//        Card card2 = new Card(play2Card);
//        if (card1.getPosition() > card2.getPosition()) {
//            return "play1 win";
//        } else if (card1.getPosition() < card2.getPosition()) {
//            return "play2 win";
//        } else {
//            return "It ends in a draw";
//        }
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
