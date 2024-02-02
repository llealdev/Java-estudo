
public class Main {

	public static void main(String[] args) {
		double x = 3.0, y = 4.0, z = -5.0, A, B, C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		
		System.out.println(" A raiz quadrada de " + x + "=" + A );
		System.out.println(" A raiz quadrada de " + y + "=" + B);
		System.out.println(" A raiz quadrada de 25 = " + C );
		
		A = Math.pow(x, y);
		B = Math.pow(y, 2.0);
		C = Math.pow(5.0, 2.0);
		
		System.out.println(x + " elevado a " + y + "=" + A );
		System.out.println(y + "elevado ao quadrado é = " + B);
		System.out.println(" 5 elevado ao quadrado é = " + C);
		
		A = Math.abs(y);
		B = Math.abs(-10.0);
		C = Math.abs(z);
		
		System.out.println("O valor absoluto de " +  y + " = " + A);
		System.out.println("O valor absoluto de -10.0 é = " + B);
		System.out.println("O valor absoluto de " + z + " = " + C );
		

	}

}
