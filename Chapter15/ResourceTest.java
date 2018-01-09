package Chapter15;
public class ResourceTest 
{
	public static void main(String[] args)
	{
		Runnable runOne = new ResourceOne();
		Runnable runTwo = new ResourceTwo();
		
		Thread tOne = new Thread(runOne);
		Thread tTwo = new Thread(runTwo);
		
		tOne.start();
		
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		
		tTwo.start();
		
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			
		System.out.println("Add me");
	}
}
