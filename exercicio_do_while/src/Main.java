import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int quantidadeDias;
		double valorDiaria; 
		
		do {
			
			System.out.println("Qual é o valor da diária ?");
			valorDiaria = sc.nextDouble();
			System.out.println("Quanots dias os hóspedes vão ficar ?");
			quantidadeDias = sc.nextInt();
			if (valorDiaria < 0 || quantidadeDias < 0) {
				System.out.println("Valor inválido");
			}
			else {
				System.out.println("Fim do programa");
			}
		} while(valorDiaria < 0 || quantidadeDias < 0);
		
		
		sc.close();

	}

}
