package model;

public class Calculadora {
	private double n1;
	private double n2;
	private String s1 = "";
	private String s2 = "";
	private double resultado;
	private String op = "";
	private String operandos = "+-/*";

	public double getN2() {
		return n2;
	}

	public double suma() {
		this.resultado = n1 + n2;
		return resultado;

	}

	public double resta() {
		this.resultado = n1 - n2;
		return resultado;
	}

	public double multi() {
		this.resultado = n1 * n2;
		return resultado;
	}

	public double dividir() {
		this.resultado = n1 / n2;
		return resultado;
	}

	public String getOperando() {
		return op;
	}

	public void ObtenerOperandos(String str) {
		int i = 0;

		while (!chequearOperandos(str.charAt(i))) {
			s1 = s1 + str.charAt(i);
			i++;
		}

		while (chequearOperandos(str.charAt(i))) {
			op = op + str.charAt(i);
			i++;
		}

		while (str.length() != i) {
			s2 = s2 + str.charAt(i);
			i++;
		}

		this.n1 = Double.parseDouble(s1);
		this.n2 = Double.parseDouble(s2);

	}

	public boolean chequearOperandos(char i) {
		for (int j = 0; j < operandos.length(); j++) {
			if (i == operandos.charAt(j)) {
				return true;
			}
		}
		return false;
	}

}
