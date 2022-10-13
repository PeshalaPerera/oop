package com.oop.tutorial3;

public class VendingMachine implements IVendingMachine {
    private int cans;
    private int tokens;

    @Override
    public void fillUp(int cans) {
        this.cans += cans;
    }

    @Override
    public void insertToken() {
        this.tokens += 1;
        this.cans -= 1;
    }

    @Override
    public int getCanCount() {
        return this.cans;
    }

    @Override
    public int getTokenCount() {
        return this.tokens;
    }
}