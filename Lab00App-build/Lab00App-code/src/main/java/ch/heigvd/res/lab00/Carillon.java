package ch.heigvd.res.lab00;

public class Carillon implements IInstrument
{
    private final String SOUND, COLOR;
    private int volume;
    
    public Carillon()
    {
        SOUND = "Dong";
        COLOR = "Brown";
        volume = 10;
    }
    
    @Override
    public String play()
    {
        return SOUND;
    }

    @Override
    public int getSoundVolume() 
    {
        return volume;
    }

    @Override
    public String getColor() 
    {
        return COLOR;
    }
}
