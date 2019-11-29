package model;

public class Model {

	public Model() {

	}

	public String procesarOperacion(String str) {
		double n1;
		double n2;
		double resultado;
		String operando;

		ContextoOperacion co = new ContextoOperacion();
		ObtenerOperandos o = new ObtenerOperandos(str);

		n1 = o.getN1();

		n2 = o.getN2();

		operando = o.getOp();

		FabricaOperacion fo = co.op(n1, n2, operando);
		resultado = fo.getResultado();

		return String.valueOf(resultado);
	}

}
