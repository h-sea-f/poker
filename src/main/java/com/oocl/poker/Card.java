package com.oocl.poker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Card {
    private char number;
    private char shape;
    private int position;
    private List<Character> order = new ArrayList<>(Arrays.asList('2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K', 'A'));

    public Card(String brand) {
        this.number = brand.charAt(0);
        this.shape = brand.charAt(1);
        this.position = order.indexOf(brand.charAt(0));
    }

    public int getPosition() {
        return position;
    }
}
