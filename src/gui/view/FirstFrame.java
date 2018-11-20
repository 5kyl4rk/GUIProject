package gui.view;

import javax.swing.JFrame;

public class FirstFrame extends JFrame //'extends': access all the information from a class
{
	
	public FirstFrame()
	{
		super(); //if a class inherits or extends a class, the first line of it's constructor has to be 'super()'
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(800, 800);
		this.setTitle("My first GUI");
		this.setResizable(true);
		this.setVisible(true);
	}
}
