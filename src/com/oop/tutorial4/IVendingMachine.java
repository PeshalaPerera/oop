package com.oop.tutorial4;

public interface IVendingMachine {
    void fillUp(int cans);

    void insertToken();

    int getCanCount();

    int getTokenCount();
}
