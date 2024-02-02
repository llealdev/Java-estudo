package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Nota;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Nota aluno = new Nota();
		
		System.out.print("Digite seu nome: ");
		aluno.nome = sc.nextLine();
		System.out.println("Digite suas notas: ");
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
	    double resultado = aluno.soma();
		
	    if (resultado >= 60 ) {
	    	System.out.printf("FINAL GRADE = %.2f%n", resultado);
	    	System.out.println("PASS");
	    	
	    }
	    else {
	    	System.out.printf("FINAL GRADE = %.2f%n", resultado);
	    	System.out.println("FALIED");
	    	System.out.println("MISSING "+ (60 - resultado) + " POINTS");
	    }
	    
	    
		
		
		sc.close();
	}


}
