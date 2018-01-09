package Chapter13;
import javax.swing.*;
import java.awt.*;

public class Button1 
{
	public static void main(String[] args)
	{
		Button1 b1 = new Button1();
		b1.go();
	}
	
	public void go()
	{
		JFrame frame = new JFrame();
		JButton button = new JButton("Click Me");
		
		frame.getContentPane().add(BorderLayout.EAST, button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 200);
		frame.setVisible(true);
	}
}
