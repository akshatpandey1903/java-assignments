package test;

import model.BankAccount;

import java.util.*;
import java.util.stream.Collectors;

public class BankAccountTest {
    public static void main(String[] args) {
        List<BankAccount> accounts = Arrays.asList(
                new BankAccount(101, "Alice", 5000.0),
                new BankAccount(102, "Bob", 7000.0),
                new BankAccount(103, "Charlie", 3000.0),
                new BankAccount(104, "Alexander", 10000.0),
                new BankAccount(105, "Davidson", 2000.0)
        );

        // a. Show Account details of account with minimum balance
        accounts.stream().min(Comparator.comparingDouble(BankAccount::getBalance))
                .ifPresent(acc -> System.out.println("Account with Minimum Balance: " + acc));

        // b. Show Account details of account with maximum balance
        accounts.stream().max(Comparator.comparingDouble(BankAccount::getBalance))
                .ifPresent(acc -> System.out.println("Account with Maximum Balance: " + acc));

        // c. Show names greater than 6 characters
        System.out.println("Accounts with names > 6 characters:");
        accounts.stream()
                .filter(acc -> acc.getAccountHolderName().length() > 6)
                .map(BankAccount::getAccountHolderName)
                .forEach(System.out::println);

        // d. Find total balance of all accounts
        double totalBalance = accounts.stream()
                .mapToDouble(BankAccount::getBalance)
                .sum();
        System.out.println("Total Balance in all accounts: " + totalBalance);
    }
}

