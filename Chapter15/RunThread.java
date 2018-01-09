package Chapter15;
public class RunThread implements Runnable
{
	public static void main(String[] args)
	{
		Runnable run = new RunThread();
		
		Thread alpha = new Thread(run);
		Thread beta = new Thread(run);
		
		alpha.setName("Aplha ");
		beta.setName("Beta ");
		
		alpha.start();
		beta.start();
	}
	
	public void run()
	{
		for(int i = 0; i < 6; i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
				
			String name = Thread.currentThread(). getName();			
			System.out.println(name + "is running!");
		}
	}
}
