package Chapter12;
import javax.swing.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.*;

public class MultiButton implements ActionListener
{
	JFrame frame;
	JButton buttonE, buttonW;
	JLabel label;
	
	public static void main(String[] args)
	{
		MultiButton mb = new MultiButton();
		mb.doStuff();
	}
	
	public void doStuff()
	{
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		buttonE = new JButton("Click For Oval");
		buttonW = new JButton("Click For Rectangle");
		label = new JLabel("Click To Choose A Shape And Change Color");
		
		buttonE.addActionListener(new Rect());
		buttonW.addActionListener(new Oval());
		
		frame.getContentPane().add(BorderLayout.EAST, buttonE);
		frame.getContentPane().add(BorderLayout.WEST, buttonW);
		frame.getContentPane().add(BorderLayout.SOUTH, label);
		
		frame.setSize(600, 600);
		frame.setVisible(true);
		
	}
	
	class Rect implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			MyRandOval rOval = new MyRandOval();
			
			frame.getContentPane().add(BorderLayout.CENTER, rOval);
			frame.setVisible(true);
		}
	}
	
	class Oval implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			MyRandRect rRect = new MyRandRect();
			
			frame.getContentPane().add(BorderLayout.CENTER, rRect);
			frame.setVisible(true);
		}
	}
	
	public void actionPerformed(ActionEvent event)
	{
		//KeepBlank
	}
}
