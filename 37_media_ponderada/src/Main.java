import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		double x1, x2, x3, media;

		System.out.print("Quantos casos voce vai digitar? ");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.println("Digite tres numeros: ");
			x1 = sc.nextDouble();
			x2 = sc.nextDouble();
			x3 = sc.nextDouble();

			media = (x1 * 2.0 + x2 * 3.0 + x3 * 5.0) / 10.0;
			
			System.out.printf("MEDIA = %.1f\n", media);
		}

		sc.close();

	}

}
