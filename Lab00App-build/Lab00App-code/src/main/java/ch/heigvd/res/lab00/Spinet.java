package ch.heigvd.res.lab00;

/**
 *
 * @author Christopher Meier
 */
public class Spinet implements IInstrument {
    public String play() {
        return "tang ting ting tang";
    }
    
    public int getSoundVolume() {
        return 10;
    }

    public String getColor() {
        return "green";
    }
    
}
