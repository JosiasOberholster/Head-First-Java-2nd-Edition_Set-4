package Chapter12;
import javax.swing.*;

public class RandFillTest
{
	public static void main(String[] args)
	{
		RandFill fill = new RandFill();
		JFrame frame = new JFrame();
		
		frame.getContentPane().add(fill);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 600);
		frame.setVisible(true);
	}
}
