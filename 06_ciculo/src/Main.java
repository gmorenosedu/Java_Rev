import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double raio, area;

		System.out.print("Digite o valor do raio do circulo: ");
		raio = sc.nextDouble();

		//area = Math.PI * Math.pow(raio, 2); Minha Soluçao
		
		area = 3.14159 * raio * raio; // Correcao no Github

		System.out.printf("AREA = %.3f\n", area);

		sc.close();

	}

}
