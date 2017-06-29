package ch.heigvd.res.lab00;

/**
 * Created by Julien Brêchet on 06.03.2017.
	Fix issue #329.
 */
public class Celesta implements IInstrument {
    public String play() {
        return "gling";
    }
    public int getSoundVolume() {
        return 4;
    }
    public String getColor() { return "black"; }
}
