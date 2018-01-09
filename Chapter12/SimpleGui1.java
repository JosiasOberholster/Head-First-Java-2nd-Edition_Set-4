package Chapter12;
import javax.swing.*;

public class SimpleGui1
{
	public static void main(String[] args)
	{
		SimpleGui1 sim = new SimpleGui1();
		sim.doStuff();
	}
	
	public void doStuff()
	{
		JFrame frame = new JFrame();
		JButton button = new JButton("I'm a Button");
		
		frame.getContentPane().add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}
