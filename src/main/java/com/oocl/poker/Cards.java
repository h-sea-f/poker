package com.oocl.poker;

import java.util.Collections;
import java.util.List;

public class Cards {
    private List<Card> cards;
    private int level;

    public Cards(List<Card> cards) {
        this.cards = cards;
        Collections.sort(this.cards);
        this.level = calculationLevel(this.cards);
    }

    private int calculationLevel(List<Card> cards) {
        boolean isHaveSame = false;
        for (int i = 0; i < this.cards.size(); i++) {
            for (int j = 0; j < this.cards.size(); j++) {
                if (i != j) {
                    if (this.cards.get(i) == this.cards.get(j)) {
                        isHaveSame = true;
                    }
                }
            }
        }
        if (!isHaveSame) {
            return 1;
        } else {
            return 2;
        }
    }

    public List<Card> getCards() {
        return cards;
    }

    public int getLevel() {
        return level;
    }
}
