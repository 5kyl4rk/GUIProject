package gui.controller;

import gui.model.Penguin;
import gui.view.FirstFrame;

public class GUIController
{
	private Penguin gunter;
	private FirstFrame appFrame;
	
	public GUIController()
	{
		gunter = new Penguin();
		appFrame = new FirstFrame();
	}
	
	public void start()
	{
		
	}
}
