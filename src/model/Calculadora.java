package model;

public class Calculadora {
	private double n1;
	private double n2;
	private double resultado;
	public Calculadora(double n1,double n2) {
		this.n1=n1;
		this.n2=n2;
	}
	
	public double suma() {
		this.resultado=n1+n2;
		return resultado;
		
	}
	public double resta() {
		this.resultado=n1-n2;
		return resultado;
	}

}
