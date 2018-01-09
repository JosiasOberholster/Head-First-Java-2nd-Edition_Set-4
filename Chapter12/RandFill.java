package Chapter12;
import javax.swing.*;
import java.awt.*;

public class RandFill extends JPanel
{
	public void paintComponent(Graphics g)
	{
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		int red = (int)(Math.random() * 255);
		int green = (int)(Math.random() *255);
		int blue = (int)(Math.random() * 255);
		
		int randPos1 = (int)(Math.random() * 400);
		int randPos2 = (int)(Math.random() * 400);
		
		Color randColor = new Color(red, green, blue);
		g.setColor(randColor);
		g.fillOval(randPos1, randPos2, 100, 100);
	}
}