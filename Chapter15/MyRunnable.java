package Chapter15;
public class MyRunnable implements Runnable
{
	public void run()
	{
		go();
	}
	
	public void go()
	{
		doMore();
	}
	
	public void doMore()
	{
		System.out.println("Top of the stack!");
	}
}
