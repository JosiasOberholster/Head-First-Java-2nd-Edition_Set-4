package Chapter14;

public class Token 
{
	public static void main(String[] args)
	{
		Token t = new Token();
		t.doStuff();
	}
	
	public void doStuff()
	{
		String toTest = "What is blue + yellow?/Green";
		
		String[] result = toTest.split("/");
		
		for(String token:result)
		{
			System.out.println(token);
		}
	}
}
