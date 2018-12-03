package gui.view;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.controller.GUIController;


public class FirstPanel extends JPanel
{
	private GUIController appController; //reference point
	private JLabel firstLabel;
	private JButton firstButton;
	private SpringLayout appLayout;
	
	
	public FirstPanel(GUIController appController)
	{
		super();//used whenever we inherit a class
		
		this.appController = appController;
		
		firstLabel = new JLabel("Words! Wow!");
		firstButton = new JButton("Download Minecraft for FREE!");
		appLayout = new SpringLayout();

		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void changeBackground()
	{
		int red = (int)(Math.random() * 256);
		int green = (int)(Math.random() * 256);
		int blue = (int)(Math.random() * 256);
		
		this.setBackground(new Color(red, green, blue));
		firstLabel.setText("Red: " + red + " Green: " + green + " Blue: " + blue);
	}
	
	private void setupPanel() //attach components to frame
	{
		this.setLayout(appLayout);
		this.add(firstButton); //adds components to panel, by default it will stack on top of each other if there isn't a layout
		this.add(firstLabel);
	}
	
	private void setupLayout() //arranges components on frame
	{
		firstLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		appLayout.putConstraint(SpringLayout.NORTH, firstButton, 260, SpringLayout.SOUTH, firstLabel);
		appLayout.putConstraint(SpringLayout.WEST, firstButton, 0, SpringLayout.WEST, firstLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, firstButton, -50, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, firstButton, 0, SpringLayout.EAST, firstLabel);
		appLayout.putConstraint(SpringLayout.WEST, firstLabel, 100, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, firstLabel, -100, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, firstLabel, 100, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, firstLabel, -350, SpringLayout.SOUTH, this);
	}
	
	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent mouseClick)
			{
				changeBackground();
			}
		});
	}
	
}
