package Chapter11;
import javax.sound.midi.*;

public class MusicTest1Catch
{
	public void play()
	{
		try
		{
			Sequencer sequencer = MidiSystem.getSequencer();
			
			System.out.println("Successfully got a sequencer");
		}
		catch(MidiUnavailableException ex)
		{
			System.out.println("Bummer");
		}
		
	}
	
	public static void main(String[] args)
	{
		MusicTest1Catch mt = new MusicTest1Catch();
		
		mt.play();
	}
}
