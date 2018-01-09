package Chapter12;
public class AccessingInnerClass 
{
	public static void main(String[] args)
	{
		MyOuter outerObj = new MyOuter();
		MyOuter.MyInner innerObj = outerObj.new MyInner();
	}
}
