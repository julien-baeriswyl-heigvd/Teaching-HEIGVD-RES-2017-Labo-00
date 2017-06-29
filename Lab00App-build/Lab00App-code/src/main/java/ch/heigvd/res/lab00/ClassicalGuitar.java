package ch.heigvd.res.lab00;

/**
 * @author Tony Clavien
 */
public class ClassicalGuitar implements IInstrument {
    
	@Override
    public String play() {
        return "dwing";
    }
    
	@Override
    public int getSoundVolume() {
        return 7;
    }
    
	@Override
    public String getColor() {
        return "black";
    }
}