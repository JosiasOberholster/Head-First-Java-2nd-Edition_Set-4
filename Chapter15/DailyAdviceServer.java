package Chapter15;
import java.io.*;
import java.net.*;

public class DailyAdviceServer 
{
	String[] adviceList = {"Take smaller bites", "Go for the tight jeans, no they do not make you lokk fat", "One word: inapropriate", 
			               "Just for today, be honest. Tell you boss what you 'really' think", "You might want to rethink that haircut"};
	
	public static void main(String[] args)
	{
		DailyAdviceServer server = new DailyAdviceServer();
		server.go();
	}
	
	public String getAdvice()
	{
		int random = (int)(Math.random() * adviceList.length);
		return adviceList[random];
	}
	
	public void go()
	{
		try
		{
			ServerSocket serverSocket = new ServerSocket(4242);
			
			while(true)
			{
				Socket sock = serverSocket.accept();
				
				PrintWriter writer = new PrintWriter(sock.getOutputStream());
				String advice = getAdvice();
				writer.println(writer);
				writer.close();
				
				System.out.println(advice);
			}
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
}
