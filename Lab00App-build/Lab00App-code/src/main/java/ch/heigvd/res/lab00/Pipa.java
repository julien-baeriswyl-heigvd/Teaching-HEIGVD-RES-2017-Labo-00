package ch.heigvd.res.lab00;

public class Pipa {

    private String sound;
    private String color;
    private int soundVolume;

    public Pipa() {
        sound = "ayy";
        color = "golden";
        soundVolume = 100;
    }

    public String play() {
        return sound;
    }

    public String getColor() {
        return color;
    }

    public int getSoundVolume() {
        return soundVolume;
    }
}
