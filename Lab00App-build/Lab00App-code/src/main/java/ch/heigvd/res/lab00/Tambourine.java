package ch.heigvd.res.lab00;

/**
 *
 * @author Mathieu Monteverde
 * @author doriane kaffo 
 */
public class Tambourine implements IInstrument {
    
    @Override
    public String play() {
        return "bam";
    }

    @Override
    public int getSoundVolume() {
        return 100;
    }

    @Override
    public String getColor() {
        return "brown";
    }
}
