package Chapter13;
import javax.swing.*;
import java.awt.*;

public class Panel2 
{
	public static void main(String[] args)
	{
		Panel2 p2 = new Panel2();
		p2.go();
	}
	
	public void go()
	{
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton("Shock Me");
		
		panel.add(button);
		panel.setBackground(Color.darkGray);
		
		frame.getContentPane().add(BorderLayout.EAST, panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(250, 200);
		frame.setVisible(true);
	}
}
