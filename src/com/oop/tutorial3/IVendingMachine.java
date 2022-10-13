package com.oop.tutorial3;

public interface IVendingMachine {
    void fillUp(int cans);

    void insertToken();

    int getCanCount();

    int getTokenCount();
}
