import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double preco, dinheiro, troco;
		int qtde;

		System.out.print("Preço unitário do produto: ");
		preco = sc.nextDouble();
		
		System.out.print("Quantidade comprada: ");
		qtde = sc.nextInt();
		
		System.out.print("Dinheiro recebido: ");
		dinheiro = sc.nextDouble();

		troco = dinheiro - (qtde * preco);

		System.out.printf("TROCO = %.2f\n", troco);

		sc.close();

	}

}
