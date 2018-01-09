package Chapter14;
import java.io.*;

public class WriteAFile 
{
	public static void main(String[] args)
	{
		try
		{
			FileWriter write = new FileWriter("Foo.txt");
			write.write("Hello Foo!!!");
			write.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
