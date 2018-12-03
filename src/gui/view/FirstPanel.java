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
	private JLabel buttonCount;
	private int count;
	
	public FirstPanel(GUIController appController)
	{
		super();//used whenever we inherit a class
		
		this.appController = appController;
		
		firstLabel = new JLabel("Words! Wow!");
		buttonCount = new JLabel("<display count>");
		firstButton = new JButton("Download Minecraft for FREE!");
		appLayout = new SpringLayout();
		
		count = 0;

		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private String counter()
	{
		count++;
		String displayCount = "You've pressed the button " + count + " times!";
		
		return displayCount;
	}
	
	private int randomRGB()
	{
		int RGB = (int)(Math.random() * 256);
		
		return RGB;
		
	}
	private void changeBackground()
	{
		int red = randomRGB();
		int green = randomRGB();
		int blue = randomRGB();
		
		this.setBackground(new Color(red, green, blue));
		firstLabel.setText("Red: " + red + " Green: " + green + " Blue: " + blue);
		
		buttonCount.setText(counter());
	}
	
	private void setupPanel() //attach components to frame
	{
		this.setLayout(appLayout);
		this.add(firstButton); //adds components to panel, by default it will stack on top of each other if there isn't a layout
		this.add(firstLabel);
		this.add(buttonCount);
		buttonCount.setVisible(false);
	}
	
	private void setupLayout() //arranges components on frame
	{
		firstLabel.setHorizontalAlignment(SwingConstants.CENTER);
		buttonCount.setHorizontalAlignment(SwingConstants.CENTER);
		
		appLayout.putConstraint(SpringLayout.NORTH, buttonCount, 6, SpringLayout.SOUTH, firstLabel);
		appLayout.putConstraint(SpringLayout.WEST, buttonCount, 0, SpringLayout.WEST, firstButton);
		appLayout.putConstraint(SpringLayout.EAST, buttonCount, 0, SpringLayout.EAST, firstButton);
		
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
				buttonCount.setVisible(true);
				changeBackground();
			}
		});
	}
	
}
