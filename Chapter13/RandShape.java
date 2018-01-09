package Chapter13;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class RandShape implements ActionListener
{
	JFrame frame;
	JPanel panel;
	JButton button1, button2, button3, button4;
	JLabel label;
	
	public static void main(String[] args)
	{
		RandShape rs = new RandShape();
		rs.doStuff();
	}
	
	public void doStuff()
	{
		frame = new JFrame("Random Color Generator");
		panel = new JPanel();
		label = new JLabel(" " + " Click on any shape for that shape in a random color");
		button1 = new JButton("Oval");
		button2 = new JButton("Rectangle");
		button3 = new JButton("RoundRec");
		button4 = new JButton("Random");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button1.addActionListener(new rOval());
		button2.addActionListener(new rRect());
		button3.addActionListener(new rRoundRect());
		button4.addActionListener(new rOval());
		button4.addActionListener(new rRect());
		button4.addActionListener(new rRoundRect());
		
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		
		panel.setBackground(Color.darkGray);
		
		frame.getContentPane().add(BorderLayout.EAST, panel);
		frame.getContentPane().add(BorderLayout.SOUTH, label);
		frame.setSize(320, 320);
		frame.setVisible(true);
	}
	
	public class rOval implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			RandOval ro = new RandOval();
			
			frame.getContentPane().add(BorderLayout.CENTER, ro);
			frame.setSize(320, 320);
			frame.setVisible(true);
		}
		
	}
	
	public class rRect implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			RandRect rr = new RandRect();
			
			frame.getContentPane().add(BorderLayout.CENTER, rr);
			frame.setSize(320, 320);
			frame.setVisible(true);
		}
	}
	
	public class rRoundRect implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			RandomRoundRect rrrect = new RandomRoundRect();
			
			frame.getContentPane().add(BorderLayout.CENTER, rrrect);
			frame.setSize(320, 320);
			frame.setVisible(true);
		}
		
	}
	
	public void actionPerformed(ActionEvent event)
	{
		
	}
}