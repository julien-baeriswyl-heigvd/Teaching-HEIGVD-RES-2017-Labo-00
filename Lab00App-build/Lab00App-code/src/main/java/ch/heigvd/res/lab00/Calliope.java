package ch.heigvd.res.lab00;

/**
 * Implementation of Calliope, according to specification CalliopeTest.java.
 * Fixes #366
 * 
 * @author Julien Baeriswyl
 * @since  2017-03-06
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
