package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.AccountCompany;
import entities.AccountIndividual;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Account> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++ ) {
			System.out.println("Tax payer #" + (i+1) + " data");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual icome: ");
			Double iYear = sc.nextDouble();
			if(ch == 'i' ) {
				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				list.add(new AccountIndividual(name, iYear, healthExpenditures));
			}
			else if(ch == 'c' ) {
				System.out.print("Number of employees: ");
				int employee = sc.nextInt();
				list.add(new AccountCompany(name, iYear, employee));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID: ");
		double sum = 0.0;
		for(Account acc: list) {
			sum += acc.tax();
			System.out.println(acc.getName() + ": $ " + String.format("%.2f", acc.tax()));
		}
		
		System.out.println();
		System.out.print("TOTAL TAXES : " + String.format("%.2f", sum));
		
		
		sc.close();

	}

}
