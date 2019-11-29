package model;

public class ObtenerOperandos {
	private double n1;
	private double n2;
	private String s1="";
	private String s2="";
	private String op="";
	private String operandos="+-/*";

	public ObtenerOperandos(String str) {

		for (int i = 0; i < str.length(); i++) {

			if (!chequearOperandos(str.charAt(i))) {
				s1 = s1 + str.charAt(i);
			} else {
				op = op + str.charAt(i);
				for (int j = i + 1; j < str.length(); j++) {
					s2 = s2 + str.charAt(j);
					i++;
				}
			}

		}
		this.n1 = Double.parseDouble(s1);
		this.n2 = Double.parseDouble(s2);
		System.out.println(n2);
	}
	public boolean chequearOperandos(char i) {
		for(int j=0;j<operandos.length();j++) {
			if(i==operandos.charAt(j)) {
				return true;
			}
		}
		return false;
	}

	public double getN1() {
		return n1;
	}

	public double getN2() {
		return n2;
	}

	public String getOp() {
		return op;
	}

}
