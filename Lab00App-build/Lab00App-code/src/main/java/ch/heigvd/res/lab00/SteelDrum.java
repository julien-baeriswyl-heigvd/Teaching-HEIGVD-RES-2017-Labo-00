package ch.heigvd.res.lab00;

/**
 *
 * @author lognaume
 */
public class SteelDrum implements IInstrument {

    @Override
    public String play() {
        return "drum-drum";
    }

    @Override
    public int getSoundVolume() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getColor() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
