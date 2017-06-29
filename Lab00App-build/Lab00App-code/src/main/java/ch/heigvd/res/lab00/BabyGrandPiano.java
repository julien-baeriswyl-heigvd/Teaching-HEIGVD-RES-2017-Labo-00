package ch.heigvd.res.lab00;


public class BabyGrandPiano implements IInstrument{

    @Override
    public String play() {
        return "Tada";
    }

    @Override
    public int getSoundVolume() {
        return 4;
    }

    @Override
    public String getColor() {
        return "brown";
    }
    
}
