package entities;

public class Triangle {
	
	//Início dos atributos da classe
	
	public double a;
	public double b;
	public double c;
	
	//Fim dos atributos da classe
	
	
	//Início do Método (ou Função)
	
	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
	//Fim do Método (ou Função)

}
