package Chapter12;
import javax.swing.*;
import java.awt.*;

public class SimpleAnimation 
{
	int x = 45;
	int y = 45;
	
	public static void main(String[] args)
	{
		SimpleAnimation sa = new SimpleAnimation();
		sa.doStuff();
	}
	
	public void doStuff()
	{
		JFrame frame = new JFrame();
		MyOval my = new MyOval();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(my);
		frame.setSize(300, 300);
		frame.setVisible(true);
		
		for(int i = 0; i < 130; i++)
		{
			x++;
			y++;
			
			my.repaint();
			
			try
			{
				Thread.sleep(50);
			}
			catch(Exception ex)
			{}
		}
	}
	
	public class MyOval extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			g.setColor(Color.white);
			g.fillRect(0, 0, this.getWidth(), this.getHeight());
			
			g.setColor(Color.red);
			g.fillOval(x, y, 50, 50);
		}
	}
}
