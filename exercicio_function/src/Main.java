import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Programa que da um aumento no salário de 10%
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quanto é o salário do profissional ?");
		double salario = sc.nextDouble();
	
		double wage = aumento(salario);
		
		result(wage);
	
		
		sc.close();
	}
	
	public static double aumento (double x) {
		double aum;
		double total;
		
		aum = x * 0.10;
		total = x + aum;
		
		return total;
		
	}
	
	public static void result(double value) {
		System.out.println("O salário agora é de : " + value);
		
	}
	

}