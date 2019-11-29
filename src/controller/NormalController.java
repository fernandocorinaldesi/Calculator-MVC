package controller;

import model.Model;
import view.View;

public class NormalController implements Controller{
	View view;
	Model model;

	public NormalController(Model model,View view) {
		this.model=model;
		this.view=view;
		this.view.operation(this);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void open() {
		view.open();
		
	}

	@Override
	public void operation() {
	   String str=view.getText();
	   if(model.validacion(str)) {
		   String result=model.operation(str);
		   view.setText(result);
	   }
	   else {
		   view.showerror("formato incorrecto");
	   }
	  
		
	}
		
		
	}
	


