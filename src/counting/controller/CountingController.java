package counting.controller;

import counting.view.CountingFrame;
import counting.model.RecursionTool;
import javax.swing.JOptionPane;
import counting.model.Timer;

public class CountingController 
{
	private CountingFrame baseFrame;
	private RecursionTool mathTool;
	private Timer mathTimer;

	public CountingController()
	{
		this.mathTimer = new Timer();
		this.mathTool = new RecursionTool();
		this.baseFrame = new CountingFrame(this);
	}

	public void start()
	{
		JOptionPane.showMessageDialog(baseFrame, "look we are doing math");
	}

	public String transferFactorial(String input)
	{
		String factorialInfo = "";
		
		mathTimer.startTimer();
		
		if(isValid(input))
		{
			factorialInfo += mathTool.calculateFactorial(Double.parseDouble(input));
		}
		
		mathTimer.stopTimer();
		factorialInfo += "\n" + mathTimer.toString();
		
		return factorialInfo;
	}
	
	public String transferFibonacci(String input)
	{
		String fibonacciInfo = "";
		
		mathTimer.resetTimer();
		mathTimer.startTimer();
		
		if(isValid(input))
		{
			fibonacciInfo += mathTool.calculateFibonacci(Integer.parseInt(input));
		}
		
		mathTimer.stopTimer();
		fibonacciInfo += "\n" + mathTimer.toString();
		
		return fibonacciInfo;
	}
	
	private boolean isValid(String testValue)
	{
		try 
		{
			double test = Double.parseDouble(testValue);
			if(test >= 0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
			catch(NumberFormatException error)
			{
				JOptionPane.showMessageDialog(baseFrame, "Type in a valid number >= 0");
				return false;
			}
	
	}
}
