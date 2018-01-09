package Chapter12;
import javax.swing.*;

public class MyDrawPanelTest 
{
	public static void main(String[] args)
	{
		MyDrawPanel panel = new MyDrawPanel();
		JFrame frame = new JFrame();
		
		frame.setContentPane(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 200);
		frame.setVisible(true);
	}
}
