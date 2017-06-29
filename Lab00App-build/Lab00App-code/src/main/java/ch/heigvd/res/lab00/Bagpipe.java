/**
 * 
 * @author ludovic richard
 * 
 */
package ch.heigvd.res.lab00;

public class Bagpipe implements IInstrument {
    
    private String sound = "tuiiitwuiututitui";
    private String color = "red";
    private int volume = 8;
    
    public String play(){
        return this.sound;
    }
    
    public int getSoundVolume(){
        return volume;
    }
    
    public String getColor(){
        return this.color;
    }    
}