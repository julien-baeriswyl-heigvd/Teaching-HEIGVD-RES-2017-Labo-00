package ch.heigvd.res.lab00;

/**
 * @author Lucas Elisei
 */
public class Conch implements IInstrument {

    @Override
    public String play() {
        return "duuuuh";
    }

    @Override
    public int getSoundVolume() {
        return 42;
    }

    @Override
    public String getColor() {
        return "creamy";
    }
}
