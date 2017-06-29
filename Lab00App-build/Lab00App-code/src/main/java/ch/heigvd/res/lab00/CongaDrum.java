package ch.heigvd.res.lab00;

public class CongaDrum implements IInstrument {
    public String play() {
        return "dum";
    }

    public int getSoundVolume() {
        return 42;
    }

    public String getColor() {
        return "a nice shade of oak and ocelot leather";
    }
}
