package Chapter12;
import javax.swing.*;
import java.awt.event.*;

public class SimpleGui1B implements ActionListener
{
	JButton button;
	
	public static void main(String[] args)
	{
		SimpleGui1B sim = new SimpleGui1B();
		sim.doStuff();
	}
	
	public void doStuff()
	{
		JFrame frame = new JFrame();
		button = new JButton("Click Me!");
		
		button.addActionListener(this);
		
		frame.getContentPane().add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event)
	{
		button.setText("I Have Been Clicked");
	}
}