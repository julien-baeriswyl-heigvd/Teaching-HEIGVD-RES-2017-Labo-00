package ch.heigvd.res.lab00;

public class Castanets implements IInstrument {

	public Castanets() 
	{
		volume = 10;
		sound = "chiki chiki";
		color = "golden";
	}
	
	public int getSoundVolume() 
	{
		return volume;
	}
	
	public String play() 
	{
		return sound;
	}


	public String getColor() {
		return color;
	}
 
	private int volume;
	private String sound;
	private String color;

}
	
