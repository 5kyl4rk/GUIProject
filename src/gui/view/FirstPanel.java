package gui.view;

import javax.swing.JPanel;
import gui.controller.GUIController;

public class FirstPanel extends JPanel
{
	private GUIController appController; //reference point
	
	public FirstPanel(GUIController appController)
	{
		super();//used whenever we inherit a class
		
		this.appController = appController;
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel() //attach components to frame
	{
		
	}
	
	private void setupLayout() //arranges components on frame
	{
		
	}
	
	private void setupListeners()
	{
		
	}
	
}
