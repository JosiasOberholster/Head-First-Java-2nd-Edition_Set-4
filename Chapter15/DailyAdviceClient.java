package Chapter15;
import java.io.*;
import java.net.*;

public class DailyAdviceClient 
{
	public static void main(String[] args)
	{
		DailyAdviceClient client = new DailyAdviceClient();
		client.go();
	}
	
	public void go()
	{
		try
		{
			Socket soc = new Socket("10.0.0.12", 4242);
			
			InputStreamReader writer = new InputStreamReader(soc.getInputStream());
			
			BufferedReader reader = new BufferedReader(writer);
			
			String advice = reader.readLine();
			System.out.println("Today you should: " + advice);
			
			reader.close();
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
}
