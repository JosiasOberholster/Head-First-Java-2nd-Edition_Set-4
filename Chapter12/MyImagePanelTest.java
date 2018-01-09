package Chapter12;
import javax.swing.*;

public class MyImagePanelTest 
{
	public static void main(String[] args)
	{
		MyImagePanel panel = new MyImagePanel();
		JFrame frame = new JFrame();
		
		frame.setContentPane(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}
