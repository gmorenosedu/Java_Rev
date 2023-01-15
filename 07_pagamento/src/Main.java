import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String nome;
		double valorHora, pagamento;
		int horasTrabalhadas;

		System.out.print("Nome: ");
		nome = sc.nextLine();

		System.out.print("Valor por hora: ");
		valorHora = sc.nextDouble();

		System.out.print("Horas Trabalhadas: ");
		horasTrabalhadas = sc.nextInt();
		
		pagamento = valorHora * horasTrabalhadas;
		
		System.out.printf("O pagamento para %s deve ser %.2f\n", nome, pagamento);

		sc.close();

	}

}
