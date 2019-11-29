package model;

public class ContextoOperacion {
	
	public FabricaOperacion op(double num1,double num2,String op) {
		
		if(op.equals("+")) {
			return new Suma(num1,num2);
		}
		else if(op.equals("-")) {
			return new Resta(num1,num2);
		}
		return null;
	}

}
