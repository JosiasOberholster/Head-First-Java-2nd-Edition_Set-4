package Chapter13;
import javax.swing.*;
import java.awt.*;


public class Panel5 
{
	public static void main(String[] args)
	{
		Panel5 p5 = new Panel5();
		p5.go();
	}
	
	public void go()
	{
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button1 = new JButton("Shock Me");
		JButton button2 = new JButton();
		JButton button3 = new JButton("Bliss");
		
		panel.setBackground(Color.darkGray);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		
		frame.getContentPane().add(BorderLayout.EAST, panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(250, 200);
		frame.setVisible(true);
		
	}
}
