package com.oocl.poker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PokerHands {
    public String compare(String play1Card, String play2Card) {
        Cards play1CardList = constructCards(play1Card);
        Cards play2CardList = constructCards(play2Card);
        if (play1CardList.getLevel() == play2CardList.getLevel() && play1CardList.getLevel() == 0) {
            return level0Compare(play1CardList, play2CardList);
        }

        if (play1CardList.getLevel() == play2CardList.getLevel() && play1CardList.getLevel() == 1) {
            return level1Compare(play1CardList, play2CardList);
        }

        if (play1CardList.getLevel() == play2CardList.getLevel() && play1CardList.getLevel() == 2) {
            return level2Compare(play1CardList, play2CardList);
        }

        if (play1CardList.getLevel() == play2CardList.getLevel() && play1CardList.getLevel() == 3) {
            return level3Compare(play1CardList, play2CardList);
        }

        if (play1CardList.getLevel() == play2CardList.getLevel() && play1CardList.getLevel() == 4) {
            return level0Compare(play1CardList,play2CardList);
        }

        if (play1CardList.getLevel() == play2CardList.getLevel() && play1CardList.getLevel() == 5) {
            return level0Compare(play1CardList,play2CardList);
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

    private String level0Compare(Cards play1CardList, Cards play2CardList) {
        for (int i = play1CardList.getCards().size() - 1; i >= 0; i--) {
            if (play1CardList.getCards().get(i).getPosition() > play2CardList.getCards().get(i).getPosition()) {
                return "play1 win";
            } else if (play1CardList.getCards().get(i).getPosition() < play2CardList.getCards().get(i).getPosition()) {
                return "play2 win";
            }
        }
        return "It ends in a draw";
    }

    private String level1Compare(Cards play1CardList, Cards play2CardList) {
        for (int i = play1CardList.getSameCardList().size() - 1; i >= 0; i--) {
            if (play1CardList.getSameCardList().get(i).getPosition() > play2CardList.getSameCardList().get(i).getPosition()) {
                return "play1 win";
            } else if (play1CardList.getSameCardList().get(i).getPosition() < play2CardList.getSameCardList().get(i).getPosition()) {
                return "play2 win";
            }
        }
        return level0Compare(play1CardList,play2CardList);
    }

    private String level2Compare(Cards play1CardList, Cards play2CardList) {
        return level1Compare(play1CardList, play2CardList);
    }

    private String level3Compare(Cards play1CardList, Cards play2CardList){
        return level1Compare(play1CardList,play2CardList);
    }
}
