package application;

import java.util.Locale;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas sera digitadas? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		int[] vect = new int [n]; 
		String[] name = new String[n];
		int[] age = new int[n];
		double[] heigth = new double[n];
	
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa ");
			System.out.print("Nome: ");
			name[i] = sc.nextLine();
			System.out.print("Idade: ");
			age[i] = sc.nextInt();
			System.out.print("Altura: ");
			heigth[i] = sc.nextDouble();
			sc.nextLine();
		}
		
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += heigth[i];
		}
		double avg = sum / n;
		System.out.println();
		System.out.printf("Altura média: %.2f%n", avg);
		
		
		
		int count = 0;
		for (int i = 0; i < vect.length; i++) {
			if (age[i] < 16) {
				count += 1;
			}
		}
		
		double percent = count * 100 / n ;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);
		
		for (int i = 0; i < vect.length; i++) {
			if (age[i] < 16) {
				System.out.println(name[i]);
			}
		}
		
		
		sc.next();
	}

}
