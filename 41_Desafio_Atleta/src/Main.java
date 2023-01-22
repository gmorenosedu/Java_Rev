import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int n, qtdHomens, qtdMulheres;
		String nome, nomeMaisAlto;
		char sexo;
		double altura, peso, somaPeso, pesoMedio, maisAlto, somaAlturaMulheres, AlturaMediaMulheres, pHomens;

		System.out.print("Qual a quantidade de atletas? ");
		n = sc.nextInt();

		qtdHomens = 0;
		qtdMulheres = 0;
		maisAlto = 0;
		nomeMaisAlto = "";
		somaPeso = 0;
		somaAlturaMulheres = 0;
		
		for (int i = 0; i < n; i++) {
			
			// LEITURA DOS DADOS DO ATLETA i
			
			System.out.println("Digite os dados do atleta numero: " + (i+1) + ":");
			sc.nextLine();
			System.out.print("Nome: ");
			nome = sc.nextLine();

			System.out.print("Sexo: ");
			sexo = sc.next().charAt(0);
			while (sexo != 'F' && sexo != 'M') {
				System.out.print("Valor invalido! Favor digitar F ou M: ");
				sexo = sc.next().charAt(0);
			}
			
			System.out.print("Altura: ");
			altura = sc.nextDouble();
			while (altura <= 0) {
				System.out.print("Valor invalido! Favor digitar um valor positivo: ");
				altura = sc.nextDouble();
			}

			System.out.print("Peso: ");
			peso = sc.nextDouble();

			while (peso <= 0) {
				System.out.print("Valor invalido! Favor digitar um valor positivo: ");
				peso = sc.nextDouble();
			}
			
			// ACUMULANDO A SOMA DOS PESOS PARA CALCULAR A MEDIA DEPOIS	
			
			somaPeso = somaPeso + peso;
		
			// ATUALIZANDO ATLETA MAIS ALTO, SE FOR O CASO
			
			if (altura > maisAlto) {
				maisAlto = altura;
				nomeMaisAlto = nome;
			}
	
			// ACUMULANDO A CONTAGEM DE HOMENS, SE FOR O CASO
			
			if (sexo == 'M') {
				qtdHomens++;
			} 

			// ACUMULANDO A SOMA DAS ALTURAS E CONTAGEM DE MULHERES, SE FOR O CASO
			
			if (sexo == 'F') {
				qtdMulheres++;
				somaAlturaMulheres = somaAlturaMulheres + altura;
			} 
		}

		System.out.println();
		System.out.println("RELATÓRIO:");
		
		pesoMedio = (double) somaPeso / n;
		System.out.printf("Peso médio dos atletas: %.2f\n", pesoMedio);
		
		System.out.printf("Atleta mais alto: %s\n", nomeMaisAlto);
		
		pHomens = (double) qtdHomens / n * 100.0;
		
		System.out.printf("Porcentagem de homens: %.1f %%\n", pHomens);
		
	 	if (qtdMulheres == 0) {
			System.out.println("Não há mulheres cadastradas");
		} 
		else {
			AlturaMediaMulheres = (double) somaAlturaMulheres / qtdMulheres;
			System.out.printf("Altura média das mulheres: %.2f\n", AlturaMediaMulheres);
		}

		sc.close();
	}
}
