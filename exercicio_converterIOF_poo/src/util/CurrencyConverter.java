package util;

public class CurrencyConverter {
	public static double dollar;
	public static double dollars;
	
	public static double converter() {
		double sum = dollar * dollars;
		return (sum * 6 )/ 100 + sum; 
	}

}
