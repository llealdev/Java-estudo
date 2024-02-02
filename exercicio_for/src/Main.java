import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int qtdH, i, quartoNum; 
		double valorDia, totalDia = 0, menorDia = 0, maiorDia = 0;
		
		System.out.println("Qual vai ser a quantidade de hóspedes ?");
		qtdH = sc.nextInt();
		
		for ( i = 0; i < qtdH; i++) {
			
			System.out.println("Qual o número do quarto ?");
			quartoNum = sc.nextInt();
			System.out.println("Qual é o valor da diária ? ");
			System.out.print("R$ ");
			valorDia = sc.nextDouble();
			System.out.println("Quarto " + quartoNum +": R$ " + valorDia);
			
			totalDia = totalDia + valorDia;
			
			if (i == 0) {
				menorDia = valorDia;
				maiorDia = valorDia; 
			}
			else {
				if ( valorDia < menorDia) {
					menorDia = valorDia;
				}
				if (valorDia > maiorDia ) {
					maiorDia = valorDia;
				}
			}
		}
		
		System.out.println(" Total de diárias:  R$" + totalDia);
		System.out.println(" Menor valor:  R$" + menorDia);
		System.out.println(" Mair valor:  R$" + maiorDia);
		
		
		sc.close();	
	}

}
