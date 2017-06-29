package ch.heigvd.res.lab00;


public class BaritoneHorn implements IInstrument {


	@Override
    public String getColor() {
        return "golden";
    }
	
    @Override
    public String play() {
        return "concertina";
    }

    @Override
    public int getSoundVolume() {
        return 50;
    }

}

