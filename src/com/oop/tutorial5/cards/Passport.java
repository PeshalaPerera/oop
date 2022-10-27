package com.oop.tutorial5.cards;

public class Passport extends Card {
    private String birthLocation;
    private int expirationYear;

    @Override
    public boolean isExpired() {
        return false;
    }

    @Override
    public String format() {
        return "birthLocation: " + birthLocation + " expirationYear: " + expirationYear;
    }
}
