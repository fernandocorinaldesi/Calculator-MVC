package model;

public class Model {
    private Calculadora c; 
    private double n1;
    private double n2;
    private double resultado;
    private String operando;
    private ObtenerOperandos o;
	
	public Model() {

	}

	public String procesarOperacion(String str) {
		
	    o = new ObtenerOperandos(str);
		n1 = o.getN1();
		n2 = o.getN2();
		operando = o.getOp();
		c=new Calculadora(n1,n2);
		
		if(operando.equals("+")) {
			resultado=c.suma();
		}
		else if(operando.equals("-")) {
			resultado=c.resta();
		}

		return String.valueOf(resultado);
	}

}
