package Chapter12;
import javax.swing.*;
import java.awt.*;

public class MovingOval
{
	int x = 70;
	int y = 70;
	
	public static void main(String[] args)
	{
		MovingOval mo = new MovingOval();
		mo.doStuff();
	}
	
	public void doStuff()
	{
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyDrawPanelNew drawPanel = new MyDrawPanelNew();
		
		frame.getContentPane().add(drawPanel);
		frame.setSize(500, 500);
		frame.setVisible(true);
		
		for(int i = 0; i < 130; i++)
		{
			x++;
			y = y + 2;
			
			drawPanel.repaint();
			
			try
			{
				Thread.sleep(50);
			}
			catch(Exception ex)
			{
				//no code so "try" won't bug out
			}
		}
		
		for(int b = 130 ; b > 0; b--)
		{
			x++;
			y = y - 2;
			
			drawPanel.repaint();
			
			try
			{
				Thread.sleep(50);
			}
			catch(Exception ex)
			{
				//no code so "try" won't bug out
			}
		}
	}
	
	class MyDrawPanelNew extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			Color cl = new Color(173, 216, 230);
			g.setColor(cl);
			g.fillOval(x, y, 40, 40);
		}
	}
}