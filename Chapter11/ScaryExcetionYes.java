package Chapter11;
public class ScaryExcetionYes
{
	static String test = "Yes";
	
	public static void doRisky(String test) throws ScaryException
	{
		System.out.println("Start Risky");
		
		if("Yes".equals(test))
		{
			throw new ScaryException();
		}
		
		System.out.println("End Risky");
	}
	
	public static void main(String[] args)
	{
		try
		{
			System.out.println("Start Try");
			doRisky(test);
			System.out.println("End Try");
		}
		catch(ScaryException se)
		{
			System.out.println("Scary Exception");
		}
		finally
		{
			System.out.println("Finally");
		}
		
		System.out.println("End Of Try");
	}
}