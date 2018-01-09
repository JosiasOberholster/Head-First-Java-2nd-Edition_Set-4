package Chapter12;
import javax.swing.*;
import java.awt.event.*;

public class RandColor implements ActionListener
{
	JFrame frame;
	JButton button;
	
	public static void main(String[] args)
	{
		RandColor rand = new RandColor();
		rand.doStuff();
	}
	
	public void doStuff()
	{
		frame = new JFrame();
		button = new JButton("Click me for a random color oval");
		
		button.addActionListener(this);
		
		frame.getContentPane().add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event)
	{
		frame = new JFrame();
		button = new JButton("");
		RandColorScheme randCol = new RandColorScheme();
	
		frame.getContentPane().add(randCol);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
		
		
		
	}
}
