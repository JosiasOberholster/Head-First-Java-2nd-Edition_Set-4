package Chapter15;
public class ResourceTwo implements Runnable
{
	public void run()
	{
		go();
	}
	
	public void go()
	{
		for(int a = 100; a < 110; a++)
		{
			System.out.println(a);
		}
	}
}
