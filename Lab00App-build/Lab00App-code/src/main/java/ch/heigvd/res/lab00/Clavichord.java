
package ch.heigvd.res.lab00;

/**
 * @author Ludovic Delafontaine
 */
public class Clavichord implements IInstrument {
    
    private String sound;
    private String color;
    private int volume;
    
    public Clavichord() {
        this("ting", "brown", 10);
    }

    public Clavichord(String sound, String color, int volume) {
        this.sound = sound;
        this.color = color;
        this.volume = volume;
    }

    public String play() {
        return sound;
    }
    
    public int getSoundVolume() {
        return volume;
    }
    
    public String getColor() {
        return color;
    }
  
}
