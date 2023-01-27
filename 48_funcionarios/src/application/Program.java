package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee emp = new Employee();

		System.out.print("Nome: ");
		emp.name = sc.nextLine();
		System.out.print("Sal�rio bruto: ");
		emp.grossSalary = sc.nextDouble();
		System.out.print("Imposto: ");
		emp.tax = sc.nextDouble();

		System.out.println();
		System.out.println("Funcion�rio: " + emp);
		System.out.println();
		System.out.print("Qual a porcentagem para aumentar o sal�rio? ");
		double porcentage = sc.nextDouble();
		emp.increseSalary(porcentage);

		System.out.println();
		System.out.println("Dados atualizados: " + emp);
		sc.close();
	}
}