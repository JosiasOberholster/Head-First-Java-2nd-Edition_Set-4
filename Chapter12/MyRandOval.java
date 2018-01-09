package Chapter12;
import javax.swing.*;
import java.awt.*;

public class MyRandOval extends JPanel
{
	public void paintComponent(Graphics g)
	{
		g.setColor(Color.white);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		int red = (int)(Math.random() * 255);
		int green = (int)(Math.random() * 255);
		int blue = (int)(Math.random() * 255);
		
		Color col = new Color(red, green, blue);
		
		g.setColor(col);
		g.fillOval(120, 220, 100, 100);
	}
}
