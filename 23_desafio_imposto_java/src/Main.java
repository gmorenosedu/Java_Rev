import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double salario, servico, capital, rendaMensal;
		double impSalario, impServico, impCapital, impBruto, impDevido;
		double medicos, educacionais;
		double maxDedutivel, gastosDedutivel, abatimento;

		System.out.print("Renda anual com sal?rio: ");
		salario = sc.nextDouble();
		System.out.print("Renda anual com presta??o de servi?o: ");
		servico = sc.nextDouble();
		System.out.print("Renda anual com ganho de capital: ");
		capital = sc.nextDouble();
		System.out.print("Gastos m?dicos: ");
		medicos = sc.nextDouble();
		System.out.print("Gastos educacionais: ");
		educacionais = sc.nextDouble();

		rendaMensal = salario / 12.0;

		if (rendaMensal < 3000.0) {
			impSalario = 0.00;
		} 
		else if (rendaMensal < 5000.0) {
			impSalario = salario * 0.10;
		} 
		else {
			impSalario = salario * 0.20;
		}

		impServico = servico * 0.15;

		impCapital = capital * 0.20;

		impBruto = impSalario + impServico + impCapital;

		maxDedutivel = impBruto * 0.30;
		
		gastosDedutivel = medicos + educacionais;

	
		if (gastosDedutivel < maxDedutivel) {

			abatimento = gastosDedutivel;
		} 
		else {

			abatimento = maxDedutivel;
		}

		impDevido = impBruto - abatimento;

		System.out.println();
		System.out.println("RELAT?RIO DE IMPOSTO DE RENDA");
		System.out.println();
		System.out.println("CONSOLIDADO DE RENDA:");
		System.out.printf("Imposto sobre sal?rio: %.2f\n", impSalario);
		System.out.printf("Imposto sobre servi?os: %.2f\n", impServico);
		System.out.printf("Imposto sobre ganho de capital: %.2f\n", impCapital);
		System.out.println();
		System.out.println("DEDU??ES:");
		System.out.printf("M?ximo dedut?vel: %.2f\n", maxDedutivel);
		System.out.printf("Gastos dedut?veis: %.2f\n", gastosDedutivel);
		System.out.println();
		System.out.println("RESUMO:");
		System.out.printf("Imposto bruto total: %.2f\n", impBruto);
		System.out.printf("Abatimento: %.2f\n", abatimento);
		System.out.printf("Imposto devido: %.2f\n", impDevido);

		sc.close();

	}

}
