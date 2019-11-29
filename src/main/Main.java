package main;

import controller.Controller;
import controller.NormalController;
import model.Model;
import view.NormalView;

public class Main {

	public static void main(String[] args) {
		
		
		Model m=new Model();
		NormalView v=new NormalView();
		Controller controller=new NormalController(m,v);
		controller.open();
		// TODO Auto-generated method stub

	}

}
