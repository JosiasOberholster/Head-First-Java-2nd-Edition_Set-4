package Chapter13;
import javax.swing.*;
import java.awt.*;

public class Button3 
{
	public static void main(String[] args)
	{
		Button3 b3 = new Button3();
		b3.go();
	}
	
	public void go()
	{
		JFrame frame = new JFrame();
		JButton button = new JButton("There Is No Spoon...");
		
		frame.getContentPane().add(BorderLayout.NORTH, button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 200);
		frame.setVisible(true);
	}
}
