package ch.heigvd.res.lab00;

public class ThumbPiano implements IInstrument {
   private String sound;

   public ThumbPiano() {
      sound = "cling";
   }
    @Override
    public String getColor(){
       return "black";
    }
    @Override
    public int getSoundVolume(){
       return 7;
    }

    @Override
    public String play() {
       return sound;
    }
}