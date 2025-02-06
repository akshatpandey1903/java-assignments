//package com.aurionpro.test;
package BalanceSort.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

//import com.aurionpro.model.SortedBalance;

import BalanceSort.model.SortedBalance;

public class SortedBalanceTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        List<SortedBalance> accounts = new ArrayList<>();

        System.out.print("Enter number of accounts: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++){
            System.out.println("\nEnter details for Account " + (i + 1));
            System.out.print("Account Number: ");
            String accNumber = scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Balance: ");
            double balance = scanner.nextDouble();
            scanner.nextLine();

            accounts.add(new SortedBalance(accNumber, name, balance));
        }
        
        Collections.sort(accounts, new Comparator<SortedBalance>() {
        	public int compare(SortedBalance acc1, SortedBalance acc2) {
        		return Double.compare(acc1.getBalance(), acc2.getBalance());
        	}
        });

        System.out.println("\nAccounts sorted by balance:");
        for (SortedBalance acc : accounts) {
            acc.display();
        }

        scanner.close();
	}

}
