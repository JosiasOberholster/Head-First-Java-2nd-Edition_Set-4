package Chapter11;
public class Math
{
	public void num(int x, int y) throws ArithmeticException
	{
		if(y == 0)
		{
			throw new ArithmeticException("Can't devide by 0");
		}
		else
		{
			System.out.println(x/y);
		}
	}
}