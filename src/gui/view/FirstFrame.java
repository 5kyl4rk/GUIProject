package gui.view;

import javax.swing.JFrame;  //javax.swing contains classes used for GUI
import gui.controller.GUIController;


public class FirstFrame extends JFrame //'extends': access all the information from a class, in this case, allows use to use methods from the class JFrame
{
	private GUIController appController; //makes a reference point, NOT a new object
	private FirstPanel appPanel;
	
	public FirstFrame(GUIController appController)
	{
		super(); //if a class inherits or extends a class, the first line of it's constructor has to be 'super()'
		
		this.appController = appController;
		this.appPanel = new FirstPanel(appController);
		
		setupFrame();
	}
	
	private void setupFrame() //builds the frame
	{
		this.setContentPane(appPanel);//install panel to the frame
		this.setSize(800, 800);
		this.setTitle("My first GUI");
		this.setResizable(true);
		this.setVisible(true); //allows you to see the frame, else your program will shutdown if there's nothing on screen.
	}
}
