package Chapter13;
import javax.swing.*;
import java.awt.*;

public class Button4 
{
	public static void main(String[] args)
	{
		Button4 b4 = new Button4();
		b4.go();
	}
	
	public void go()
	{
		JFrame frame = new JFrame();
		JButton button = new JButton("Click This!");
		Font bigFont = new Font("serif", Font.BOLD, 28);
		
		button.setFont(bigFont);
		
		frame.getContentPane().add(BorderLayout.NORTH, button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 200);
		frame.setVisible(true);
	}
}
