package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numero você vai digitar? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			
		}
		
		System.out.print("Valores = " );
		for (int i = 0; i < vect.length; i++) {
			System.out.print( vect[i] + " ");
		}
		
		System.out.println();
		
		double soma = 0.0;
		for (int i = 0; i < vect.length; i++) {
			soma += vect[i];
		}
		
		System.out.print("Soma = " + soma);
		System.out.println();
		
	    double avg = soma / n; 
	    
	    System.out.print("Media = " + avg);
	    
		sc.close();
	}

}
