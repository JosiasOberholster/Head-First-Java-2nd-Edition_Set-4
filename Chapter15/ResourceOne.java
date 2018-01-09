package Chapter15;
public class ResourceOne implements Runnable
{
	public void run()
	{
		go();
	}
	
	public void go()
	{
		doStuff();
	}
	
	public void doStuff()
	{
		for(int i = 0; i < 10; i++)
		{
			System.out.println(i);
		}
	}
}
