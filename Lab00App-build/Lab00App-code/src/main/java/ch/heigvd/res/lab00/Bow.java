package ch.heigvd.res.lab00;

/**
 * labo00
 * Implementation of class Bow
 * @author Jérémie Zanone
 * @author  Rafidimalala
 */

public class Bow implements IInstrument {
    private String sound = "puet";
    private int volume =  5;
    private String color = "wooden";

    public Bow() {
    }    
    
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

