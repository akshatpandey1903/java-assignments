//package com.aurionpro.model;

package BankingApp.model;

public class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String name, double balance, double overdraftLimit) {
        super(name, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void debit(double amount) {
        if (amount > 0 && (balance - amount) >= -overdraftLimit) {
            balance -= amount;
            System.out.println("Amount Debited Successfully!");
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Overdraft limit exceeded! Maximum overdraft allowed: " + overdraftLimit);
        }
    }
}
