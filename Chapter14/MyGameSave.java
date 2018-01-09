package Chapter14;
import java.io.*;

public class MyGameSave 
{
	public static void main(String[] args)
	{
		MyGame charOne = new MyGame("Warrior", 25, new String[] {"Sword", "Shield"});
		MyGame charTwo = new MyGame("Assassin", 65, new String[] {"Dagger", "Poison", "Trap"});
		MyGame charThree = new MyGame("Orc", 85, new String[] {"Axe", "Battle-Cry"});
		
		try
		{
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("GameSave.ser"));
			
			os.writeObject(charOne);
			os.writeObject(charTwo);
			os.writeObject(charThree);
			
			os.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		charOne = null;
		charTwo = null;
		charThree = null;
		
		try
		{
			ObjectInputStream is = new ObjectInputStream(new FileInputStream("GameSave.ser"));
			
			MyGame slotOne = (MyGame) is.readObject();
			MyGame slotTwo = (MyGame) is.readObject();
			MyGame slotThree = (MyGame) is.readObject();
			
			System.out.println("Slot One:");
			System.out.println(slotOne.getCharType());
			System.out.println("Lv: " + slotOne.getLevel());
			System.out.println("Weapons: " + slotOne.getWeapons());
			System.out.println("");
			
			System.out.println("Slot One:");
			System.out.println(slotTwo.getCharType());
			System.out.println("Lv: " + slotTwo.getLevel());
			System.out.println("Weapons: " + slotTwo.getWeapons());
			System.out.println("");
			
			System.out.println("Slot One:");
			System.out.println(slotThree.getCharType());
			System.out.println("Lv: " + slotThree.getLevel());
			System.out.println("Weapons: " + slotThree.getWeapons());
			System.out.println("");	
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
