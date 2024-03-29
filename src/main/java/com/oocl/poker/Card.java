package com.oocl.poker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Card implements Comparable<Card> {
    private char number;
    private char shape;
    private int position;
    private List<Character> order = new ArrayList<>(Arrays.asList('2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K', 'A'));

    public Card(String brand) {
        this.number = brand.charAt(0);
        this.shape = brand.charAt(1);
        this.position = order.indexOf(brand.charAt(0));
    }

    public char getNumber() {
        return number;
    }

    public char getShape() {
        return shape;
    }

    public int getPosition() {
        return position;
    }

    @Override
    public int compareTo(Card card) {
        return this.position-card.getPosition();
    }
}
