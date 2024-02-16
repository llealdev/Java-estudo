package application;

import java.time.Year;
import java.util.Scanner;

import entities.Autor;
import entities.Biblioteca;
import entities.Livro;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--------------- Autor ---------------");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Idade: ");
		Integer idade = sc.nextInt();
		
		Autor autor = new Autor(name, idade);
		System.out.println();
		
		System.out.println("--------------- Livro ---------------");
		System.out.println("Você quer incluir quantos livros de autor ? ");
		int n = sc.nextInt();
		System.out.println();
		
		Biblioteca biblioteca = new Biblioteca();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Titulo: ");
			sc.nextLine();
			String titulo = sc.nextLine();
			System.out.print("Ano publicado: ");
			int anoPublicado = sc.nextInt();
			System.out.println();
			
			Livro livro = new Livro(titulo, Year.of(anoPublicado), autor);
			
			
			biblioteca.addLivro(livro);
		}
		
		System.out.println(biblioteca);
		
		
	
	
		
		
		
		
		sc.close();

	}

}
