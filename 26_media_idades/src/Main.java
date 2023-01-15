import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int idades, count;
		double soma, media;

		System.out.println("Digite as idades:");
		idades = sc.nextInt();

		if (idades < 0) {
			System.out.println("IMPOSSIVEL CALCULAR");
		} 
		else {

			soma = 0;
			count = 0;
			while (idades >= 0) {
				soma = soma + idades;
				count++;
				idades = sc.nextInt();
			}

			media = soma / count;

			System.out.printf("MEDIA = %.2f%n", media);
		}

		sc.close();
	}

}
