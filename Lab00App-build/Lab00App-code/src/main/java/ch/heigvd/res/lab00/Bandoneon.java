
package ch.heigvd.res.lab00;


public class Bandoneon implements IInstrument {
    @Override
    public String play(){
        return "coin";
    }
    @Override
    public int getSoundVolume(){
        return 7;
    }
    @Override
    public String getColor(){
        return "red";
    }
}
