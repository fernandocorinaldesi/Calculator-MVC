package view;

import controller.Controller;

public interface View {
	public void operation(Controller controller);
	
	public String getText();
	
	public void setText(String s);
	
	public void showError(String err);
	
		
	public void open();

}
