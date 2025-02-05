package AccountMenu.model;

public class Account {
	private String accountNumber;
	private String name;
	private double balance;
	private static double minBalance = 500.0;
	
	public Account(String accountNumber, String name, double balance){
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public String getName(){
		return name;
	}
	
	public String getAccountNumber(){
		return accountNumber;
	}
	
	public void credit(double amount){
		if(amount > 0){
			balance += amount;
			System.out.println("Amount Credited successfully");
			System.out.println("New Balance: " + balance);
		} else {
			System.out.println("Did not enter a valid amount");
		}
	}
	
	public void debit(double amount){
		if(amount > 0 && balance - amount >= minBalance){
			balance -= amount;
			System.out.println("Amount Debited successfully");
			System.out.println("New Balance: " + balance);
		} else if (balance - amount < minBalance){
			System.out.println("Not enough balance. Minimum balance of 500.0 should be maintained");
		} else {
			System.out.println("Enter a valid amount");
		}
	}
}
