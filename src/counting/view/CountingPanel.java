package counting.view;

import javax.swing.*;
import counting.controller.CountingController;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class CountingPanel extends JPanel 
{
	private CountingController baseController;
	private SpringLayout baseLayout;
	private JButton fibButton, factButton;
	private JTextField inputField;
	private JTextArea displayArea;
	
	public CountingPanel(CountingController baseController)
	{
		super();
		setBackground(Color.CYAN);
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		displayArea = new JTextArea(5, 15);
		inputField = new JTextField(15);
		factButton = new JButton("fact");
		fibButton = new JButton("fib");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(displayArea);
		this.add(inputField);
		this.add(fibButton);
		this.add(factButton);
		displayArea.setWrapStyleWord(true);
		displayArea.setLineWrap(true);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.EAST, inputField, 298, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, inputField, -32, SpringLayout.NORTH, fibButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, inputField, -6, SpringLayout.NORTH, fibButton);
		baseLayout.putConstraint(SpringLayout.NORTH, fibButton, 187, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, factButton, 0, SpringLayout.NORTH, fibButton);
		baseLayout.putConstraint(SpringLayout.WEST, fibButton, 63, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, displayArea, 36, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, displayArea, 92, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, displayArea, -127, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, displayArea, -6, SpringLayout.NORTH, inputField);
		baseLayout.putConstraint(SpringLayout.WEST, inputField, 0, SpringLayout.WEST, displayArea);
		baseLayout.putConstraint(SpringLayout.EAST, factButton, -88, SpringLayout.EAST, this);
	}
	
	private  void setupListeners()
	{
		factButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent Click)
			{
				displayArea.setText(baseController.transferFactorial(inputField.getText()));
			}
		});
		
		fibButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				displayArea.setText(baseController.transferFibonacci(inputField.getText()));
			}
		});
	}
}
