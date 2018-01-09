package Chapter12;
import javax.swing.*;
import java.awt.event.*;
import java.awt.BorderLayout;

public class RandColorButton implements ActionListener
{
	JFrame frame;
	JButton button;
	
	public static void main(String[] args)
	{
		RandColorButton rand = new RandColorButton();
		rand.doStuff();
	}
	
	public void doStuff()
	{
		frame = new JFrame();
		button = new JButton("Click me for a random color oval");
		RandColorScheme chColor = new RandColorScheme();
		
		button.addActionListener(this);
		
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.getContentPane().add(BorderLayout.CENTER, chColor );
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event)
	{
		frame.repaint();
	}
}
