package controller;

import model.Model;
import view.View;

public class NormalController implements Controller {
	private View view;
	private Model model;

	public NormalController(Model model, View view) {
		this.model = model;
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
		} else if (str.endsWith("+") || str.endsWith("-")) {
			view.showError("ingresa un segundo numero");
		} else if (str.length() > 9) {
			view.showError("numero muy grande");
		}

		else {
			String resultado = model.procesarOperacion(str);
			view.setText(resultado);
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
