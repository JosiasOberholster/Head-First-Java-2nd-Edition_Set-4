package Chapter13;
import javax.swing.*;
import java.awt.*;

public class Button2 
{
	public static void main(String[] args)
	{
		Button2 b2 = new Button2();
		b2.go();
	}
	
	public void go()
	{
		JFrame frame = new JFrame();
		JButton button = new JButton("Click Like You Mean It");
		
		frame.getContentPane().add(BorderLayout.EAST, button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 200);
		frame.setVisible(true);
	}
}
