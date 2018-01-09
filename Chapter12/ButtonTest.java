package Chapter12;
import javax.swing.*;
import java.awt.event.*;

public class ButtonTest implements ActionListener
{
	JFrame frame = new JFrame();
	JButton button;
	
	public void doButton()
	{		
		button = new JButton("Don't Click Me!");
		
		button.addActionListener(this);
		
		frame.setContentPane(button);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event)
	{
		button.setText("I've Been Clicked");
		frame.setSize(500, 200);
	}
	
	public static void main(String[ ] args)
	{
		ButtonTest button = new ButtonTest();
		button.doButton();
	}
}
