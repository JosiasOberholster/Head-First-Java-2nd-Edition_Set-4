package Chapter11;
import javax.sound.midi.*;


public class MusicTest1 
{
	public void play1() throws MidiUnavailableException
	{
		Sequencer sequencer = MidiSystem.getSequencer();
		
		System.out.println("We got a sequencer");
	}
	
	public static void main(String[] args) throws MidiUnavailableException
	{
		MusicTest1 mt = new MusicTest1();
		
		mt.play1();
	}
}
//IGNORE THIS CLASS