package Chapter15;
public class TestSync implements Runnable
{
	private int balance;
	
	public void run()
	{
		for(int i = 0; i < 50; i++)
		{
			increment();
			
			System.out.println("");
			System.out.println("Balance is " + balance);
			System.out.println("");
		}
	}
	
	public synchronized void increment()
	{
		System.out.println(Thread.currentThread().getName() + " adds");
		
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		
		int i = balance;
		balance = i + 1;
	}
	
	public static void main(String[] args)
	{
		TestSync job = new TestSync();
		
		Thread a = new Thread(job);
		Thread b = new Thread(job);
		
		a.setName("A");
		b.setName("B");
		
		a.start();
		b.start();
	}
}
