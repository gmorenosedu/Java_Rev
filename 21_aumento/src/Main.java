import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double salarioAtual, novoSalario, aumento;
		int porcentagem;
		
		System.out.print("Digite o salario da pessoa: ");
		salarioAtual = sc.nextDouble();

		if (salarioAtual <= 1000.00) {
			porcentagem = 20;
			aumento = salarioAtual * porcentagem / 100;
			novoSalario = salarioAtual + aumento;
		} 
		else if (salarioAtual <= 3000.00) {
			porcentagem = 15;
			aumento = salarioAtual * porcentagem / 100;
			novoSalario = salarioAtual + aumento;
		} 
		else if (salarioAtual <= 8000.00) {
			porcentagem = 10;
			aumento = salarioAtual * porcentagem / 100;
			novoSalario = salarioAtual + aumento;
		} 
		else {
			porcentagem = 5;
			aumento = salarioAtual * porcentagem / 100;
			novoSalario = salarioAtual + aumento;
		}

		System.out.printf("Novo salario = R$ %.2f\n", novoSalario);
		System.out.printf("Aumento = R$ %.2f\n", aumento);
		System.out.printf("Porcentagem = %d %%\n", porcentagem);
		
		sc.close();
	}

}
