import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		String x;
		Double d, m = 4.92, somaDolar;
		char s;
		
		System.out.println("Bom dia senhor!");
		System.out.println("Qual o seu nome ?");
		x = sc.nextLine();
		System.out.println("Quantos reais o senhor quer transferir para dolar ? ");
		d = sc.nextDouble();
		
		somaDolar = d / m;
		
		System.out.println("O senhor ficaria com : " + somaDolar + " USD");
		System.out.println(x +", o senhor gostaria de transferir seu dinheiro ?(S/N)");
		s = sc.next().charAt(0);
		System.out.println("Ok "+ x + " irei transferir seu dinheiro");
		
		sc.close();
		
	}

}
