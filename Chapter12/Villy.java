package Chapter12;
import javax.swing.*;
import java.awt.event.*;

public class Villy implements ActionListener
{
	JButton button;
	JFrame frame = new JFrame();
	
	public static void main(String[] args)
	{
		Villy vil = new Villy();
		vil.doStuff();
	}
	
	public void doStuff()
	{
		button = new JButton("Click Me Button");
		
		button.addActionListener(this);
		
		frame.getContentPane().add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event)
	{
		button.setText("I Love You!");
		frame.setSize(700, 700);
	}
}