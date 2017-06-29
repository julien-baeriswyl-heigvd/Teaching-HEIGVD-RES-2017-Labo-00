package ch.heigvd.res.lab00;

/** 
* @author David Truan
* 
* @author doriane kaffo 
*/

public class Bassoon implements IInstrument{
        @Override
	public String play() {
		return "bassoon"; 
	}
	
        @Override
	public int getSoundVolume() {
		return 9001;
	}
	
        @Override
	public String getColor() {
		return "red but a little purple too";
        }
}