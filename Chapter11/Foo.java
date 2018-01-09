package Chapter11;
public class Foo
{
	public void go()
	{
		Laundry laundry = new Laundry();
		
		try
		{
			laundry.doLaundry();		
		}
		catch(PantsException pex)
		{
			//Add Some 
		}
		catch(LingerieException lex)
		{
			//Add Some 
		}
	}
}