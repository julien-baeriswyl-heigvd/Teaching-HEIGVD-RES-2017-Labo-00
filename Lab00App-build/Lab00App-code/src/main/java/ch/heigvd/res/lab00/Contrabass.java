package ch.heigvd.res.lab00;

/**
 * Project : Lab00App-build
 * Author(s) : Antoine Friant
 * Date : 01.03.17
 */
public class Contrabass implements IInstrument {
    public String play() {
        return "dzing";
    }

    @Override
    public int getSoundVolume() {
        return 8;
    }

    @Override
    public String getColor() {
        return "poop brown";
    }

}
