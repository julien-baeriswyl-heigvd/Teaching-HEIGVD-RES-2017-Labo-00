package ch.heigvd.res.lab00;

/**
 * Created by Luca Sivillica on 06.03.17.
 */
public class Banjo implements IInstrument {
    private String sound = "boing";
    private int soundVolume = 15;
    private String color = "green";

    public String play() {
        return sound;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public String getColor() {
        return color;
    }
}
