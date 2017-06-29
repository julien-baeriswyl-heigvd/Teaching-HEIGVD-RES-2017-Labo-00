package ch.heigvd.res.lab00;

public class Balalaika implements IInstrument {

    public int volume;
    public String color;
    public String sound;

    public Balalaika() {
        this(2, "brown", "dling");
    }

    public Balalaika(int volume, String color, String sound) {
        this.volume = volume;
        this.color = color;
        this.sound = sound;
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
