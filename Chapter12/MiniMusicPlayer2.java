package Chapter12;
import javax.sound.midi.*;

public class MiniMusicPlayer2 implements ControllerEventListener
{
	int a;
	String note = " Note ";
	
	public static void main(String[] args)
	{
		MiniMusicPlayer2 mini = new MiniMusicPlayer2();
		mini.go();
	}
	
	public void go()
	{
		try
		{
			Sequencer sequencer = MidiSystem.getSequencer();
			sequencer.open();
			
			int[] eventsIWant = {127};
			sequencer.addControllerEventListener(this, eventsIWant);
			
			Sequence seq = new Sequence(Sequence.PPQ, 4);
			Track track = seq.createTrack();
			
			for(int i = 5; i < 60; i += 4)
			{
				track.add(makeEvent(144, 1, i , 100, i));
				track.add(makeEvent(176, 1, 127, 0, i));
				track.add(makeEvent(128, 1, i, 100, 1 + 2));
			}
			
			sequencer.setSequence(seq);
			sequencer.setTempoInBPM(220);
			sequencer.start();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	public void controlChange(ShortMessage event)
	{
		a++;
		
		if(a > 1)
		{
			note = " Notes ";
		}
		
		System.out.println(a + note + "Played");
	}
	
	public MidiEvent makeEvent(int comd, int chan, int one, int two, int tick)
	{
		MidiEvent event = null;
		
		try
		{
			ShortMessage a = new ShortMessage();
			
			a.setMessage(comd, chan, one, two);
			event = new MidiEvent(a, tick);
		}
		catch(Exception ex)
		{
			//No code needed
		}
		return event;
	}
}
