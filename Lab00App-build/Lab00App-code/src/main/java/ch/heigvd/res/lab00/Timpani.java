package ch.heigvd.res.lab00;
/**
 *
 * @author zacharie nguefack
 * fixed by Abass MAHDAVI
 */
public class Timpani implements IInstrument {
    
    private String sound  = "doom";
    private int    volume = 11;
    private String color  = "transparent";
    
    public String play(){
        return sound;
    }
     public int getSoundVolume(){
        return volume;
     }
     
     public String getColor(){
         return this.color;
     }
    
}
