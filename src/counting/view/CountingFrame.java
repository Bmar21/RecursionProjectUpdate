package counting.view;

import java.awt.Dimension;
import javax.swing.JFrame;
import counting.controller.CountingController;

public class CountingFrame extends JFrame 
{
	private CountingController baseController;
	private CountingPanel appPanel;
	
	public CountingFrame(CountingController baseController)
	{
		super();
		this.baseController = baseController;
		this.appPanel = new CountingPanel(baseController);
		
		this.setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("Recursion Project");
		this.setSize(new Dimension(600, 400));
		this.setVisible(true);
	}
}
