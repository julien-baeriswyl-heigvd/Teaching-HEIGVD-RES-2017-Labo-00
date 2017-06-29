package ch.heigvd.res.lab00;


public class Cello implements IInstrument {

    private String sound ;
    private String color ;
    private int volume ;

    public Cello () {
        this.sound = "boum boum" ;
        this.color = "wooden" ;
        this.volume = 40 ;
    }

    public String play () {return sound ;}
    public String getColor () {return color ;}
    public int getSoundVolume() {return volume ;}
}