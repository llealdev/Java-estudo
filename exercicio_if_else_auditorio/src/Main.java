import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int alfa = 150, beta = 350, co ;
		
		System.out.println("Qual a quantidades de convidados para essa festa ?");
		co = sc.nextInt();
		
		if (co > 220 && co < 350){
			System.out.println("O salão de festa adequado para essa capacidade é o salão Beta");
		}
		else if (co > 150 && co < 200 ) {
			System.out.println("O salão de espaço indicado é o Alfa com mais " + (co - 150 ) +" cadeiras");
		}
		else if (co > 0 && co <= 150) {
			System.out.println("O salão de festa indicado é p Alfa");
		}
		else {
			System.out.println("Número inválido");
		}
		
		sc.close();

	}

}
