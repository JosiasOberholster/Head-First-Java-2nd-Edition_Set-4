package Chapter13;
import javax.swing.*;
import java.awt.*;

public class Panel1 
{
	public static void main(String[] args)
	{
		Panel1 p1 = new Panel1();
		p1.go();
	}
	
	public void go()
	{
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		panel.setBackground(Color.darkGray);
		
		frame.getContentPane().add(BorderLayout.EAST, panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 200);
		frame.setVisible(true);
	}
}
