package Chapter11;
public class TestExceptionsNo
{
	static String test = "No";
	
	public static void doRisky(String test) throws ScaryException
	{
		System.out.println("Start Riksy");
		
		if("Yes".equals(test))
		{
			throw new ScaryException();
		}
		
		System.out.println("End Risky");
		return;
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
		System.out.println("End Of Main");
	}
}