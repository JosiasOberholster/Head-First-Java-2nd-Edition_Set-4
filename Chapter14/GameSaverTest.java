package Chapter14;
import java.io.*;

public class GameSaverTest
{
	public static void main(String[] args)
	{
		GameCharacter one = new GameCharacter(50, "Elf", new String[] {"Bow", "Sword", "Dust"});
		GameCharacter two = new GameCharacter(200, "Troll", new String[] {"Bare-Hands", "Big Axe"});
		GameCharacter three = new GameCharacter(120, "Magician", new String[] {"Spells", "Invisibility"});
		
		try
		{
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("MyGame.ser"));
			
			os.writeObject(one);
			os.writeObject(two);
			os.writeObject(three);
			
			os.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		one = null;
		two = null;
		three = null;
		
		try
		{
			ObjectInputStream is = new ObjectInputStream(new FileInputStream("Game.ser"));
			
			GameCharacter oneRestore = (GameCharacter) is.readObject();
			GameCharacter twoRestore = (GameCharacter) is.readObject();
			GameCharacter threeRestore = (GameCharacter) is.readObject();
			
			System.out.println("One's Info :");
			System.out.println("Type: " + oneRestore.getType());
			System.out.println("Lv: " + oneRestore.getPower());
			System.out.println("");
			
			System.out.println("Two's Info:");
			System.out.println("Type: " + twoRestore.getType());
			System.out.println("Lv: " + twoRestore.getPower());
			System.out.println("");
			
			System.out.println("Three's Info:");
			System.out.println("Type: " + threeRestore.getType());
			System.out.println("Lv: " + threeRestore.getPower());
			
			//Info on weapons still needs some coding	
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}