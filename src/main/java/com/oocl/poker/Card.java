package com.oocl.poker;

public class Card {
    private String number;
    private String shape;
    private int position;

    public Card(String number, String shape, int position) {
        this.number = number;
        this.shape = shape;
        this.position = position;
    }

    public int getPosition() {
        return position;
    }
}
