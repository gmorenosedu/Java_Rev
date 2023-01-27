package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student stud = new Student();

		stud.name = sc.nextLine();
		stud.quater1 = sc.nextDouble();
		stud.quater2 = sc.nextDouble();
		stud.quater3 = sc.nextDouble();

		System.out.println();
		System.out.printf("NOTA FINAL = %.2f%n", stud.total());

		if (stud.total() < 60.0) {
			System.out.println("REPROVADO");
			System.out.printf("FALTARAM %.2f PONTOS", (stud.result()));
		} 
		else {
			System.out.println("APROVADO");
		}

		sc.close();
	}
}
