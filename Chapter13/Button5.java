package Chapter13;
import javax.swing.*;
import java.awt.*;

public class Button5 
{
	public static void main(String[] args)
	{
		Button5 b5 = new Button5();
		b5.go();
	}
	
	public void go()
	{
		JFrame frame = new JFrame();
		JButton button1 = new JButton("North");
		JButton button2 = new JButton("East");
		JButton button3 = new JButton("South");
		JButton button4 = new JButton("West");
		JButton button5 = new JButton("Center");
		
		frame.getContentPane().add(BorderLayout.NORTH, button1);
		frame.getContentPane().add(BorderLayout.EAST, button2);
		frame.getContentPane().add(BorderLayout.SOUTH, button3);
		frame.getContentPane().add(BorderLayout.WEST, button4);
		frame.getContentPane().add(BorderLayout.CENTER, button5);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}
