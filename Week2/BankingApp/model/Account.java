//package com.aurionpro.model;
package BankingApp.model;

import java.util.Random;

public class Account {
    private String accountNumber;
    private String name;
    protected double balance;

    public Account(String name, double balance) {
        this.name = name;
        this.accountNumber = generateAccountNumber();
        this.balance = balance;
    }

    private String generateAccountNumber() {
        Random rand = new Random();
        return "AC" + (rand.nextInt(9000) + 1000);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void credit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Credited Successfully!");
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Invalid amount!");
        }
    }
    public void debit(double amount){}
}
