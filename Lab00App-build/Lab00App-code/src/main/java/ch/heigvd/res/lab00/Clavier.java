package ch.heigvd.res.lab00;

/**
 *
 * @author Adrian
 */
public class Clavier implements IInstrument {

    private String sound;
    private int volume;
    private String color;
    
    public Clavier(){
        sound = "dayyyn";
        volume = 30;
        color = "ivory";
    }
    
    @Override
    public String play() {
        return sound;
    }

    @Override
    public int getSoundVolume() {
        return volume;
    }

    @Override
    public String getColor() {
        return color;
    }
    
}
