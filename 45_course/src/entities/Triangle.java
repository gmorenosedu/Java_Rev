package entities;

public class Triangle {
	
	//In�cio dos atributos da classe
	
	public double a;
	public double b;
	public double c;
	
	//Fim dos atributos da classe
	
	
	//In�cio do M�todo (ou Fun��o)
	
	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
	//Fim do M�todo (ou Fun��o)

}
