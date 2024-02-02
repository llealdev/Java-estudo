import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double C, F;
		char resposta;
		
		do {
			
			System.out.print("Digite a temperatura em Celsius: ");
			C = sc.nextDouble();
			F = 9.0 * C / 5.0 + 32;
			System.out.printf("Equivalente em Fahrenheit : %.1f%n", F);
			System.out.print("Deseja saber outra temperatura de Celsius para Fhrenheit (s/n) ");
			resposta = sc.next().charAt(0);
			
		}while (resposta != 'n');
		
		
		sc.close();

	}

}
