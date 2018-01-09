package Chapter12;
public class MyOuter 
{
	private int x;
	
	MyInner inner = new MyInner();
	
	public void doStuff()
	{
		inner.go();
	}
	
	class MyInner
	{
		void go()
		{
			x = 42;
			System.out.println(x);
		}
	}
}
