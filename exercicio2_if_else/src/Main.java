import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int convidados;
		double qCafe = 0.2, qAgua = 0.5,qSalgadinho = 7, somaCafe, somaAgua, somaSalgadinho; 
		
		System.out.println("Quantos convidados participarão da festa ?");
		convidados = sc.nextInt();
		
		if ( convidados< 30 ||convidados > 350 ) {
			System.out.println("Números de convidados superior ou inferior à capacidade maxima");
		}
		else {
			somaCafe = convidados * qCafe;
			somaAgua = convidados * qAgua;
			somaSalgadinho = convidados * qSalgadinho;
			System.out.println("O senhor vai precisar de " + somaCafe +" litro(s) de café, " + somaAgua + " litro(s) de água, " + somaSalgadinho + " salgadinho(s)");
		}
		sc.close();

	}

}
