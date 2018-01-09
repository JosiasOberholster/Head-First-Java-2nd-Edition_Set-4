package Chapter13;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class TextArea1 implements ActionListener
{
	JTextArea text;
	
	public static void main(String[] args)
	{
		TextArea1 ta1 = new TextArea1();
		ta1.go();
	}
	
	public void go()
	{
		JFrame frame = new JFrame("Text Area One");
		JPanel panel = new JPanel();
		JButton button = new JButton("Just Click It");
		text = new JTextArea(10, 20);
		JScrollPane scroller = new JScrollPane(text);
		
		button.addActionListener(this);
		
		text.setLineWrap(true);
		
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		panel.add(scroller);
		
		frame.getContentPane().add(BorderLayout.CENTER, panel);
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event)
	{
		text.append("Button Clicked \n");
	}
}
