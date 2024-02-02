import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade, gratuidade = 0, meia = 0;
		String nome;
		double diaria, meiav = 0, valorT = 0;
		char continuar = 'S'; 
		
		System.out.println("Valor padrão da diária: ");
		diaria = sc.nextDouble();
		
		while (continuar == 'S') {
			System.out.println("Qual o nome do hóspede ?");
			nome = sc.next();
			System.out.println("Qual a idade do hóspede ?");
			idade = sc.nextInt();
			if (idade <= 4) {
				gratuidade ++;
				diaria = 0;
				System.out.println(nome + " possui gratuidade");
			}
			else if (idade >= 80) {
				meia ++;
				meiav = diaria / 2;
				valorT = valorT + meiav;
				System.out.println(nome + " paga meia");
			}
			else if (idade < 80) {
				valorT = valorT + diaria;
			}
			
		    System.out.println("Deseja continuar incluir mais hóspede nessa hospedagem ? Se sim utilize o 'S' se não utilize o 'N'");
		    continuar = sc.next().charAt(0);
			 
			
		}
		
		System.out.println("Total de hospedagens : R$" + valorT +" ; " + gratuidade + " gratuidade(s) " + meiav + " meia(s) ");
		
		
		
		
		sc.close();

	}

}
