package com.oocl.poker;

import java.util.Collections;
import java.util.List;

public class Cards {
    private List<Card> cards;
    private int level;

    public Cards(List<Card> cards) {
        this.cards = cards;
        Collections.sort(this.cards);
        this.level = this.calculationLevel(this.cards);
    }

    private int calculationLevel(List<Card> cards) {
        boolean isHaveSame = false;
        int sameNumber = 0;
        for (int i = 0; i < this.cards.size(); i++) {
            for (int j = i; j < this.cards.size(); j++) {
                if (i != j) {
                    if (this.cards.get(i).getPosition() == this.cards.get(j).getPosition()) {
                        isHaveSame = true;
                        sameNumber++;
                    }
                }
            }
        }
        if (!isHaveSame) {
            return 0;
        } else {
            System.out.println(sameNumber);
            return sameNumber;
        }
    }

    public List<Card> getCards() {
        return cards;
    }

    public int getLevel() {
        return level;
    }
}
