package aulas_exemplos;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double price = sc.nextDouble();
		double discount = sc.nextDouble(); // Acerto do Ambiente das variáveis
		
		
		if (price > 100.0) {
		discount = price * 0.1;
		}
		System.out.println(discount);
		
		sc.close();
	}

}
