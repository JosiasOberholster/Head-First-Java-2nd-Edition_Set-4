package Chapter14;
import java.io.*;

public class MyGame implements Serializable
{
	String charType;
	int level;
	String[] weapons;
	
	public MyGame(String ct, int lv, String[] item)
	{
		charType = ct;
		level = lv;
		weapons = item;
	}
	
	public String getCharType()
	{
		return charType;
	}
	
	public int getLevel()
	{
		return level;
	}
	
	public String[] getWeapons()
	{
		String weaponList = "";
		
		for(int i = 0; i < weapons.length; i++)
		{
			weaponList += weapons[i];
		}
		
		return weapons;
	}
}

