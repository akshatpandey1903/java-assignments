//package com.aurionpro.model;

package BankingApp.model;   

public class SavingsAccount extends Account {
    private static double minimumBalance = 500.0;
    private double interestRate;

    public SavingsAccount(String name, double balance, double interestRate) {
        super(name, balance); 
        this.interestRate = interestRate;
    }
    
    public static double getMinimumBalance(){
    	return minimumBalance;
    }

    public void debit(double amount) {
        if (amount > 0 && balance - amount >= minimumBalance) {
            balance -= amount;
            System.out.println("Amount Debited Successfully!");
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance! Minimum balance of " + minimumBalance + " must be maintained.");
        }
    }
}
