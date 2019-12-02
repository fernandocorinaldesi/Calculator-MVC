package controller;

import model.Calculadora;
import view.View;

public class NormalController implements Controller {
	private View view;
	private Calculadora c;
	private double resultado;

	public NormalController(Calculadora c, View view) {
		this.c = c;
		this.view = view;
		this.view.operation(this);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void open() {
		view.open();

	}

	@Override
	public void operation() {
		String str = view.getText();

		if (str.isEmpty()) {
			view.showError("vacio");
		} else if (!Character.isDigit(str.charAt(0))) {
			view.showError("formato incorrecto");
		} else if (esEntero(str) || esDouble(str)) {
			view.showError("ingrese la operacion");
		} else if (str.endsWith("+") || str.endsWith("-") || str.endsWith("*") || str.endsWith("/")) {
			view.showError("ingresa un segundo numero");
		} else if (str.length() > 9) {
			view.showError("numero muy grande");
		}

		else {

			c = new Calculadora();
			c.ObtenerOperandos(str);

			if (c.getOperando().equals("/") && c.getN2() == 0) {
				view.showError("no se puede divir por 0");
			} else if (c.getOperando().equals("+")) {
				resultado = c.suma();
			} else if (c.getOperando().equals("-")) {
				resultado = c.resta();
			} else if (c.getOperando().equals("*")) {
				resultado = c.multi();
			} else if (c.getOperando().equals("/")) {
				resultado = c.dividir();
			}

			view.setText(String.valueOf(resultado));
		}

	}

	public boolean esEntero(String s) {
		try {
			Integer.parseInt(s);
			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean esDouble(String s) {
		try {
			Double.parseDouble(s);
			return true;

		} catch (Exception e) {
			return false;
		}
	}

}
