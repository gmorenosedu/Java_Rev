import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		double n1, n2, soma;

		System.out.print("Digite a primeira nota: ");
		n1 = sc.nextDouble();

		System.out.print("Digite a segunda nota: ");
		n2 = sc.nextDouble();

		soma = n1 + n2;

		System.out.printf("NOTA FINAL = %.1f%n", soma);

		if (soma < 60.0) {
			System.out.println("REPROVADO");
		}

		sc.close();
	}
}
