package ch.heigvd.res.lab00;

/**
 * @author zeller quentin qrzeller
 * @author  Rafidimalala
 */

public class  Bugle implements IInstrument{
    private String sound = "pouetpouet";
    private int volume =  20;
    private String color = "Shine like a diamond";
    
    @Override
    public String play() {
        return sound;
    }   

    @Override
    public String getColor(){
        return color;
    }
    
    @Override
    public int getSoundVolume(){
        return volume;
    }

}
