package Chapter15;
public class MyRunnableNewTest 
{
	public static void main(String[] args)
	{
		Runnable run = new MyRunnableNew();
		Thread thread = new Thread(run);
		
		thread.start();
		
		System.out.println("I'm not in the thread!");
	}
}
