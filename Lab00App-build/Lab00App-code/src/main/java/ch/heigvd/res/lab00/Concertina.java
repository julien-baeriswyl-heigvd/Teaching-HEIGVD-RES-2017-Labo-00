package ch.heigvd.res.lab00;

/**
 *
 * @author annie
 */
public class Concertina implements IInstrument {
   
  
  public String play() {
    return "Djulidou";
  }
   public int getSoundVolume(){
		return sound;
   }
   public String getColor(){
		return color;
   }
   private int sound=4;
   private String color = "blue";
}
