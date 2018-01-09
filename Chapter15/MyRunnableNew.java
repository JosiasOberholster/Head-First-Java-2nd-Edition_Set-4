package Chapter15;
public class MyRunnableNew implements Runnable
{
	public void run()
	{
		go();
	}
	
	public void go()
	{
		int rand = (int)(Math.random() * 2000);
		
		try
		{
			Thread.sleep(rand);
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		
		doStuff();
	}
	
	public void doStuff()
	{
		System.out.println("Finnaly I get to run!");
	}
}
