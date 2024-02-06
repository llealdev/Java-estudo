package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bank;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter account number : ");
		int account = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Enter account holder: ");
		String name = sc.nextLine();
		
		Bank bank = new Bank(account, name);
		
	    System.out.print("Is there na initial deposit (y/n)? ");
		char initialDeposit = sc.next().charAt(0);
		
		if (initialDeposit == 'y') {
			System.out.print("Enter initial deposit value : $ " );
			double deposit = sc.nextDouble();
			bank.depositInAccount(deposit);
		}
		
		System.out.println();
		System.out.println("Account data : ");
		System.out.print(bank);
		System.out.println();
		
		System.out.println();
		System.out.print("Enter a deposit value: $ ");
		double value = sc.nextDouble();
		bank.depositInAccount(value);
		System.out.println("Updated data : ");
		System.out.print(bank);
		System.out.println();
		
		System.out.println();
		System.out.print("Enter a withdraw value: $ ");
		value = sc.nextDouble();
		bank.lootInAccount(value);
		System.out.println("Updated data : ");
		System.out.print(bank);
		
		
		sc.close();

	}

}
