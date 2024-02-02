import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String x, exame, responsavel; 
		int qtdRoupa, idade ; 
		double y = 15.00, o = 20.00, preco;
		
		System.out.println("Qual área o senhor(a) deseja entrar ? Digite L para lavanderia e P para piscina ");
		x = sc.next();
		
		switch (x) {
			case "L" :
				System.out.println("Você escolheu Lavanderia");
				System.out.println("Quantos KG de roupa o senhor(a) quer lavar ?");
				qtdRoupa = sc.nextInt();
				if (qtdRoupa > 10 ){
					
					preco = qtdRoupa * y;
					System.out.println("O valor da lavagem foi R$ "+ preco);
				}
				else {
					preco = qtdRoupa * o; 
					System.out.println("O valor da lavagem foi R$ " + preco);
				}
				break;
			
			case "P" :
				System.out.println("Qual a sua idade ?");
				idade = sc.nextInt();
				if (idade >= 18) {
					System.out.println("Seus exames estão em dia ?( Sim / Não )");
					exame = sc.next();
					if (exame.equals ("Sim") ) {
						System.out.println("Aproveite a piscina !");
					}
					else if (exame.equals ("Não") ) {
						System.out.println("Faça seus exames !");
					}
					else {
						System.out.println("Digito inválido !");
					}
				
				}
				else if (idade < 18 ) {
					System.out.println("Você está com acompanhado por um responsável maior de idade ? ( Sim / Não )");
					responsavel = sc.next();
					if (responsavel.equals ("Sim")) {
						System.out.println("Aproveite a piscina !");
					}
					else if (responsavel.equals("Não")) {
						System.out.println("Não entrará sem um responsável maior de idade !");
					}
					else {
						System.out.println("Digito inválido !");
					}
				}
				break;
			default : 
				System.out.println("Digito inválido ! ");
				break;
		}
		
		
		
		
		sc.close();

	}

}
