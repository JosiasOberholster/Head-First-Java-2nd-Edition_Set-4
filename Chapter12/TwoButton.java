package Chapter12;
import javax.swing.*;
import java.awt.event.*;
import java.awt.BorderLayout;

public class TwoButton implements ActionListener
{
	JFrame frame;
	JLabel label;
	
	public static void main(String[] args)
	{
		TwoButton mb = new TwoButton();
		mb.doStuff();
	}
	
	public void doStuff()
	{
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton labelButton = new JButton("Change Label");
		labelButton.addActionListener(new LabelListener());
		
		JButton colorButton = new JButton("Change Color");
		colorButton.addActionListener(new ColorListener());
		
		label = new JLabel("I'm a label");
		MyDrawPanel drawPanel = new MyDrawPanel();
		
		frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		frame.getContentPane().add(BorderLayout.EAST, labelButton);
		frame.getContentPane().add(BorderLayout.WEST, label);
		
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
	
	class LabelListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			label.setText("Ouch!");
		}
	}
	
	class ColorListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			frame.repaint();
		}
	}
	public void actionPerformed(ActionEvent event)
	{
		//Keep Blank
		
	}
}
