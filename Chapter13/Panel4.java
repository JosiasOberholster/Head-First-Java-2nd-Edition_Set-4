package Chapter13;
import javax.swing.*;
import java.awt.*;

public class Panel4 
{
	public static void main(String[] args)
	{
		Panel4 p4 = new Panel4();
		p4.go();
	}
	
	public void go()
	{
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button1 = new JButton("Button One");
		JButton button2 = new JButton("Button Two");
		JButton button3 = new JButton("Button Three");
		
		panel.setBackground(Color.darkGray);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		
		frame.getContentPane().add(BorderLayout.EAST, panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(250, 200);
		frame.setVisible(true);
	}
}
