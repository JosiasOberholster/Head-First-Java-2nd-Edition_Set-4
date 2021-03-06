package Chapter12;
import javax.swing.*;
import java.awt.*;

public class RandColorScheme extends JPanel
{
	public void paintComponent(Graphics g)
	{
		JButton button = new JButton();
		
		button.setText("");
		
		int red = (int)(Math.random() * 255);
		int green = (int)(Math.random()* 255);
		int blue = (int)(Math.random() * 255);
		
		Color randColor = new Color(red, green, blue);
		
		g.setColor(randColor);
		g.fillOval(85, 65, 100, 100);
	}
}
