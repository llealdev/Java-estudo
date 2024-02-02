package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		CurrencyConverter.dollar = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		CurrencyConverter.dollars = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reias = %.2f%n", CurrencyConverter.converter() );
		
		
		
		
		sc.close();

	}

}
