import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int qtd;
		double preco, dinheiro, troco, faltam;

		System.out.print("Preço unitário do produto: ");
		preco = sc.nextDouble();

		System.out.print("Quantidade comprada: ");
		qtd = sc.nextInt();

		System.out.print("Dinheiro recebido: ");
		dinheiro = sc.nextDouble();

		if (preco * qtd > dinheiro) {
			faltam = (qtd * preco) - dinheiro;
			System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f REAIS\n", faltam);
		} 
		else {
			troco = dinheiro - (qtd * preco);
			System.out.printf("TROCO = %.2f\n", troco);
		}

		sc.close();
	}

}
