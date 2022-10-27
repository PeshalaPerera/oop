package com.oop.tutorial5.comparable;

public class BankAccount implements Comparable<BankAccount> {
    private final double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    /**
     * Compares two bank accounts.
     *
     * @param other the other BankAccount
     * @return 1 if this bank account has a greater balance than the other one,
     * -1 if this bank account is has a smaller balance than the other one,
     * and 0 if both bank accounts have the same balance
     */
    @Override
    public int compareTo(BankAccount other) {
        if (this.balance > other.balance)
            return 1;
        else if (this.balance == other.balance)
            return 0;
        else
            return -1;
    }
}
