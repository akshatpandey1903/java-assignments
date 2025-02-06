//package com.aurionpro.model;
package BalanceSort.model;

public class SortedBalance {
	private String accountNumber;
    private String name;
    private double balance;

    public SortedBalance(String accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public double getBalance(){ 
    	return balance; 
    }

    public void display() {
        System.out.println("Account No: " + accountNumber + ", Name: " + name + ", Balance: " + balance);
    }

}
