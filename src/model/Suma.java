package model;

public class Suma extends FabricaOperacion{
	
	public Suma(double num1, double num2) {
		this.resultado=num1+num2;
	}

	@Override
	public double getResultado() {
		// TODO Auto-generated method stub
		return resultado;
	}
	
	
	

}
