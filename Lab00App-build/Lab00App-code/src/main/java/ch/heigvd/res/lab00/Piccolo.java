package ch.heigvd.res.lab00;

/**
 *
 * @author Gabriel Luthier
 */
public class Piccolo implements IInstrument {

    @Override
    public String play() {
        return "fufu";
    }

    @Override
    public int getSoundVolume() {
        return 4;
    }

    @Override
    public String getColor() {
        return "gold";
    }
    
}
