package model;

public class Model {

	public Model() {

	}

	public String operation(String str) {
		String n1 = "";
		String n2 = "";
		String operation = "";
		int uno;
		int dos;
		int resultado = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) != '+' && str.charAt(i) != '-') {
				n1 = n1 + str.charAt(i);
			} else {
				operation = operation + str.charAt(i);
				for (int j = i + 1; j < str.length(); j++) {
					n2 = n2 + str.charAt(j);
					i++;
				}
			}

		}

		uno = Integer.parseInt(n1);

		dos = Integer.parseInt(n2);

		if (operation.equals("+")) {
			resultado = uno + dos;
		}
		if (operation.equals("-")) {
			resultado = uno - dos;
		}

		return String.valueOf(resultado);
	}

	public boolean validacion(String str) {

		if (str.isEmpty() || !Character.isDigit(str.charAt(0)) || str.length() > 9 || !formato(str)
				|| !Character.isDigit(str.charAt(str.length() - 1))) {
			return false;
		} else if (str.length() == 1 || str.length() == 2) {
			return false;
		}
		return true;

	}

	public boolean formato(String str) {
		int cont = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '+' || str.charAt(i) == '-') {
				cont++;
			}
		}
		if (cont > 1)
			return false;
		else
			return true;
	}

}
