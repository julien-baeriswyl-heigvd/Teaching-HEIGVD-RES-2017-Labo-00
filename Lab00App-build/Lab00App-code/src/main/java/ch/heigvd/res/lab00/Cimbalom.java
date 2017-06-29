package ch.heigvd.res.lab00;

/**
 *
 * @author Basile Chatillon
 */
public class Cimbalom implements IInstrument {
    public String play(){
        return "zoooooomm";
    }
    public int getSoundVolume(){
        return 20;
    }
    public String getColor(){
        return "wood";
    }
}
