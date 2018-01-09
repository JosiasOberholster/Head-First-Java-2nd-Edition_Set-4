package Chapter11;
public class OvenWork extends Oven
{
	public static void main(String[] args)
	{
		Oven func = new Oven();
		try
		{
			func.turnOvenOn();
			func.bake();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			func.turnOvenOff();
		}
	}
}