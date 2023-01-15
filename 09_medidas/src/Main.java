import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a, b, c, areaQuadrado, areaTriangulo, areaTrapezio;

		System.out.print("Digite a medida A: ");
		a = sc.nextDouble();

		System.out.print("Digite a medida B: ");
		b = sc.nextDouble();

		System.out.print("Digite a medida C: ");
		c = sc.nextDouble();

		areaQuadrado = a * a;
		areaTriangulo = (a * b) / 2;
		areaTrapezio = ((a + b) * c) / 2;

		System.out.printf("AREA DO QUADRADO = %.4f\n", areaQuadrado);
		System.out.printf("AREA DO TRIANGULO = %.4f\n", areaTriangulo);
		System.out.printf("AREA DO TRAPEZIO = %.4f\n", areaTrapezio);

		sc.close();

	}

}
