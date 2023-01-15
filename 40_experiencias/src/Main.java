import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char tipo;
		int n, qtdcobaias, coelhos, ratos, sapos, total;
		double pCoelhos, pRatos, pSapos; 

		System.out.print("Quantos casos de teste serao digitados? ");
		n = sc.nextInt();

		coelhos = 0;
		ratos = 0;
		sapos = 0;

		for (int i = 0; i < n; i++) {

			System.out.print("Quantidade de cobaias: ");
			qtdcobaias = sc.nextInt();

			System.out.print("Tipo de cobaia: ");
			tipo = sc.next().charAt(0);

			if (tipo == 'C') {
				coelhos = coelhos + qtdcobaias;
			} 
			else if (tipo == 'R') {
				ratos = ratos + qtdcobaias;
			} 
			else {
				sapos = sapos + qtdcobaias;
			}
		}

		total = coelhos + ratos + sapos;
		
		pCoelhos = ((double) coelhos / total) * 100.0;
		pRatos = ((double) ratos / total) * 100.0;
		pSapos = ((double) sapos / total) * 100.0;

		System.out.println();
		System.out.println("RELATORIO FINAL:");
		System.out.printf("Total: %d cobaias\n", total);
		System.out.printf("Total de coelhos: %d\n", coelhos);
		System.out.printf("Total de ratos: %d\n", ratos);
		System.out.printf("Total de sapos: %d\n", sapos);
		System.out.printf("Percentual de coelhos: %.2f\n", pCoelhos);
		System.out.printf("Percentual de ratos: %.2f\n", pRatos);
		System.out.printf("Percentual de sapos: %.2f\n", pSapos);
		

		sc.close();

	}

}
