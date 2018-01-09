package Chapter13;
import javax.swing.*;
import java.awt.*;

public class Panel3 
{
	public static void main(String[] args)
	{
		Panel3 p3 = new Panel3();
		p3.go();
	}
	
	public void go()
	{
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button1 = new JButton("Shock ME");
		JButton button2 = new JButton("Bliss");
		
		panel.setBackground(Color.darkGray);
		panel.add(button1);
		panel.add(button2);
		
		frame.getContentPane().add(BorderLayout.EAST, panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(250, 200);
		frame.setVisible(true);
	}
}
