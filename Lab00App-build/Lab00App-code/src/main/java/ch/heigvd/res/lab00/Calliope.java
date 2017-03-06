package ch.heigvd.res.lab00;

/**
 * @author Julien Baeriswyl
 */
public class Calliope implements IInstrument
{
    public static final int    SOUND_VOLUME = 120;
    public static final String SOUND_NAME   = "ziw";
    public static final String COLOR        = "copper";
    
    public int getSoundVolume ()
    {
        return SOUND_VOLUME;
    }
    
    public String getColor ()
    {
        return COLOR;
    }
    
    public String play ()
    {
        return SOUND_NAME;
    }
}
