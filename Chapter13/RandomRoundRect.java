package Chapter13;
import javax.swing.*;
import java.awt.*;

public class RandomRoundRect extends JPanel
{
	public void paintComponent(Graphics g)
	{
		g.setColor(Color.white);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		int red = (int)(Math.random() * 255);
		int green = (int)(Math.random() * 255);
		int blue = (int)(Math.random() * 255);
		
		g.setColor(new Color(red, green, blue));
		g.fillRoundRect(60, 80, 100, 100, 50, 50);
	}
}