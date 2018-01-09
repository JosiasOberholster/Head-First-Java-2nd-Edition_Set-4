package Chapter12;
import javax.swing.*;
import java.awt.*;

public class GradientPaint2 extends JPanel
{
	public void paintComponent(Graphics g)
	{
		Graphics2D g2d = (Graphics2D) g;
		
		int sRed = (int)(Math.random() * 255);
		int sGreen = (int)(Math.random() * 255);
		int sBlue = (int)(Math.random() * 255);
		Color startColor = new Color(sRed, sGreen, sBlue);
		
		int eRed = (int)(Math.random() * 255);
		int eGreen = (int)(Math.random() * 255);	
		int eBlue = (int)(Math.random() * 255);
		Color endColor = new Color(eRed, eGreen, eBlue);
		
		GradientPaint gradient = new GradientPaint(70, 70, startColor, 150, 150, endColor);
		g2d.setPaint(gradient);
		g2d.fillOval(70, 70, 100, 100);
	}
}
