package Chapter12;
import javax.swing.*;
import java.awt.*;

public class MyImagePanel extends JPanel
{
	public void paintComponent(Graphics g)
	{
		Image image = new ImageIcon("Catzilla.jpg").getImage();
		g.drawImage(image, 3, 4, this);
	}
}