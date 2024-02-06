package entities;

public class Bank {
	
	private int account;
	private String name;
	private double balance = 0 ;
	
	public int getAccount() {
		return account;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName ( String name ) {
		this.name = name; 
	}
	
	public Bank (int account, String name, double balance) {
		this.account = account;
		this.name = name;
		this.balance = balance;
	}
	
	
	public Bank (int account, String name) {
		this.account = account;
		this.name = name;
		
	}
	
	public double totalInAccount() {
		return balance;
	}
	
	public void depositInAccount(double value) {
		 this.balance += value;
	}
	
	public void lootInAccount(double value) {
		this.balance -= value;
		this.balance -= 5.00;
	}
	
	public String toString() {
		return "Account " + account + ", Holder : " + name + ", Balance : $ " + String.format("%.2f", totalInAccount());
	}

}
