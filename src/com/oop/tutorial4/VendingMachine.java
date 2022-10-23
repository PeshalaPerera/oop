package com.oop.tutorial4;

public class VendingMachine implements IVendingMachine {
    private int cans;
    private int tokens;

    public VendingMachine() {
        this.cans = 10;
        this.tokens = 0;
    }

    public VendingMachine(int cans) {
        this.cans = cans;
        this.tokens = 0;
    }

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