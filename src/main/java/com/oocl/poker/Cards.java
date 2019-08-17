package com.oocl.poker;

import java.util.ArrayList;
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
        boolean isOrder = true;
        boolean isSameShape = true;
        int sameNumber = 0;
        int maxSameNumber = 0;
        for (int i = 0; i < this.cards.size(); i++) {
            int forMaxSameNumber = 0;
            if (i > 0) {
                if (this.cards.get(i).getPosition() != this.cards.get(i - 1).getPosition() + 1) {
                    isOrder = false;
                }
                if (this.cards.get(i).getShape() != this.cards.get(i - 1).getShape()) {
                    isSameShape = false;
                }
            }
            for (int j = i; j < this.cards.size(); j++) {
                if (i != j) {
                    if (this.cards.get(i).getPosition() == this.cards.get(j).getPosition()) {
                        forMaxSameNumber++;
                        isHaveSame = true;
                        sameNumber++;
                    }
                }
            }
            forMaxSameNumber++;
            if (forMaxSameNumber > maxSameNumber) {
                maxSameNumber = forMaxSameNumber;
            }
        }
        if (!isHaveSame) {
            if (this.cards.size() == 1) {
                return 0;
            }
            if (isOrder && isSameShape) {
                return 8;
            }
            if (isSameShape) {
                return 5;
            }
            if (!isOrder) {
                return 0;
            } else {
                return 4;
            }
        } else {
            if (maxSameNumber > sameNumber) {
                if (maxSameNumber == 3) {
                    return 3;
                }
            }
            if (maxSameNumber == 3 && sameNumber == 4) {
                return 6;
            }
            if (maxSameNumber == 4) {
                return 7;
            }
            return sameNumber;
        }
    }

    public List<Card> getSameCardList() {
        List<Card> result = new ArrayList<>();
        for (int i = 0; i < this.cards.size(); i++) {
            for (int j = i; j < this.cards.size(); j++) {
                if (i != j) {
                    if (this.cards.get(i).getPosition() == this.cards.get(j).getPosition()) {
                        if (!result.contains(this.cards.get(i))) {
                            result.add(this.cards.get(i));
                        }
                    }
                }
            }
        }
        return result;
    }

    public Card getPointTimesCard(int pointTimes) {
        for (int i = 0; i < this.cards.size(); i++) {
            int times = 0;
            for (int j = i; j < this.cards.size(); j++) {
                if (this.cards.get(i).getPosition() == this.cards.get(j).getPosition()) {
                    times++;
                }
            }
            if (times == pointTimes) {
                return this.cards.get(i);
            }
        }
        return null;
    }

    public List<Card> getCards() {
        return cards;
    }

    public int getLevel() {
        return level;
    }
}
