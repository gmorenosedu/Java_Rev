package util;

public class CurrencyConverter {

	public static double IOF = 0.06;
	
	public static double totalValue( double amount, double dollarPrice) {
		return amount * dollarPrice * (1.0 + IOF);
}
	
}
