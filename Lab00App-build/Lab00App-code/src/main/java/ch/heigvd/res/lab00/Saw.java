
package ch.heigvd.res.lab00;

/**
 *
 * @author abass
 */
public class Saw implements IInstrument{
    
    private String sound = "woui";
    private String color = "brown";
    private int volume   = 7;
    
    @Override
    public String play(){
        return sound;
    }
    
    @Override
    public int getSoundVolume(){
        return volume;
    }
    
    @Override
    public String getColor(){
        return color;
    }
}
