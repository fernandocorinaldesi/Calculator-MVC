package main;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import controller.Controller;
import controller.NormalController;
import model.Calculadora;
import view.NormalView;

public class Main {

	public static void main(String[] args) {
		
		 try {
		        UIManager.setLookAndFeel(new NimbusLookAndFeel());
		      } catch (UnsupportedLookAndFeelException e) {
		        Logger log = Logger.getGlobal();
		        log.log(Level.INFO, "No NimbusLookAndFeel");
		      }
		 
		Calculadora c=new Calculadora();
		NormalView v=new NormalView();
		Controller controller=new NormalController(c,v);
		controller.open();
		// TODO Auto-generated method stub

	}

}
