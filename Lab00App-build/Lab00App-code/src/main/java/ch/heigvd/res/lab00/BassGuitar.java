package ch.heigvd.res.lab00;

/**
 * 
 * @author Rafidimalala
 */
public class BassGuitar implements IInstrument {
    private String sound = "Dum Tudum Tudum Tudum Dum Dum !";
    private int volume =  5;
    private String color = "brown";
    
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
