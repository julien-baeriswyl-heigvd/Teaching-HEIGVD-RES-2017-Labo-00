package ch.heigvd.res.lab00;

/**
 *
 * @author : N. Antoine
 */
public class TinWhistle implements IInstrument {

   private int decibel;
   private String sound;
   private String color;

   public TinWhistle() {

      decibel = 65;
      sound = "fluu";
      color = "blue";
   }
   
   @Override
   public String play() {

      return sound;
   }
   
   @Override
   public int getSoundVolume() {

      return decibel;
   }
   
   @Override
   public String getColor() {
      return color;
   }
}
