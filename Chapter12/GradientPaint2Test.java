package Chapter12;
import javax.swing.*;

public class GradientPaint2Test 
{
	public static void main(String[] args)
	{
		GradientPaint2 grad = new GradientPaint2();
		JFrame frame = new JFrame();
		
		frame.setContentPane(grad);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(285, 285);
		frame.setVisible(true);
	}
}
