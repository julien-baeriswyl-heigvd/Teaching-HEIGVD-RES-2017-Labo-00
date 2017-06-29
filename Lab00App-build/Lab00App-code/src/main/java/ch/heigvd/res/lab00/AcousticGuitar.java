package ch.heigvd.res.lab00;

/**
 *
 * @author Arthur Passuello 
 */
public class AcousticGuitar implements IInstrument
{
    private String color = "brown", sound = "tzwing";
    private int volume = 30;
    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String play() {
       return sound;
    }

    @Override
    public int getSoundVolume() {
        return volume;
    }
    
}
