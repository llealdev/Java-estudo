package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] vect = new Rent[10];
		
		System.out.print("How many eooms will bw rented? ");
		int rooms = sc.nextInt();
		sc.nextLine();
		
		
		for (int i = 1; i <= rooms; i++) {
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			System.out.println();
			sc.nextLine();
			
			vect[room] = new Rent(name, email);
		}
		
		System.out.println("Busy rooms: ");
		for (int i = 0; i < 10; i++) {
			if(vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		
		
		sc.close();

	}

}
