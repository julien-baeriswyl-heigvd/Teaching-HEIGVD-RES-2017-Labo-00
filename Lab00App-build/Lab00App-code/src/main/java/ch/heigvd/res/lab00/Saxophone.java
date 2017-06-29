package ch.heigvd.res.lab00;

/**
 * @author McMoudi
 */
public class Saxophone implements IInstrument{

    private String sound;
    private int volume;
    private String color;

    private Saxophone(String sound, int volume, String color) {
        this.sound = sound;
        this.volume = volume;
        this.color = color;
    }

    public Saxophone() {
        this("PouetPouet",12,"golden");
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

