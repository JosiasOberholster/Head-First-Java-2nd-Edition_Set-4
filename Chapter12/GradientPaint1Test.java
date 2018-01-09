package Chapter12;
import javax.swing.*;

public class GradientPaint1Test 
{
	public static void main(String[] args)
	{
		GradientPaint1 paint = new GradientPaint1();
		JFrame frame = new JFrame();
		
		frame.setContentPane(paint);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}
