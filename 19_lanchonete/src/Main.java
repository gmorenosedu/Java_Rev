import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int produto, qtd;
		double total;

		System.out.print("produto do produto comprado: ");
		produto = sc.nextInt();

		System.out.print("Quantidade comprada: ");
		qtd = sc.nextInt();

		total = 0.0;

		if (produto == 1) {
			total = qtd * 5.00;
		} 
		else if (produto == 2) {
			total = qtd * 3.50;
		} 
		else if (produto == 3) {
			total = qtd * 4.80;
		} 
		else if (produto == 4) {
			total = qtd * 8.90;
		} 
		else if (produto == 5) {
			total = qtd * 7.32;
		}

		System.out.printf("Valor a total: R$ %.2f\n", total);

		sc.close();

	}

}
